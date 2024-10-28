package com.recruit.service;

import com.recruit.dto.category.CreateOrUpdateCategoryDTO;
import com.recruit.model.CategoryDO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface CategoryService extends IService<CategoryDO> {

    boolean createCategory(CreateOrUpdateCategoryDTO validator);

    boolean updateCategory(CategoryDO categoryDO, CreateOrUpdateCategoryDTO validator);

    boolean deleteById(Integer id);

    List<CategoryDO> getAll();

    List<CategoryDO> show();
}
