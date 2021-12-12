diff --git a/graphics/java/android/renderscript/RenderScript.java b/graphics/java/android/renderscript/RenderScript.java
index 0035142..77486b1 100644
--- a/graphics/java/android/renderscript/RenderScript.java
+++ b/graphics/java/android/renderscript/RenderScript.java
@@ -203,7 +203,7 @@
     ///////////////////////////////////////////////////////////////////////////////////
     //
 
-    RenderScript(Surface sur) {
+    public RenderScript(Surface sur) {
         mSurface = sur;
         mDev = nDeviceCreate();
         mContext = nContextCreate(mDev, mSurface, 0);
