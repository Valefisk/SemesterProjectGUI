module com.dk.sdu.worldofchop_gui.worldofchopgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dk.sdu.worldofchop_gui to javafx.fxml;
    exports com.dk.sdu.worldofchop_gui;
}