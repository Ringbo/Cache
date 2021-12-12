diff --git a/javaparser-core/src/main/java/com/github/javaparser/ast/CompilationUnit.java b/javaparser-core/src/main/java/com/github/javaparser/ast/CompilationUnit.java
index 7cc663d..7148ec0 100644
--- a/javaparser-core/src/main/java/com/github/javaparser/ast/CompilationUnit.java
+++ b/javaparser-core/src/main/java/com/github/javaparser/ast/CompilationUnit.java
@@ -247,7 +247,7 @@
      * @return this, the {@link CompilationUnit}
      */
     public CompilationUnit addImport(String name, boolean isStatic, boolean isAsterisk) {
-        if (getImports().stream().anyMatch(i -> i.getName().getName().equals(name)))
+        if (getImports().stream().anyMatch(i -> i.getName().toString().equals(name)))
             return this;
         else {
             ImportDeclaration importDeclaration = new ImportDeclaration(ASTHelper.createNameExpr(name), isStatic,
