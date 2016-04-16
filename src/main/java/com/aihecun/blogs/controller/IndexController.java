package com.aihecun.blogs.controller;

import com.aihecun.blogs.controller.flowController.ASURList;
import com.aihecun.blogs.controller.flowController.ArticleSectionUserR;
import com.aihecun.blogs.model.User;
import com.aihecun.blogs.model.siteModel.Navigation;
import com.aihecun.blogs.service.ArticleService;
import com.aihecun.blogs.service.UserService;
import com.aihecun.blogs.service.siteService.NavigationService;
import com.aihecun.blogs.util.JacksonUtil;
import com.aihecun.blogs.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.org.mozilla.javascript.internal.NativeArray;
import sun.swing.BakedArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/")
public class IndexController {

	@Autowired
	NavigationService navigationService;

	@Autowired
	UserService userService;

	@Autowired
	ArticleService articleService;

	@Autowired
	ArticleSectionUserR articleSectionUserR;


//	@RequestMapping("loginStatus")
//	produces = "application/json;charset=utf-8"
	@RequestMapping(value = "loginStatus", /*method = RequestMethod.POST,*/ produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String loginStatus(HttpServletRequest request){

		class LoginStatus{
			private String value01;
			private String value02;
			private String url01;
			private String url02;
			private boolean status;


			public LoginStatus(String value01, String value02, String url01, String url02, boolean status) {
				this.value01 = value01;
				this.value02 = value02;
				this.url01 = url01;
				this.url02 = url02;
				this.status = status;
			}

			public LoginStatus(){}

			public String getValue01() {
				return value01;
			}

			public void setValue01(String value01) {
				this.value01 = value01;
			}

			public String getValue02() {
				return value02;
			}

			public void setValue02(String value02) {
				this.value02 = value02;
			}

			public String getUrl01() {
				return url01;
			}

			public void setUrl01(String url01) {
				this.url01 = url01;
			}

			public String getUrl02() {
				return url02;
			}

			public void setUrl02(String url02) {
				this.url02 = url02;
			}

			public boolean isStatus() {
				return status;
			}

			public void setStatus(boolean status) {
				this.status = status;
			}
		}

		User user = SessionUtil.getUser(request);
		LoginStatus loginStatus = new LoginStatus();

		try {
		if (user != null) {
			loginStatus.setStatus(true);
			loginStatus.setValue01("Hi,欢迎 " + user.getUserName() + " 光临!");
			loginStatus.setUrl01("/access/userinfo");
			loginStatus.setValue02("退出登录");
			loginStatus.setUrl02("/access/logout");

			return JacksonUtil.toJson(loginStatus);



		} else
			return JacksonUtil.toJson(new LoginStatus(null, null,null,null,false));
		}catch (Exception ex){
			ex.printStackTrace();
		}

		return JacksonUtil.toJson(new LoginStatus(null, null,null,null,false));
	}

	@RequestMapping(value = "navigation"/*, method = RequestMethod.POST*/)
	@ResponseBody
	public String navigation(){

		class Navi{
			String name;
			String url;
			public Navi(String name, String url){
				this.name = name;
				this.url = url;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getUrl() {
				return url;
			}

			public void setUrl(String url) {
				this.url = url;
			}
		}

		List<Navi> navis = new ArrayList();
		try{
			List<Navigation> navigation = navigationService.getAllNavigation();
			if (navigation != null) {
				for (Navigation n : navigation)
				     navis.add(new Navi(n.getNavigationName(), n.getUrl()));
				return JacksonUtil.toJson(navis);
			}

			else return JacksonUtil.toJson(null);

		}catch (Exception ex){

			ex.printStackTrace();
		}

		return JacksonUtil.toJson(null);
	}


	@RequestMapping(method = RequestMethod.GET)
	public String index(HttpServletRequest request, ModelMap model) {
		if (articleService == null)
			System.out.println("index(...): articleService is null");

		User user = SessionUtil.getUser(request);
		String loginStatus = "<li><a href=\"/access/register\">注 册</a></li>\n" +
				             "<li><a href=\"#loginmodal\" id=\"modaltrigger\">登 陆</a></li>";
		if (user != null)
			loginStatus = "<li><a href=\"/access/logout\">退出登录</a></li>" +
					      "<li><a href=\"/\">hi,"+ user.getUserName() +"! 欢迎光临</a></li>\n";

		System.out.println(loginStatus);

		model.addAttribute("loginStatus", loginStatus);


		String navi = "";
		try{
			List<Navigation> navigations = navigationService.getAllNavigation();
			if (navigations != null)
				for (Navigation n : navigations)
					navi += "<li><a href=\"" +
							n.getUrl() +"\">" +
							n.getNavigationName() + "</a></li>\n";

			model.addAttribute("navigation", navi);

		}catch (Exception ex){

			ex.printStackTrace();
		}

		try {

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String whereStr = "\"timeCreated\" > '" +
					dateFormat.format(new Date(new Date().getTime() - 5*24*60*60*1000)) +
					"' ORDER BY \"timeCreated\" DESC";

			articleSectionUserR.SetRelationship(whereStr);
			List<ASURList> ASURLists = articleSectionUserR.getASURLists();

			String htmlInfo = "";

			if (ASURLists != null){

				for (ASURList ASURList : ASURLists) {

					String pTitle1 = /*"<p class=\"meta\">\n" +*/
							"<p><span class=\"links\">\n" +
							"<a href=\"#\" title=\"\">标题：&nbsp;" + ASURList.getArticle().getTitle() +
							"</a>\n</span>\n<!--</p>--><br>" +
							"\n<span class=\"author\">\n" +
							"<a href=\"#\">作者：&nbsp;"+ ASURList.getUser().getUserName() +
							"</a>\n</span><span class=\"date\"> &nbsp;日期：&nbsp;" +
							ASURList.getArticle().getTimeCreated().toString() +
							"</span></p>";


					String pSection1 = "<div class=\"entry\">\n<p>" +
							ASURList.getSections().get(0).getContents().toString().substring(0, 100) +
							"... ...</p></div>";

					htmlInfo += pTitle1 + pSection1;
					//pSection += pSection1;

				}
			}

			model.addAttribute("newArticles", htmlInfo);

			htmlInfo = "";

			whereStr = "\"countComment\" > 10 ORDER BY \"countComment\" DESC";

			articleSectionUserR.SetRelationship(whereStr);
			ASURLists = articleSectionUserR.getASURLists();

			if (ASURLists != null){

				for (ASURList ASURList : ASURLists) {

					String pTitle1 = /*"<p class=\"meta\">\n" +*/
							"<p><span class=\"links\">\n" +
									"<a href=\"#\" title=\"\">标题：&nbsp;" + ASURList.getArticle().getTitle() +
									"</a>\n</span>\n<!--</p>--><br>" +
									"\n<span class=\"author\">\n" +
									"<a href=\"#\">作者：&nbsp;"+ ASURList.getUser().getUserName() +
									"</a>\n</span><span class=\"date\"> &nbsp;日期：&nbsp;" +
									ASURList.getArticle().getTimeCreated().toString() +
									"</span></p>";

					String pSection1 = "<div class=\"entry\">\n<p>" +
							ASURList.getSections().get(0).getContents().toString().substring(0, 100) +
							"&nbsp;......&nbsp;......</p></div>";

					htmlInfo += pTitle1 + pSection1;
					//pSection += pSection1;

				}
			}

			model.addAttribute("hotArticles", htmlInfo);

		}catch (Exception ex){

			ex.printStackTrace();
		}

		return "index";
	}

	@RequestMapping("access/login")
	public String login(HttpServletRequest request, ModelMap modelMap){

		User user;

		user = SessionUtil.getUser(request);
		if (user !=null)
			index(request, modelMap);

		String userNo = request.getParameter("userno");
		String password = request.getParameter("password");

		System.out.println("====> login\nuserNo: " + userNo + "\npassword: " + password);

		try {

			user = userService.login(userNo, password);

			if (user != null)
				SessionUtil.setUser(request, user);
			else
				return "errors/404";

		}catch (Exception e){

		}

		return  index(request, modelMap);
	}


	@RequestMapping("access/logout")
	public String logout(HttpServletRequest request, ModelMap model){
		System.out.println("====> call logout.");
		SessionUtil.removeUser(request);
		return index(request, model);
	}
}