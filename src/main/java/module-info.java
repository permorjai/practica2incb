module com.uiejemplos.proyectopr2incb {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uiejemplos.proyectopr2incb to javafx.fxml;
    exports com.uiejemplos.proyectopr2incb;
}