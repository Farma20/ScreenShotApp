module com.screenshot.screenshot {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.screenshot.screenshot to javafx.fxml;
    exports com.screenshot.screenshot;
}