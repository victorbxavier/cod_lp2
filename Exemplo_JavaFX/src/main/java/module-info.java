module com.example.exemplo_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.exemplo_javafx to javafx.fxml;
    exports com.example.exemplo_javafx;
}