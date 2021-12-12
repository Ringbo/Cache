diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/NotificationBackgroundView.java b/packages/SystemUI/src/com/android/systemui/statusbar/NotificationBackgroundView.java
index 0fc46e9..01aa8d1 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/NotificationBackgroundView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/NotificationBackgroundView.java
@@ -44,7 +44,7 @@
     }
 
     private void draw(Canvas canvas, Drawable drawable) {
-        if (drawable != null) {
+        if (drawable != null && mActualHeight > mClipTopAmount) {
             drawable.setBounds(0, mClipTopAmount, getWidth(), mActualHeight);
             drawable.draw(canvas);
         }
