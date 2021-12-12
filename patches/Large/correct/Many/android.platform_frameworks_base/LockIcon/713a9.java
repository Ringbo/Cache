diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/LockIcon.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/LockIcon.java
index c241290..5c9446c 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/LockIcon.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/LockIcon.java
@@ -207,9 +207,9 @@
         if (mAccessibilityController == null) {
             return;
         }
-        boolean clickToUnlock = mAccessibilityController.isTouchExplorationEnabled();
+        boolean clickToUnlock = mAccessibilityController.isAccessibilityEnabled();
         boolean clickToForceLock = mUnlockMethodCache.isTrustManaged()
-                && !mAccessibilityController.isAccessibilityEnabled();
+                && !clickToUnlock;
         boolean longClickToForceLock = mUnlockMethodCache.isTrustManaged()
                 && !clickToForceLock;
         setClickable(clickToForceLock || clickToUnlock);
