diff --git a/java/java-impl/src/com/intellij/refactoring/typeMigration/TypeMigrationLabeler.java b/java/java-impl/src/com/intellij/refactoring/typeMigration/TypeMigrationLabeler.java
index 8dc5dfd..9fa7a70 100644
--- a/java/java-impl/src/com/intellij/refactoring/typeMigration/TypeMigrationLabeler.java
+++ b/java/java-impl/src/com/intellij/refactoring/typeMigration/TypeMigrationLabeler.java
@@ -540,7 +540,7 @@
 
     if (!userDefinedType) {
       final Set<PsiTypeParameter> collector;
-      if (type instanceof PsiClassReferenceType) {
+      if (type instanceof PsiClassType) {
         collector = type.accept(new PsiExtendedTypeVisitor<Set<PsiTypeParameter>>() {
           private final Set<PsiTypeParameter> myResult = new HashSet<PsiTypeParameter>();
 
