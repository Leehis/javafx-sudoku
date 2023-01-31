module dev.leehis {
    requires javafx.controls;
    requires javafx.fxml;

    opens dev.leehis to javafx.fxml;
    exports dev.leehis;
}
