package com.proj4.blog.service;

import com.proj4.blog.vo.CategoryVo;
import com.proj4.blog.vo.Result;

public interface CategoryService {

    CategoryVo findCategoryById(Long categoryId);

    Result findAll();

    Result findAllDetail();

    Result categoryDetailById(Long id);
}
