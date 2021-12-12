diff --git a/java/org/apache/tomcat/util/http/Cookies.java b/java/org/apache/tomcat/util/http/Cookies.java
index a289955..9a68c15 100644
--- a/java/org/apache/tomcat/util/http/Cookies.java
+++ b/java/org/apache/tomcat/util/http/Cookies.java
@@ -145,7 +145,7 @@
         while (pos >= 0) {
             MessageBytes cookieValue = headers.getValue(pos);
 
-            if (cookieValue != null && cookieValue.isNull() ) {
+            if (cookieValue != null && !cookieValue.isNull() ) {
                 if (cookieValue.getType() != MessageBytes.T_BYTES ) {
                     Exception e = new Exception();
                     log.warn("Cookies: Parsing cookie as String. Expected bytes.", e);
@@ -252,7 +252,7 @@
      * RFC 2965
      * JVK
      */
-    protected final void processCookieHeader(byte bytes[], int off, int len){
+    final void processCookieHeader(byte bytes[], int off, int len){
         if (len <= 0 || bytes == null) {
             return;
         }
