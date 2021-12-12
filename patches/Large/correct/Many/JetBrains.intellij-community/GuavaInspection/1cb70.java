diff --git a/java/typeMigration/src/com/intellij/refactoring/typeMigration/inspections/GuavaInspection.java b/java/typeMigration/src/com/intellij/refactoring/typeMigration/inspections/GuavaInspection.java
index 6cd8060..cadbce1 100644
--- a/java/typeMigration/src/com/intellij/refactoring/typeMigration/inspections/GuavaInspection.java
+++ b/java/typeMigration/src/com/intellij/refactoring/typeMigration/inspections/GuavaInspection.java
@@ -315,7 +315,7 @@
 
     @Override
     public boolean startInWriteAction() {
-      return true;
+      return false;
     }
 
     @NotNull
@@ -376,7 +376,7 @@
 
     @Override
     public boolean startInWriteAction() {
-      return true;
+      return false;
     }
   }
 }
\ No newline at end of file
