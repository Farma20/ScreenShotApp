package com.screenshot.screenshot

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class ScreenShotApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(ScreenShotApplication::class.java.getResource("view.fxml"))
        val scene = Scene(fxmlLoader.load(), 800.0, 600.0)
        stage.title = "Hello!"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(ScreenShotApplication::class.java)
}