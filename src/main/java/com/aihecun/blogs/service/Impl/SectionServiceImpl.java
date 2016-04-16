package com.aihecun.blogs.service.Impl;

import com.aihecun.blogs.dao.SectionDao;
import com.aihecun.blogs.model.Section;
import com.aihecun.blogs.service.SectionService;
import com.aihecun.blogs.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TianyuanPan on 4/11/16.
 */

@Service
public class SectionServiceImpl extends BaseServiceImpl<Section> implements SectionService {


    @Autowired
    SectionDao  dao;

    @Override
    public int createNewSection(Section model) throws Exception {
        return dao.createNewSection(model);
    }

    @Override
    public int updateSection(Section model) throws Exception {
        return dao.updateSection(model);
    }

    @Override
    public List<Section> getSectionsByArticle(String idArticle) throws Exception {
        return dao.getSectionsByArticle(idArticle);
    }

    @Override
    public int deleteSection(Section model) throws Exception {
        return dao.deleteSection(model);
    }
}
