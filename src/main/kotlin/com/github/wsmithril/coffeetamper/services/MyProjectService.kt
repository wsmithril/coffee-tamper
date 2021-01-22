package com.github.wsmithril.coffeetamper.services

import com.github.wsmithril.coffeetamper.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
