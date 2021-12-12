diff --git a/java/org/apache/tomcat/util/descriptor/web/WebXml.java b/java/org/apache/tomcat/util/descriptor/web/WebXml.java
index 6e6d6cf..55bada9 100644
--- a/java/org/apache/tomcat/util/descriptor/web/WebXml.java
+++ b/java/org/apache/tomcat/util/descriptor/web/WebXml.java
@@ -2082,7 +2082,7 @@
 
         if (dest.getMaxFileSize() == null) {
             dest.setMaxFileSize(src.getMaxFileSize());
-        } else if (src.getLocation() != null) {
+        } else if (src.getMaxFileSize() != null) {
             if (failOnConflict &&
                     !src.getMaxFileSize().equals(dest.getMaxFileSize())) {
                 return false;
