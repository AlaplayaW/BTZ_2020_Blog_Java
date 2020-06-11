package com.wildcodeschool.blogJava.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;



@Controller
public class ArticleController {
    
    private static final String TEMPLATE_HOME = "home";
    private static final String TEMPLATE_ARTICLE = "article"; 
    // private static final String TEMPLATE_ARTICLE_EDIT = "article-edit"; 

    @GetMapping({"/", "/articles"})
    public String goHome(final Model model) {

        model.addAttributes("articles", articleRepository.findAll());

        return TEMPLATE_HOME;
    }

    @GetMapping("/article/{id}")
    public String goHome(final Model model, @PathVariable final Integer id) {

        Article article = new articleRepository.findById(id);
        
        if (article == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Article inconnu");

        model.addAttributes("article",article);

        return TEMPLATE_ARTICLE;
    }

}