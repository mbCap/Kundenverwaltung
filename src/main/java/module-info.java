module com.example.kundenverwaltung {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kundenverwaltung to javafx.fxml;
    exports com.example.kundenverwaltung;
}