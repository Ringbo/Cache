diff --git a/src/com/facebook/buck/features/project/intellij/StringTemplateFile.java b/src/com/facebook/buck/features/project/intellij/StringTemplateFile.java
index 38b1ef9..fdef80c 100644
--- a/src/com/facebook/buck/features/project/intellij/StringTemplateFile.java
+++ b/src/com/facebook/buck/features/project/intellij/StringTemplateFile.java
@@ -48,7 +48,12 @@
     return fileName;
   }
 
-  public ST getST() throws IOException {
+  /**
+   * Not thread safe, see discussion in: https://github.com/antlr/stringtemplate4/issues/61 could be
+   * made faster by sharing STGroup across threads using a supplier, see {@link
+   * com.facebook.buck.parser.function.BuckPyFunction}. May be fixed in ST4.1
+   */
+  public synchronized ST getST() throws IOException {
     URL templateUrl = Resources.getResource(StringTemplateFile.class, "templates/" + fileName);
     String template = Resources.toString(templateUrl, StandardCharsets.UTF_8);
     return new ST(template, DELIMITER, DELIMITER);
