package com.zhangxin.myblog.service;

import com.zhangxin.myblog.po.Blog;
import com.zhangxin.myblog.po.Type;
import com.zhangxin.myblog.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;


/**
 * @author zhangxin
 * @date 2020/7/26
 */
public interface BlogService {

    //根据id获取博客
    Blog getBlog(Long id);

    //根据id获取博客并转换格式
    Blog getAndConvert(Long id);

    //动态获取博客列表
    Page<Blog> listBlog(Pageable pageable, BlogQuery blogQuery);

    //获取博客列表
    Page<Blog> listBlog(Pageable pageable);

    //获取发布博客列表
    Page<Blog> listPublishedBlog(Pageable pageable);

    //获取具体数量的推荐博客
    List<Blog> listRecommendBlogTop(Integer size);

    //搜索博客
    Page<Blog> listBlog(String query,Pageable pageable);

    //根据分类获取博客列表
    Page<Blog> listBlog(Type type,Pageable pageable);

    //根据标签获取博客列表
    Page<Blog> listBlog(Long tagId,Pageable pageable);

    //归档博客
    Map<String,List<Blog>> archiveBlog();

    //获取博客数量
    Long countBlog();

    //添加博客
    Blog saveBlog(Blog blog);

    //修改博客
    Blog updateBlog(Long id,Blog blog);

    //删除博客
    void deleteBlog(Long id);

   //获取博客浏览总数
    Long blogViewCount();
}
