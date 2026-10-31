module org.example.thaer_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.thaer_project to javafx.fxml;
    exports org.example.thaer_project;
}