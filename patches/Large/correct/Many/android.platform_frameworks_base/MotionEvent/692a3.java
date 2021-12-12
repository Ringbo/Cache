diff --git a/core/java/android/view/MotionEvent.java b/core/java/android/view/MotionEvent.java
index 89b721d..d46660c 100644
--- a/core/java/android/view/MotionEvent.java
+++ b/core/java/android/view/MotionEvent.java
@@ -509,7 +509,7 @@
         ev.mYPrecision = o.mYPrecision;
         
         final int NT = ev.mNumSamples = o.mNumSamples;
-        if (ev.mTimeSamples.length < NT) {
+        if (ev.mTimeSamples.length >= NT) {
             System.arraycopy(o.mTimeSamples, 0, ev.mTimeSamples, 0, NT);
         } else {
             ev.mTimeSamples = (long[])o.mTimeSamples.clone();
