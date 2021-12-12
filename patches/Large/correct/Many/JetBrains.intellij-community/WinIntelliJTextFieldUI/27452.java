diff --git a/platform/platform-impl/src/com/intellij/ide/ui/laf/intellij/WinIntelliJTextFieldUI.java b/platform/platform-impl/src/com/intellij/ide/ui/laf/intellij/WinIntelliJTextFieldUI.java
index eb7d3e3..d26b38b 100644
--- a/platform/platform-impl/src/com/intellij/ide/ui/laf/intellij/WinIntelliJTextFieldUI.java
+++ b/platform/platform-impl/src/com/intellij/ide/ui/laf/intellij/WinIntelliJTextFieldUI.java
@@ -59,7 +59,8 @@
   @Override
   protected void paintBackground(Graphics g) {
     JTextComponent c = getComponent();
-    if (UIUtil.getParentOfType(JComboBox.class, c) != null) return;
+    if (UIUtil.getParentOfType(JComboBox.class, c) != null ||
+        UIUtil.getParentOfType(JSpinner.class, c) != null) return;
 
     Graphics2D g2 = (Graphics2D)g.create();
     try {
