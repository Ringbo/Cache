diff --git a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
index fefd4fb..e171aa0 100755
--- a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
+++ b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
@@ -1045,7 +1045,7 @@
         } else {
             mHdmiRotation = mLandscapeRotation;
         }
-        mHdmiRotationLock = SystemProperties.getBoolean("persist.demo.hdmirotationlock", true);
+        mHdmiRotationLock = SystemProperties.getBoolean("persist.demo.hdmirotationlock", false);
     }
 
     public void updateSettings() {
