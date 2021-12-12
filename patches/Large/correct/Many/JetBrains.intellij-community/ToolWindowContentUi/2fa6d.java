diff --git a/ui/impl/com/intellij/openapi/wm/impl/ToolWindowContentUi.java b/ui/impl/com/intellij/openapi/wm/impl/ToolWindowContentUi.java
index 62f94cc..01ebbfe 100644
--- a/ui/impl/com/intellij/openapi/wm/impl/ToolWindowContentUi.java
+++ b/ui/impl/com/intellij/openapi/wm/impl/ToolWindowContentUi.java
@@ -64,7 +64,7 @@
     setOpaque(false);
 
     myIdLabel.setOpaque(false);
-    myIdLabel.setBorder(new EmptyBorder(0, 2, 0, 4));
+    myIdLabel.setBorder(new EmptyBorder(0, 2, 0, 6));
     myIdLabel.setFont(UIManager.getFont("Label.font"));    
 
     addMouseListeners(this);
