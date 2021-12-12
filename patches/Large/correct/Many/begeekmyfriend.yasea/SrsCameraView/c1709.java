diff --git a/library/src/main/java/net/ossrs/yasea/SrsCameraView.java b/library/src/main/java/net/ossrs/yasea/SrsCameraView.java
index 965af78..a2b51ea 100644
--- a/library/src/main/java/net/ossrs/yasea/SrsCameraView.java
+++ b/library/src/main/java/net/ossrs/yasea/SrsCameraView.java
@@ -155,7 +155,7 @@
         }
         mCamera.getParameters().setPreviewSize(mPreviewWidth, mPreviewHeight);
 
-        mGLPreviewBuffer = ByteBuffer.allocateDirect(mPreviewWidth * mPreviewHeight * 4);
+        mGLPreviewBuffer = ByteBuffer.allocate(mPreviewWidth * mPreviewHeight * 4);
         mInputAspectRatio = mPreviewWidth > mPreviewHeight ?
             (float) mPreviewWidth / mPreviewHeight : (float) mPreviewHeight / mPreviewWidth;
 
