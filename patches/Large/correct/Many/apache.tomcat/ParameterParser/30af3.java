diff --git a/java/org/apache/tomcat/util/http/fileupload/ParameterParser.java b/java/org/apache/tomcat/util/http/fileupload/ParameterParser.java
index f2d3aa2..71f0bbc 100644
--- a/java/org/apache/tomcat/util/http/fileupload/ParameterParser.java
+++ b/java/org/apache/tomcat/util/http/fileupload/ParameterParser.java
@@ -295,7 +295,7 @@
         int length,
         char separator) {
 
-        if (chars == null) {
+        if (inputChars == null) {
             return new HashMap<String,String>();
         }
         HashMap<String,String> params = new HashMap<String,String>();
