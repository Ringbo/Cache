diff --git a/platform/platform-impl/src/com/intellij/openapi/wm/impl/status/ToolWindowsWidget.java b/platform/platform-impl/src/com/intellij/openapi/wm/impl/status/ToolWindowsWidget.java
index 6abb0fe..1ebb011 100644
--- a/platform/platform-impl/src/com/intellij/openapi/wm/impl/status/ToolWindowsWidget.java
+++ b/platform/platform-impl/src/com/intellij/openapi/wm/impl/status/ToolWindowsWidget.java
@@ -66,7 +66,7 @@
       @Override
       public boolean dispatch(AWTEvent e) {
         if (e instanceof MouseEvent) {
-          if (e.getID() == MouseEvent.MOUSE_MOVED && isVisible()) {
+          if (e.getID() == MouseEvent.MOUSE_MOVED && isShowing()) {
             Point p = ((MouseEvent)e).getLocationOnScreen();
             Point screen = ToolWindowsWidget.this.getLocationOnScreen();
             if (new Rectangle(screen.x - 4, screen.y - 2, getWidth() + 4, getHeight() + 4).contains(p)) {
