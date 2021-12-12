diff --git a/tests/RenderScriptTests/ImageProcessing/src/com/android/rs/image/TestBase.java b/tests/RenderScriptTests/ImageProcessing/src/com/android/rs/image/TestBase.java
index d4c4898..abe2e83 100644
--- a/tests/RenderScriptTests/ImageProcessing/src/com/android/rs/image/TestBase.java
+++ b/tests/RenderScriptTests/ImageProcessing/src/com/android/rs/image/TestBase.java
@@ -106,7 +106,7 @@
         return false;
     }
 
-    public final void createBaseTest(ImageProcessingActivity ipact, Bitmap b, Bitmap b2) {
+    public final void createBaseTest(ImageProcessingActivity ipact, Bitmap b, Bitmap b2, Bitmap outb) {
         act = ipact;
         mRS = RenderScript.create(act);
         mRS.setMessageHandler(new MessageProcessor(act));
@@ -117,7 +117,7 @@
         mInPixelsAllocation2 = Allocation.createFromBitmap(mRS, b2,
                                                           Allocation.MipmapControl.MIPMAP_NONE,
                                                           Allocation.USAGE_SCRIPT);
-        mOutPixelsAllocation = Allocation.createFromBitmap(mRS, b,
+        mOutPixelsAllocation = Allocation.createFromBitmap(mRS, outb,
                                                            Allocation.MipmapControl.MIPMAP_NONE,
                                                            Allocation.USAGE_SCRIPT);
         createTest(act.getResources());
