module com.example.projecttesting {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.projecttesting to javafx.fxml;
    exports com.example.projecttesting;
}