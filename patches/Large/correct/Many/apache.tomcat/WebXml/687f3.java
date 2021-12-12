diff --git a/java/org/apache/tomcat/util/descriptor/web/WebXml.java b/java/org/apache/tomcat/util/descriptor/web/WebXml.java
index 71adfd7..6441571 100644
--- a/java/org/apache/tomcat/util/descriptor/web/WebXml.java
+++ b/java/org/apache/tomcat/util/descriptor/web/WebXml.java
@@ -615,7 +615,7 @@
         return requestEncoding;
     }
     public void setRequestEncoding(String requestEncoding) {
-        if (requestEncoding == null) {
+        if (requestEncoding != null) {
             try {
                 B2CConverter.getCharset(requestEncoding);
             } catch (UnsupportedEncodingException e) {
@@ -630,7 +630,7 @@
         return responseEncoding;
     }
     public void setResponseEncoding(String responseEncoding) {
-        if (responseEncoding == null) {
+        if (responseEncoding != null) {
             try {
                 B2CConverter.getCharset(responseEncoding);
             } catch (UnsupportedEncodingException e) {
