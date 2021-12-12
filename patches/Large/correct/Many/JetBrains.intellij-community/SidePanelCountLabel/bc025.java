diff --git a/platform/platform-impl/src/com/intellij/openapi/roots/ui/configuration/SidePanelCountLabel.java b/platform/platform-impl/src/com/intellij/openapi/roots/ui/configuration/SidePanelCountLabel.java
index d96c5d1..82de15a 100644
--- a/platform/platform-impl/src/com/intellij/openapi/roots/ui/configuration/SidePanelCountLabel.java
+++ b/platform/platform-impl/src/com/intellij/openapi/roots/ui/configuration/SidePanelCountLabel.java
@@ -38,7 +38,7 @@
 
       @Override
       public Insets getBorderInsets(Component c) {
-        return StringUtil.isEmpty(getText()) ? new Insets(0,0,0,0) : new Insets(2, 6, 2, 6 + 6);
+        return StringUtil.isEmpty(getText()) ? new Insets(0, 0, 0, 0) : new Insets(2, 5, 2, 6 + 6);
       }
 
       @Override
@@ -65,7 +65,7 @@
     final JBColor deepBlue = new JBColor(new Color(0x97A4B2), new Color(92, 98, 113));
     g.setColor(isSelected() ? Gray._255.withAlpha(UIUtil.isUnderDarcula() ? 100 : 220) : deepBlue);
     final GraphicsConfig config = GraphicsUtil.setupAAPainting(g);
-    g.fillRoundRect(0, 3, getWidth() - 6 -1, getHeight()-6 , (getHeight() - 6), (getHeight() - 6));
+    g.fillRoundRect(0, 3, getWidth() - 6 - 1, getHeight() - 6, getHeight() - 6, getHeight() - 6);
     config.restore();
     setForeground(isSelected() ? deepBlue.darker() : UIUtil.getListForeground(true));
 
