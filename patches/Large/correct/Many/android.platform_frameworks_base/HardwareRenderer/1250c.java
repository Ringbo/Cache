diff --git a/core/java/android/view/HardwareRenderer.java b/core/java/android/view/HardwareRenderer.java
index c078c08..0cf7ae6 100644
--- a/core/java/android/view/HardwareRenderer.java
+++ b/core/java/android/view/HardwareRenderer.java
@@ -609,7 +609,7 @@
                         DisplayList displayList = view.getDisplayList();
                         if (displayList != null) {
                             if (canvas.drawDisplayList(displayList, mRedrawClip)) {
-                                if (mRedrawClip.isEmpty()) {
+                                if (mRedrawClip.isEmpty() || view.getParent() == null) {
                                     view.invalidate();
                                 } else {
                                     view.getParent().invalidateChild(view, mRedrawClip);
