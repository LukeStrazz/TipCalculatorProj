module com.example.tipcalculatorproj {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.tipcalculatorproj to javafx.fxml;
    exports com.example.tipcalculatorproj;
}