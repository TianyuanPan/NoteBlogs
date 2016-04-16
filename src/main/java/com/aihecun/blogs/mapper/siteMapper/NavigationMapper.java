package com.aihecun.blogs.mapper.siteMapper;


import com.aihecun.blogs.dao.base.BaseDaoMybatisPGSQLImpl;
import com.aihecun.blogs.model.siteModel.Navigation;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by TianyuanPan on 4/11/16.
 */
public interface NavigationMapper extends  BaseDaoMybatisPGSQLImpl.MybatisMultiDao<Navigation> {

    /**
     *
     * @param model
     * @return
     */
    @Insert("INSERT INTO \"tb_siteNavigation\" ( " +
            "\"idNavigation\", \"navigationName\", " +
            "url, flag, \"timeCreated\", \"timeUpdated\") " +
            "VALUES ( #{idNavigation}, #{navigationName}, " +
            "#{url}, #{flag}, #{timeCreated}, #{timeUpdated} )")
    int addNewNavigation(Navigation model);


    /**
     *
     * @param model
     * @return
     */
    @Insert("UPDATE \"tb_siteNavigation\" SET " +
            "\"navigationName\" = #{navigationName}, url = #{url}, " +
            "flag = #{flag}, \"timeUpdated\" = #{timeUpdated} " +
            "WHERE \"idNavigation\" = #{idNavigation}")
    int updateNavigation(Navigation model);


    /**
     *
     * @param name
     * @return
     */
    @Delete("DELETE FROM \"tb_siteNavigation\" WHERE \"navigationName\" = #{name}")
    int deleteNavigationByName(@Param("name") String name);


    /**
     *
     * @return
     */
    @Select("SELECT * FROM \"tb_siteNavigation\"")
    List<Navigation> getAllNavigation();


    /**
     *
     * @param name
     * @return
     */
    @Select("SELECT * FROM \"tb_siteNavigation\" WHERE \"navigationName\" = #{name}")
    Navigation getNavigationByName(@Param("name") String name);

}
