diff --git a/JsTestDriver/src/com/google/jstestdriver/idea/server/ui/ToolPanel.java b/JsTestDriver/src/com/google/jstestdriver/idea/server/ui/ToolPanel.java
index 723828d..87ebb4d 100644
--- a/JsTestDriver/src/com/google/jstestdriver/idea/server/ui/ToolPanel.java
+++ b/JsTestDriver/src/com/google/jstestdriver/idea/server/ui/ToolPanel.java
@@ -107,7 +107,7 @@
       add(capturedBrowsersPanel.getComponent());
 
       JPanel configureWebBrowsersPanel = createHyperlinkPanel(project);
-      configureWebBrowsersPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 0));
+      configureWebBrowsersPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 0, 0));
       add(configureWebBrowsersPanel);
     }};
     setContent(minimizeHeight(content));
