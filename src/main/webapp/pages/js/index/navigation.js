/**
 * Created by TianyuanPan on 4/15/16.
 */


function getLoginStatus(){

    $.ajax({
        type: "POST",
        url: "/loginStatus",
        data: {},
        dataType: "json",
        beforeSend: function () {},
        success: function (data){

            if (data.status == false)
                return false;

            $("#topbar_li01_a01").attr("href", data.url02);
            $("#topbar_li01_a01").html(data.value02);

            $("#topbar_li01_a02").attr("href", data.url01);
            $("#topbar_li01_a02").html(data.value01);

        }//success
    });//$.ajax

}



function getNavigation(){
    $.ajax({
        type: "POST",
        url: "/navigation",
        data: {},
        dataType: "json",
        beforeSend: function () {},
        success: function (data){

            $("#navi01").attr("href", data[0].url);
            $("#navi01").html(data[0].name);

            $("#navi02").attr("href", data[1].url);
            $("#navi02").html(data[1].name);

            $("#navi03").attr("href", data[2].url);
            $("#navi03").html(data[2].name);

            $("#navi04").attr("href", data[3].url);
            $("#navi04").html(data[3].name);

            $("#navi05").attr("href", data[4].url);
            $("#navi05").html(data[4].name);

        }//success
    });//$.ajax
}


function navigation(){

    getLoginStatus();
    getNavigation();

}