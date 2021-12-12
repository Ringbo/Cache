diff --git a/java-symbol-solver-core/src/main/java/com/github/javaparser/symbolsolver/javaparsermodel/declarations/JavaParserInterfaceDeclaration.java b/java-symbol-solver-core/src/main/java/com/github/javaparser/symbolsolver/javaparsermodel/declarations/JavaParserInterfaceDeclaration.java
index 70da6e8..47020c8 100644
--- a/java-symbol-solver-core/src/main/java/com/github/javaparser/symbolsolver/javaparsermodel/declarations/JavaParserInterfaceDeclaration.java
+++ b/java-symbol-solver-core/src/main/java/com/github/javaparser/symbolsolver/javaparsermodel/declarations/JavaParserInterfaceDeclaration.java
@@ -189,7 +189,7 @@
     public List<FieldDeclaration> getAllFields() {
         List<FieldDeclaration> fields = javaParserTypeAdapter.getFieldsForDeclaredVariables();
         
-        getAllAncestors().forEach(ancestor -> ancestor.getTypeDeclaration().getAllFields().forEach(f -> {
+        getAncestors().forEach(ancestor -> ancestor.getTypeDeclaration().getAllFields().forEach(f -> {
             fields.add(new FieldDeclaration() {
                 
                 @Override
