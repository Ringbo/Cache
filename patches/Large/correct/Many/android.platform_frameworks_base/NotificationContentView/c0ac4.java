diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/NotificationContentView.java b/packages/SystemUI/src/com/android/systemui/statusbar/NotificationContentView.java
index d759f5a..8f160dc 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/NotificationContentView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/NotificationContentView.java
@@ -1199,10 +1199,10 @@
         if (mExpandedChild != null && mExpandedChild.getHeight() != 0) {
             if ((!mIsHeadsUp && !mHeadsUpAnimatingAway)
                     || mHeadsUpChild == null || mContainingNotification.isOnKeyguard()) {
-                if (mExpandedChild.getHeight() == mContractedChild.getHeight()) {
+                if (mExpandedChild.getHeight() <= mContractedChild.getHeight()) {
                     expandable = false;
                 }
-            } else if (mExpandedChild.getHeight() == mHeadsUpChild.getHeight()) {
+            } else if (mExpandedChild.getHeight() <= mHeadsUpChild.getHeight()) {
                 expandable = false;
             }
         }
