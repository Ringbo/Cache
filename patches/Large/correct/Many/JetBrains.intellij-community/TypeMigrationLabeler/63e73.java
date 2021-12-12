diff --git a/java/java-impl/src/com/intellij/refactoring/typeMigration/TypeMigrationLabeler.java b/java/java-impl/src/com/intellij/refactoring/typeMigration/TypeMigrationLabeler.java
index 5bba9d5..a5bfa29 100644
--- a/java/java-impl/src/com/intellij/refactoring/typeMigration/TypeMigrationLabeler.java
+++ b/java/java-impl/src/com/intellij/refactoring/typeMigration/TypeMigrationLabeler.java
@@ -735,7 +735,7 @@
         if (getter.isEquivalentTo(method)) {
           final String suggestedName = GenerateMembersUtil.suggestGetterName(field.getName(), migrationType, method.getProject());
           if (!suggestedName.equals(method.getName())) {
-            if (getter.getContainingClass().findMethodsByName(suggestedName, true).length == 0) {
+            if (getter.getContainingClass().findMethodsByName(suggestedName, true).length != 0) {
               return null;
             }
             return suggestedName;
