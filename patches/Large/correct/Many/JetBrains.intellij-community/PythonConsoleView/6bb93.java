diff --git a/python/src/com/jetbrains/python/console/PythonConsoleView.java b/python/src/com/jetbrains/python/console/PythonConsoleView.java
index 04346a31..daa6100 100644
--- a/python/src/com/jetbrains/python/console/PythonConsoleView.java
+++ b/python/src/com/jetbrains/python/console/PythonConsoleView.java
@@ -295,13 +295,13 @@
   }
 
   public void restoreWindow() {
-    JSplitPane pane = (JSplitPane)getComponent(0);
+    JBSplitter pane = (JBSplitter)getComponent(0);
     removeAll();
     if (mySplitView != null) {
       Disposer.dispose(mySplitView);
       mySplitView = null;
     }
-    add(pane.getLeftComponent(), BorderLayout.CENTER);
+    add(pane.getFirstComponent(), BorderLayout.CENTER);
     validate();
     repaint();
   }
