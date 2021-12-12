diff --git a/policy/com/android/internal/policy/impl/PhoneWindowManager.java b/policy/com/android/internal/policy/impl/PhoneWindowManager.java
index d8009e7..bf0f815 100644
--- a/policy/com/android/internal/policy/impl/PhoneWindowManager.java
+++ b/policy/com/android/internal/policy/impl/PhoneWindowManager.java
@@ -236,7 +236,8 @@
         @Override public void onChange(boolean selfChange) {
             update();
             try {
-                mWindowManager.setRotation(USE_LAST_ROTATION, false, 1);
+                mWindowManager.setRotation(USE_LAST_ROTATION, false,
+                        mFancyRotationAnimation);
             } catch (RemoteException e) {
                 // Ignore
             }
@@ -248,7 +249,7 @@
                 mEndcallBehavior = Settings.System.getInt(resolver,
                         Settings.System.END_BUTTON_BEHAVIOR, DEFAULT_ENDCALL_BEHAVIOR);
                 mFancyRotationAnimation = Settings.System.getInt(resolver,
-                        "fancy_rotation_animation", 0);
+                        "fancy_rotation_anim", 0) != 0 ? 0x80 : 0;
                 int accelerometerDefault = Settings.System.getInt(resolver,
                         Settings.System.ACCELEROMETER_ROTATION, DEFAULT_ACCELEROMETER_ROTATION);
                 if (mAccelerometerDefault != accelerometerDefault) {
@@ -260,7 +261,7 @@
                 boolean hasSoftInput = imId != null && imId.length() > 0;
                 if (mHasSoftInput != hasSoftInput) {
                     mHasSoftInput = hasSoftInput;
-                    updateRotation(1);
+                    updateRotation(0);
                 }
             }
         }
@@ -276,7 +277,8 @@
             // Send updates based on orientation value
             if (true) Log.i(TAG, "onOrientationChanged, rotation changed to " +rotation);
             try {
-                mWindowManager.setRotation(rotation, false, 1);
+                mWindowManager.setRotation(rotation, false,
+                        mFancyRotationAnimation);
             } catch (RemoteException e) {
                 // Ignore
             }
@@ -1266,7 +1268,7 @@
                 if (event.keycode == 0) {
                     // lid changed state
                     mLidOpen = event.value == 0;
-                    updateRotation(0);
+                    updateRotation(Surface.FLAGS_ORIENTATION_ANIMATION_DISABLE);
                     if (keyguardIsShowingTq()) {
                         if (mLidOpen) {
                             // only do this if it's opening -- closing the device shouldn't turn it
@@ -1742,7 +1744,7 @@
     /** {@inheritDoc} */
     public void enableScreenAfterBoot() {
         readLidState();
-        updateRotation(0);
+        updateRotation(Surface.FLAGS_ORIENTATION_ANIMATION_DISABLE);
     }
     
     void updateRotation(int animFlags) {
@@ -1755,7 +1757,8 @@
         //if lid is closed orientation will be portrait
         try {
             //set orientation on WindowManager
-            mWindowManager.setRotation(rotation, true, animFlags);
+            mWindowManager.setRotation(rotation, true,
+                    mFancyRotationAnimation | animFlags);
         } catch (RemoteException e) {
             // Ignore
         }
