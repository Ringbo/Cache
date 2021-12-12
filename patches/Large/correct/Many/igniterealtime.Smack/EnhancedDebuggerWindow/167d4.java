diff --git a/source/org/jivesoftware/smackx/debugger/EnhancedDebuggerWindow.java b/source/org/jivesoftware/smackx/debugger/EnhancedDebuggerWindow.java
index 672c2bd..fe87352 100644
--- a/source/org/jivesoftware/smackx/debugger/EnhancedDebuggerWindow.java
+++ b/source/org/jivesoftware/smackx/debugger/EnhancedDebuggerWindow.java
@@ -227,7 +227,7 @@
         versionPanel.setLayout(new BoxLayout(versionPanel, BoxLayout.X_AXIS));
         versionPanel.setMaximumSize(new Dimension(2000, 31));
         versionPanel.add(new JLabel(" Smack version: "));
-        JFormattedTextField field = new JFormattedTextField(SmackConfiguration.getVersionNumber());
+        JFormattedTextField field = new JFormattedTextField(SmackConfiguration.getVersion());
         field.setEditable(false);
         field.setBorder(null);
         versionPanel.add(field);
