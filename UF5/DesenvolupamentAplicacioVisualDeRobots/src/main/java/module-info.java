module com.mycompany.desenvolupamentaplicaciovisualderobots {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.desenvolupamentaplicaciovisualderobots to javafx.fxml;
    exports com.mycompany.desenvolupamentaplicaciovisualderobots;
}
