diff --git a/packages/SystemUI/src/com/android/systemui/recents/views/RecentsView.java b/packages/SystemUI/src/com/android/systemui/recents/views/RecentsView.java
index c77a2f9..1a2f64e 100644
--- a/packages/SystemUI/src/com/android/systemui/recents/views/RecentsView.java
+++ b/packages/SystemUI/src/com/android/systemui/recents/views/RecentsView.java
@@ -312,7 +312,7 @@
     @Override
     protected void onAttachedToWindow() {
         EventBus.getDefault().register(this, RecentsActivity.EVENT_BUS_PRIORITY + 1);
-        EventBus.getDefault().register(mTouchHandler, RecentsActivity.EVENT_BUS_PRIORITY + 1);
+        EventBus.getDefault().register(mTouchHandler, RecentsActivity.EVENT_BUS_PRIORITY + 2);
         super.onAttachedToWindow();
     }
 
