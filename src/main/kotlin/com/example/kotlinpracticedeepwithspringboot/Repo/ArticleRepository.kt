package com.example.kotlinpracticedeepwithspringboot.Repo

import com.example.kotlinpracticedeepwithspringboot.Model.Article
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ArticleRepository : JpaRepository<Article, Long>