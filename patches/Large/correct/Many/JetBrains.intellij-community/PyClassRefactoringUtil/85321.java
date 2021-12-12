diff --git a/python/src/com/jetbrains/python/refactoring/classes/PyClassRefactoringUtil.java b/python/src/com/jetbrains/python/refactoring/classes/PyClassRefactoringUtil.java
index a20ae8ec..13e3e0c 100644
--- a/python/src/com/jetbrains/python/refactoring/classes/PyClassRefactoringUtil.java
+++ b/python/src/com/jetbrains/python/refactoring/classes/PyClassRefactoringUtil.java
@@ -202,7 +202,7 @@
       insertImport(node, target, asName, useFromImport != null ? useFromImport : true);
     }
     else {
-      insertImport(node, target, asName);
+      insertImport(node, target, asName, true);
     }
     node.putCopyableUserData(ENCODED_IMPORT, null);
     node.putCopyableUserData(ENCODED_IMPORT_AS, null);
