diff --git a/src/main/java/com/squareup/javapoet/CodeWriter.java b/src/main/java/com/squareup/javapoet/CodeWriter.java
index 31abd5b..df372f5 100644
--- a/src/main/java/com/squareup/javapoet/CodeWriter.java
+++ b/src/main/java/com/squareup/javapoet/CodeWriter.java
@@ -66,11 +66,11 @@
     this(out, "  ");
   }
 
-  public CodeWriter(Appendable out, String indent) {
+  CodeWriter(Appendable out, String indent) {
     this(out, indent, Collections.<String, ClassName>emptyMap());
   }
 
-  public CodeWriter(Appendable out, String indent, Map<String, ClassName> importedTypes) {
+  CodeWriter(Appendable out, String indent, Map<String, ClassName> importedTypes) {
     this.out = checkNotNull(out, "out == null");
     this.indent = checkNotNull(indent, "indent == null");
     this.importedTypes = checkNotNull(importedTypes, "importedTypes == null");
