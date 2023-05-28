module com.example.daiza {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.daiza to javafx.fxml;
    exports com.example.daiza;
}