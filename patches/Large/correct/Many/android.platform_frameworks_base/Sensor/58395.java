diff --git a/core/java/android/hardware/Sensor.java b/core/java/android/hardware/Sensor.java
index e0c9d2c..41384d2 100644
--- a/core/java/android/hardware/Sensor.java
+++ b/core/java/android/hardware/Sensor.java
@@ -194,7 +194,8 @@
         return mMinDelay;
     }
 
-    int getHandle() {
+    /** @hide */
+    public int getHandle() {
         return mHandle;
     }
 
