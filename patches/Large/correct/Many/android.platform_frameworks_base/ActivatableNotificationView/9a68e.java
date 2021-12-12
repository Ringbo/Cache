diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/ActivatableNotificationView.java b/packages/SystemUI/src/com/android/systemui/statusbar/ActivatableNotificationView.java
index bae6a27..eec818b 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/ActivatableNotificationView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/ActivatableNotificationView.java
@@ -303,7 +303,7 @@
 
     @Override
     public boolean performClick() {
-        if (mWasActivatedOnDown || !mNeedsDimming) {
+        if (mWasActivatedOnDown || !mNeedsDimming || isTouchExplorationEnabled()) {
             return super.performClick();
         }
         return false;
