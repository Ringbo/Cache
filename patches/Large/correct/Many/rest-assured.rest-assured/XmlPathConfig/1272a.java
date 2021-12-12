diff --git a/xml-path/src/main/java/com/jayway/restassured/path/xml/config/XmlPathConfig.java b/xml-path/src/main/java/com/jayway/restassured/path/xml/config/XmlPathConfig.java
index 13b8fce..0bf1802 100644
--- a/xml-path/src/main/java/com/jayway/restassured/path/xml/config/XmlPathConfig.java
+++ b/xml-path/src/main/java/com/jayway/restassured/path/xml/config/XmlPathConfig.java
@@ -144,7 +144,7 @@
      * @return A new XmlPathConfig instance with that assumes the supplied charset when parsing XML documents.
      */
     public XmlPathConfig charset(String charset) {
-        return new XmlPathConfig();
+        return new XmlPathConfig(jaxbObjectMapperFactory, defaultParserType, defaultDeserializer, charset, features);
     }
 
     public XmlParserType defaultParserType() {
