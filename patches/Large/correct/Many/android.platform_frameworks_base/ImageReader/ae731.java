diff --git a/media/java/android/media/ImageReader.java b/media/java/android/media/ImageReader.java
index f3356c9..b14a899 100644
--- a/media/java/android/media/ImageReader.java
+++ b/media/java/android/media/ImageReader.java
@@ -194,7 +194,7 @@
 
         Looper looper;
         mHandler = handler;
-        if (mHandler == null) {
+        if (listener != null && mHandler == null) {
             if ((looper = Looper.myLooper()) != null) {
                 mHandler = new Handler();
             } else {
@@ -283,7 +283,7 @@
             return;
         }
 
-        if (ir.mHandler != null) {
+        if (ir.mHandler != null && ir.mImageListener != null) {
             ir.mHandler.post(new Runnable() {
                 @Override
                 public void run() {
