diff --git a/source/com/intellij/debugger/impl/DebuggerUtilsImpl.java b/source/com/intellij/debugger/impl/DebuggerUtilsImpl.java
index 8702001..8d2d3ff 100644
--- a/source/com/intellij/debugger/impl/DebuggerUtilsImpl.java
+++ b/source/com/intellij/debugger/impl/DebuggerUtilsImpl.java
@@ -105,7 +105,7 @@
   }
 
   public PsiClass chooseClassDialog(String title, Project project) {
-    TreeClassChooser dialog = TreeClassChooserFactory.getInstance(project).createProjectScopeChooser(title);
+    TreeClassChooser dialog = TreeClassChooserFactory.getInstance(project).createAllProjectScopeChooser(title);
     dialog.showDialog();
     return dialog.getSelectedClass();
   }
