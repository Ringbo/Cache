diff --git a/android/src/main/java/org/reactnative/camera/tasks/BarCodeScannerAsyncTask.java b/android/src/main/java/org/reactnative/camera/tasks/BarCodeScannerAsyncTask.java
index 837db14..97a4426 100644
--- a/android/src/main/java/org/reactnative/camera/tasks/BarCodeScannerAsyncTask.java
+++ b/android/src/main/java/org/reactnative/camera/tasks/BarCodeScannerAsyncTask.java
@@ -41,7 +41,7 @@
       BinaryBitmap bitmap = generateBitmapFromImageData(mImageData, mWidth, mHeight);
       result = mMultiFormatReader.decodeWithState(bitmap);
     } catch (NotFoundException e) {
-      BinaryBitmap bitmap = generateBitmapFromImageData(rotateImage(mImageData,mWidth, mHeight), mWidth, mHeight);
+      BinaryBitmap bitmap = generateBitmapFromImageData(rotateImage(mImageData,mWidth, mHeight), mHeight, mWidth);
       try {
         result = mMultiFormatReader.decodeWithState(bitmap);
       } catch (NotFoundException e1) {
