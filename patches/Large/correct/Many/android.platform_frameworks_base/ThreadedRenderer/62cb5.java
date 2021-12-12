diff --git a/core/java/android/view/ThreadedRenderer.java b/core/java/android/view/ThreadedRenderer.java
index 17035b1..74972c2 100644
--- a/core/java/android/view/ThreadedRenderer.java
+++ b/core/java/android/view/ThreadedRenderer.java
@@ -193,7 +193,7 @@
         Trace.traceBegin(Trace.TRACE_TAG_VIEW, "getDisplayList");
         HardwareCanvas canvas = mRootNode.start(mWidth, mHeight);
         try {
-            callbacks.onHardwarePostDraw(canvas);
+            callbacks.onHardwarePreDraw(canvas);
             canvas.drawDisplayList(view.getDisplayList());
             callbacks.onHardwarePostDraw(canvas);
         } finally {
