diff --git a/python/src/com/jetbrains/python/refactoring/classes/PyClassRefactoringUtil.java b/python/src/com/jetbrains/python/refactoring/classes/PyClassRefactoringUtil.java
index 98820d3..83d9914 100644
--- a/python/src/com/jetbrains/python/refactoring/classes/PyClassRefactoringUtil.java
+++ b/python/src/com/jetbrains/python/refactoring/classes/PyClassRefactoringUtil.java
@@ -352,7 +352,7 @@
         if (newFile == file) {
           deleteImportElement = true;
         }
-        else if (insertImport(importStatement, element, importElement.getAsName())) {
+        else if (insertImport(importStatement, element, importElement.getAsName(), true)) {
           deleteImportElement = true;
         }
         if (deleteImportElement) {
