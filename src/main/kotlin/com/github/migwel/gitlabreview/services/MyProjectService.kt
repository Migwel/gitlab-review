package com.github.migwel.gitlabreview.services

import com.intellij.openapi.project.Project
import com.github.migwel.gitlabreview.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
