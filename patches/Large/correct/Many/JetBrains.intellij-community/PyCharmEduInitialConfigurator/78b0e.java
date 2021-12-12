diff --git a/python/educational-python/src/com/jetbrains/python/edu/PyCharmEduInitialConfigurator.java b/python/educational-python/src/com/jetbrains/python/edu/PyCharmEduInitialConfigurator.java
index 99ae98e..4e8345bc 100644
--- a/python/educational-python/src/com/jetbrains/python/edu/PyCharmEduInitialConfigurator.java
+++ b/python/educational-python/src/com/jetbrains/python/edu/PyCharmEduInitialConfigurator.java
@@ -225,7 +225,7 @@
                   return;
                 }
                 ToolWindow toolWindow = ToolWindowManager.getInstance(project).getToolWindow("Project");
-                if (toolWindow.getType() != ToolWindowType.SLIDING) {
+                if (toolWindow !=null && toolWindow.getType() != ToolWindowType.SLIDING) {
                   toolWindow.activate(null);
                 }
               }
