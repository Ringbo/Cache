diff --git a/src/core/org/apache/jmeter/threads/gui/AbstractThreadGroupGui.java b/src/core/org/apache/jmeter/threads/gui/AbstractThreadGroupGui.java
index e331d87..ba5bcb7 100644
--- a/src/core/org/apache/jmeter/threads/gui/AbstractThreadGroupGui.java
+++ b/src/core/org/apache/jmeter/threads/gui/AbstractThreadGroupGui.java
@@ -105,7 +105,7 @@
     }
     
     private void initGui() {
-        continueBox.setSelected(true);
+        startNextLoop.setSelected(true);
     }
 
     private JPanel createOnErrorPanel() {
