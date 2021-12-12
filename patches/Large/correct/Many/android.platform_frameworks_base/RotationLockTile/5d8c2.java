diff --git a/packages/SystemUI/src/com/android/systemui/qs/tiles/RotationLockTile.java b/packages/SystemUI/src/com/android/systemui/qs/tiles/RotationLockTile.java
index 915867b..6d2c8c0 100644
--- a/packages/SystemUI/src/com/android/systemui/qs/tiles/RotationLockTile.java
+++ b/packages/SystemUI/src/com/android/systemui/qs/tiles/RotationLockTile.java
@@ -73,8 +73,8 @@
                 : mController.isRotationLocked();
         final boolean userInitiated = arg != null ? ((UserBoolean) arg).userInitiated : false;
         state.visible = mController.isRotationLockAffordanceVisible();
-        if (state.value == rotationLocked) {
-            // No change, no need to update all the values.
+        if (state.value == rotationLocked && state.contentDescription != null) {
+            // No change and initialized, no need to update all the values.
             return;
         }
         state.value = rotationLocked;
