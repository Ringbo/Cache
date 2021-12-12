diff --git a/java-symbol-solver-core/src/main/java/com/github/javaparser/symbolsolver/javaparsermodel/declarations/JavaParserClassDeclaration.java b/java-symbol-solver-core/src/main/java/com/github/javaparser/symbolsolver/javaparsermodel/declarations/JavaParserClassDeclaration.java
index e78c49e..99a8ad9 100644
--- a/java-symbol-solver-core/src/main/java/com/github/javaparser/symbolsolver/javaparsermodel/declarations/JavaParserClassDeclaration.java
+++ b/java-symbol-solver-core/src/main/java/com/github/javaparser/symbolsolver/javaparsermodel/declarations/JavaParserClassDeclaration.java
@@ -105,7 +105,7 @@
     public List<FieldDeclaration> getAllFields() {
         List<FieldDeclaration> fields = javaParserTypeAdapter.getFieldsForDeclaredVariables();
         
-        getAllAncestors().forEach(ancestor -> ancestor.getTypeDeclaration().getAllFields().forEach(f -> {
+        getAncestors().forEach(ancestor -> ancestor.getTypeDeclaration().getAllFields().forEach(f -> {
             fields.add(new FieldDeclaration() {
                 
                 @Override
