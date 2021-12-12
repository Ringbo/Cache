diff --git a/java/typeMigration/src/com/intellij/refactoring/typeMigration/TypeMigrationVariableTypeFixProvider.java b/java/typeMigration/src/com/intellij/refactoring/typeMigration/TypeMigrationVariableTypeFixProvider.java
index b04d406..3dab431 100644
--- a/java/typeMigration/src/com/intellij/refactoring/typeMigration/TypeMigrationVariableTypeFixProvider.java
+++ b/java/typeMigration/src/com/intellij/refactoring/typeMigration/TypeMigrationVariableTypeFixProvider.java
@@ -58,7 +58,7 @@
 
       @Override
       public boolean startInWriteAction() {
-        return true;
+        return false;
       }
     };
   }
