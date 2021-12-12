diff --git a/plugins/cvs/cvs-plugin/src/com/intellij/cvsSupport2/ui/CvsTabbedWindow.java b/plugins/cvs/cvs-plugin/src/com/intellij/cvsSupport2/ui/CvsTabbedWindow.java
index cfdf79d..bc23849 100644
--- a/plugins/cvs/cvs-plugin/src/com/intellij/cvsSupport2/ui/CvsTabbedWindow.java
+++ b/plugins/cvs/cvs-plugin/src/com/intellij/cvsSupport2/ui/CvsTabbedWindow.java
@@ -194,7 +194,7 @@
     if (toolWindowManager != null) {
       ToolWindow toolWindow = toolWindowManager.getToolWindow(ToolWindowId.CVS);
       if (toolWindow != null) {
-        toolWindow.activate(null);
+        toolWindow.activate(null, false);
       }
     }
   }
