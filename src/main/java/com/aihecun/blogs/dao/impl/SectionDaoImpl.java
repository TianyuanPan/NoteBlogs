package com.aihecun.blogs.dao.impl;

import com.aihecun.blogs.dao.SectionDao;
import com.aihecun.blogs.dao.base.BaseDaoImpl;
import com.aihecun.blogs.mapper.SectionMapper;
import com.aihecun.blogs.model.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by TianyuanPan on 4/11/16.
 */

@Repository
public class SectionDaoImpl extends BaseDaoImpl<Section> implements SectionDao {

    @Autowired
    SectionMapper mapper;

    @Override
    public int createNewSection(Section model) throws Exception {
        return mapper.createNewSection(model);
    }

    @Override
    public int updateSection(Section model) throws Exception {
        return mapper.updateSection(model);
    }

    @Override
    public List<Section> getSectionsByArticle(String idArticle) throws Exception {
        return mapper.getSectionsByArticle(idArticle);
    }

    @Override
    public int deleteSection(Section model) throws Exception {
        return mapper.deleteSection(model);
    }
}
