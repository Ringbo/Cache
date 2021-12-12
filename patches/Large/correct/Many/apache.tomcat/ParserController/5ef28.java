diff --git a/java/org/apache/jasper/compiler/ParserController.java b/java/org/apache/jasper/compiler/ParserController.java
index 8ae780d..8173ddb 100644
--- a/java/org/apache/jasper/compiler/ParserController.java
+++ b/java/org/apache/jasper/compiler/ParserController.java
@@ -276,8 +276,7 @@
      * @return The value of the <page-encoding> attribute of the
      * jsp-property-group with matching URL pattern
      */
-    private String getJspConfigPageEncoding(String absFileName)
-    throws JasperException {
+    private String getJspConfigPageEncoding(String absFileName) {
 
         JspConfig jspConfig = ctxt.getOptions().getJspConfig();
         JspConfig.JspProperty jspProperty
