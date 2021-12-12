diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/data/DatabaseDataEditor.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/data/DatabaseDataEditor.java
index 0904937..c264031 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/data/DatabaseDataEditor.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/data/DatabaseDataEditor.java
@@ -102,7 +102,7 @@
     public void setFocus()
     {
         if (resultSetView != null) {
-            resultSetView.getControl().setFocus();
+            resultSetView.getGridControl().setFocus();
         }
     }
 
