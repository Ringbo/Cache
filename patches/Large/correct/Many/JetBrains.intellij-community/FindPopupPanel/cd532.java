diff --git a/platform/lang-impl/src/com/intellij/find/impl/FindPopupPanel.java b/platform/lang-impl/src/com/intellij/find/impl/FindPopupPanel.java
index 19f4c6f..c2c6ed4 100644
--- a/platform/lang-impl/src/com/intellij/find/impl/FindPopupPanel.java
+++ b/platform/lang-impl/src/com/intellij/find/impl/FindPopupPanel.java
@@ -282,7 +282,7 @@
         @Override
         public void windowLostFocus(WindowEvent e) {
           Window oppositeWindow = e.getOppositeWindow();
-          if (oppositeWindow != null && oppositeWindow.getOwner() == w) {
+          if (oppositeWindow == w || oppositeWindow != null && oppositeWindow.getOwner() == w) {
             return;
           }
           if (canBeClosed()) {
