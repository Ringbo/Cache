diff --git a/platform/platform-impl/src/com/intellij/openapi/wm/impl/status/ToolWindowsWidget.java b/platform/platform-impl/src/com/intellij/openapi/wm/impl/status/ToolWindowsWidget.java
index 04138d7..fbc593e 100644
--- a/platform/platform-impl/src/com/intellij/openapi/wm/impl/status/ToolWindowsWidget.java
+++ b/platform/platform-impl/src/com/intellij/openapi/wm/impl/status/ToolWindowsWidget.java
@@ -184,7 +184,7 @@
   public void addNotify() {
     super.addNotify();
     final String key = "toolwindow.stripes.buttons.info.shown";
-    if (UISettings.getInstance().HIDE_TOOL_STRIPES && !PropertiesComponent.getInstance().isTrueValue(key)) {
+    if (true || UISettings.getInstance().HIDE_TOOL_STRIPES && !PropertiesComponent.getInstance().isTrueValue(key)) {
       final Alarm alarm = new Alarm();
       alarm.addRequest(new Runnable() {
         @Override
@@ -316,9 +316,9 @@
           GraphicsUtil.setupAAPainting(g);
           ((Graphics2D)g).setPaint(new GradientPaint(0, 0, new JBColor(new Color(77, 143, 253), new Color(52, 74, 100)), 0, getHeight(),
                                                      new JBColor(new Color(71, 135, 237), new Color(38, 53, 73))));
-          g.fillRoundRect(0,0,getWidth(), getHeight(), 5,5);
+          g.fillRoundRect(0,0,getWidth()-1, getHeight()-1, 5,5);
           g.setColor(new JBColor(new Color(48, 121, 237), new Color(87, 93, 101)));
-          g.drawRoundRect(0,0,getWidth(), getHeight(), 5,5);
+          g.drawRoundRect(0,0,getWidth()-1, getHeight()-1, 5,5);
         }
       };
     }
