module com.example.jfxpdfreader {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.pdfbox;


    opens com.example.jfxpdfreader to javafx.fxml;
    exports com.example.jfxpdfreader;
}