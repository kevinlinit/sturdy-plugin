package com.github.kevinlinit.sturdyplugin.services

import com.intellij.openapi.project.Project
import com.github.kevinlinit.sturdyplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
