package com.github.open9527.astemplate.services

import com.intellij.openapi.project.Project
import com.github.open9527.astemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
