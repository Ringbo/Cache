diff --git a/java/org/apache/jasper/JspC.java b/java/org/apache/jasper/JspC.java
index b113ba6..2cdf6b7 100644
--- a/java/org/apache/jasper/JspC.java
+++ b/java/org/apache/jasper/JspC.java
@@ -1220,7 +1220,7 @@
      * Locate all jsp files in the webapp. Used if no explicit
      * jsps are specified.
      */
-    public void scanFiles( File base ) throws JasperException {
+    public void scanFiles( File base ) {
         Stack<String> dirs = new Stack<>();
         dirs.push(base.toString());
 
