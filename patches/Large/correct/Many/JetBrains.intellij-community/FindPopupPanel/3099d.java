diff --git a/platform/lang-impl/src/com/intellij/find/impl/FindPopupPanel.java b/platform/lang-impl/src/com/intellij/find/impl/FindPopupPanel.java
index 1f0c7eb..40bd69b 100644
--- a/platform/lang-impl/src/com/intellij/find/impl/FindPopupPanel.java
+++ b/platform/lang-impl/src/com/intellij/find/impl/FindPopupPanel.java
@@ -195,7 +195,7 @@
         showPoint = new RelativePoint(parent, new Point((parent.getSize().width - getPreferredSize().width) / 2, height));
       }
       mySearchComponent.selectAll();
-      if (showPoint != null) {
+      if (showPoint != null && showPoint.getComponent() != null) {
         myBalloon.show(showPoint);
       } else {
         myBalloon.showCenteredInCurrentWindow(myProject);
