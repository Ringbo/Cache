diff --git a/core/java/android/hardware/SensorManager.java b/core/java/android/hardware/SensorManager.java
index b931313..ac9189d 100644
--- a/core/java/android/hardware/SensorManager.java
+++ b/core/java/android/hardware/SensorManager.java
@@ -1359,7 +1359,7 @@
         float q2 = rotationVector[1];
         float q3 = rotationVector[2];
 
-        if (rotationVector.length == 4) {
+        if (rotationVector.length >= 4) {
             q0 = rotationVector[3];
         } else {
             q0 = 1 - q1*q1 - q2*q2 - q3*q3;
@@ -1416,7 +1416,7 @@
      *  @param Q an array of floats in which to store the computed quaternion
      */
     public static void getQuaternionFromVector(float[] Q, float[] rv) {
-        if (rv.length == 4) {
+        if (rv.length >= 4) {
             Q[0] = rv[3];
         } else {
             Q[0] = 1 - rv[0]*rv[0] - rv[1]*rv[1] - rv[2]*rv[2];
