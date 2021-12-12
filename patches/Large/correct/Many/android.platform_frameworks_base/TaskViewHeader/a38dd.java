diff --git a/packages/SystemUI/src/com/android/systemui/recents/views/TaskViewHeader.java b/packages/SystemUI/src/com/android/systemui/recents/views/TaskViewHeader.java
index eb26253..60a91bf 100644
--- a/packages/SystemUI/src/com/android/systemui/recents/views/TaskViewHeader.java
+++ b/packages/SystemUI/src/com/android/systemui/recents/views/TaskViewHeader.java
@@ -219,7 +219,7 @@
         Rect display = mSsp.getWindowRect();
         Rect taskRect = mSsp.getTaskBounds(t.key.stackId);
         int resId = R.drawable.star;
-        if (display.equals(taskRect)) {
+        if (display.equals(taskRect) || taskRect.isEmpty()) {
             resId = R.drawable.vector_drawable_place_fullscreen;
         } else {
             boolean top = display.top == taskRect.top;
