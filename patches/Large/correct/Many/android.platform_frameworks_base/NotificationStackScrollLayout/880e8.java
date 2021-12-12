diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationStackScrollLayout.java b/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationStackScrollLayout.java
index 3e339d8..84a2770 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationStackScrollLayout.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/stack/NotificationStackScrollLayout.java
@@ -1228,7 +1228,7 @@
         if (!isScrollingEnabled()) {
             return false;
         }
-        if (ev.getY() < mQsContainer.getBottom()) {
+        if (ev.getY() < mQsContainer.getBottom() && !mIsBeingDragged) {
             return false;
         }
         mForcedScroll = null;
