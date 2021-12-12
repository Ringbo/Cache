diff --git a/core/java/android/app/Activity.java b/core/java/android/app/Activity.java
index 23b5f29..946555f 100644
--- a/core/java/android/app/Activity.java
+++ b/core/java/android/app/Activity.java
@@ -5326,7 +5326,8 @@
      *
      * @hide
      */
-    void convertToTranslucent(TranslucentConversionListener callback, ActivityOptions options) {
+    public void convertToTranslucent(TranslucentConversionListener callback, 
+            ActivityOptions options) {
         boolean drawComplete;
         try {
             mTranslucentCallback = callback;
