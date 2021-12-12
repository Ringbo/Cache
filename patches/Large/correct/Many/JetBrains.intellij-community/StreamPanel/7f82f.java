diff --git a/src/org/jetbrains/plugins/ipnb/editor/panels/code/StreamPanel.java b/src/org/jetbrains/plugins/ipnb/editor/panels/code/StreamPanel.java
index 0e68876..e9c1ee7 100644
--- a/src/org/jetbrains/plugins/ipnb/editor/panels/code/StreamPanel.java
+++ b/src/org/jetbrains/plugins/ipnb/editor/panels/code/StreamPanel.java
@@ -18,7 +18,7 @@
 
   @Override
   protected JComponent createViewPanel() {
-    JTextArea textArea = new JTextArea(myCell.getStream());
+    JTextArea textArea = new JTextArea(myCell.getSourceAsString());
     textArea.setEditable(false);
     return textArea;
   }
