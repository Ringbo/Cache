diff --git a/core/java/android/view/MotionEvent.java b/core/java/android/view/MotionEvent.java
index d46660c..ae84e1e 100644
--- a/core/java/android/view/MotionEvent.java
+++ b/core/java/android/view/MotionEvent.java
@@ -516,14 +516,14 @@
         }
         
         final int NS = (ev.mNumPointers=o.mNumPointers) * NT;
-        if (ev.mStateSamples.length < NS) {
+        if (ev.mStateSamples.length >= NS) {
             System.arraycopy(o.mStateSamples, 0, ev.mStateSamples, 0, NS);
         } else {
             ev.mStateSamples = (int[])o.mStateSamples.clone();
         }
         
         final int ND = NS * NUM_SAMPLE_DATA;
-        if (ev.mDataSamples.length < ND) {
+        if (ev.mDataSamples.length >= ND) {
             System.arraycopy(o.mDataSamples, 0, ev.mDataSamples, 0, ND);
         } else {
             ev.mDataSamples = (float[])o.mDataSamples.clone();
