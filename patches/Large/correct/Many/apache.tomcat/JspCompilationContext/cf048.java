diff --git a/java/org/apache/jasper/JspCompilationContext.java b/java/org/apache/jasper/JspCompilationContext.java
index cf7d322..393f1b5 100644
--- a/java/org/apache/jasper/JspCompilationContext.java
+++ b/java/org/apache/jasper/JspCompilationContext.java
@@ -566,7 +566,7 @@
      * Returns null if the given uri is not associated with any tag library
      * 'exposed' in the web application.
      */
-    public TldLocation getTldLocation(String uri) throws JasperException {
+    public TldLocation getTldLocation(String uri) {
         TldLocation location =
                 getOptions().getTldLocationsCache().getLocation(uri);
         return location;
