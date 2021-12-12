diff --git a/refactoring/impl/com/intellij/refactoring/rename/AutomaticRenamingDialog.java b/refactoring/impl/com/intellij/refactoring/rename/AutomaticRenamingDialog.java
index fd49b31..fada3ec 100644
--- a/refactoring/impl/com/intellij/refactoring/rename/AutomaticRenamingDialog.java
+++ b/refactoring/impl/com/intellij/refactoring/rename/AutomaticRenamingDialog.java
@@ -289,7 +289,7 @@
         for (final int row : rows) {
           myShouldRename[row] = valueToBeSet;
         }
-        fireTableDataChanged();
+        fireDataChanged();
       }
     }
   }
