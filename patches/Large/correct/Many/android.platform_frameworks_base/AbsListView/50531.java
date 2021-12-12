diff --git a/core/java/android/widget/AbsListView.java b/core/java/android/widget/AbsListView.java
index c2c8d16..0860892 100644
--- a/core/java/android/widget/AbsListView.java
+++ b/core/java/android/widget/AbsListView.java
@@ -3270,7 +3270,7 @@
                         final float vscroll = event.getAxisValue(MotionEvent.AXIS_VSCROLL);
                         if (vscroll != 0) {
                             final int delta = (int) (vscroll * getVerticalScrollFactor());
-                            if (trackMotionScroll(delta, delta)) {
+                            if (!trackMotionScroll(delta, delta)) {
                                 return true;
                             }
                         }
