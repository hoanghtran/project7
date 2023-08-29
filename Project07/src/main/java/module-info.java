
module com.act.java06.project07 {
    requires com.google.gson;
    requires com.fasterxml.uuid;
    requires org.slf4j;
    requires java.desktop;
    requires java.logging;
    
    exports com.act.java06.project07;
    opens com.act.java06.project07 to com.google.gson;    
}
