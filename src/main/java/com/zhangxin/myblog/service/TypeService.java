package com.zhangxin.myblog.service;

import com.zhangxin.myblog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author zhangxin
 * @date 2020/7/26
 */
public interface TypeService {

    //保存分类
    Type saveType(Type type);

    //根据id查询分类
    Type getType(Long id);

    //根据名称查询分类
    Type getTypeByName(String name);

    //查询所有分类
    Page<Type> listType(Pageable pageable);

    //返回所有分类（不分页）
    List<Type> listType();

    //获取具体数量的分类
    List<Type> listTypeTop(Integer size);

    //修改分类
    Type updateType(Long id,Type type);

    //删除分类
    void deleteType(Long id);
}
