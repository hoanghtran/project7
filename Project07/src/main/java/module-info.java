
module com.act.java06.project07 {
    requires com.google.gson;
    requires com.fasterxml.uuid;
    requires org.slf4j;
    
    exports com.act.java06.project07;
    opens com.act.java06.project07 to com.google.gson;    
}
