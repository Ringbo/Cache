diff --git a/refactoring/impl/com/intellij/refactoring/move/moveClassesOrPackages/MoveClassesOrPackagesDialog.java b/refactoring/impl/com/intellij/refactoring/move/moveClassesOrPackages/MoveClassesOrPackagesDialog.java
index faba5d3..276bac7 100644
--- a/refactoring/impl/com/intellij/refactoring/move/moveClassesOrPackages/MoveClassesOrPackagesDialog.java
+++ b/refactoring/impl/com/intellij/refactoring/move/moveClassesOrPackages/MoveClassesOrPackagesDialog.java
@@ -229,7 +229,7 @@
       return name.length() == 0 || myManager.getNameHelper().isQualifiedName(name);
     }
     else {
-      return findTargetClass() != null && getValidationError() != null;
+      return findTargetClass() != null && getValidationError() == null;
     }
   }
 
