diff --git a/java/org/apache/catalina/servlets/WebdavServlet.java b/java/org/apache/catalina/servlets/WebdavServlet.java
index d6a9078..5941fa1 100644
--- a/java/org/apache/catalina/servlets/WebdavServlet.java
+++ b/java/org/apache/catalina/servlets/WebdavServlet.java
@@ -472,7 +472,7 @@
 
         Node propNode = null;
 
-        if (req.getContentLength() > 0) {
+        if (req.getContentLengthLong() > 0) {
             DocumentBuilder documentBuilder = getDocumentBuilder();
 
             try {
@@ -716,7 +716,7 @@
             return;
         }
 
-        if (req.getContentLength() > 0) {
+        if (req.getContentLengthLong() > 0) {
             DocumentBuilder documentBuilder = getDocumentBuilder();
             try {
                 // Document document =
