diff --git a/source/com/intellij/codeInsight/hint/ImplementationViewComponent.java b/source/com/intellij/codeInsight/hint/ImplementationViewComponent.java
index 9575dbc..13ead49 100644
--- a/source/com/intellij/codeInsight/hint/ImplementationViewComponent.java
+++ b/source/com/intellij/codeInsight/hint/ImplementationViewComponent.java
@@ -185,10 +185,10 @@
     SwingUtilities.invokeLater(new Runnable() {
       public void run() {
         if (myFileChooser != null) {
-          myFileChooser.requestFocusInWindow();
+          myFileChooser.requestFocus();
         }
         else {
-          myViewingPanel.requestFocusInWindow();
+          myViewingPanel.requestFocus();
         }
       }
     });
