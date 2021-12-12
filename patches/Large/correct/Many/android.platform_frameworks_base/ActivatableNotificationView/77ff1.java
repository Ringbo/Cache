diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/ActivatableNotificationView.java b/packages/SystemUI/src/com/android/systemui/statusbar/ActivatableNotificationView.java
index 5528bb9..7d76b9b 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/ActivatableNotificationView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/ActivatableNotificationView.java
@@ -312,7 +312,7 @@
 
     @Override
     public boolean performClick() {
-        if (mWasActivatedOnDown || !mNeedsDimming) {
+        if (mWasActivatedOnDown || !mNeedsDimming || isTouchExplorationEnabled()) {
             return super.performClick();
         }
         return false;
