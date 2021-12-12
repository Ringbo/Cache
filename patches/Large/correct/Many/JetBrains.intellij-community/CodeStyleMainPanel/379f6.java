diff --git a/platform/lang-impl/src/com/intellij/application/options/codeStyle/CodeStyleMainPanel.java b/platform/lang-impl/src/com/intellij/application/options/codeStyle/CodeStyleMainPanel.java
index de4f41a..415c355 100644
--- a/platform/lang-impl/src/com/intellij/application/options/codeStyle/CodeStyleMainPanel.java
+++ b/platform/lang-impl/src/com/intellij/application/options/codeStyle/CodeStyleMainPanel.java
@@ -143,7 +143,7 @@
       top.add(linkPanel);
     }
 
-    top.setBorder(JBUI.Borders.empty(10, 10, 0, 10));
+    top.setBorder(JBUI.Borders.empty(5, 10, 0, 10));
     add(top, BorderLayout.NORTH);
     add(mySettingsPanel, BorderLayout.CENTER);
 
