diff --git a/samples/RecordActivity.java b/samples/RecordActivity.java
index c8d54ae..0acd733 100644
--- a/samples/RecordActivity.java
+++ b/samples/RecordActivity.java
@@ -111,7 +111,7 @@
     private boolean isPreviewOn = false;
 
     /*Filter information, change boolean to true if adding a fitler*/
-    private boolean addFilter = false;
+    private boolean addFilter = true;
     private String filterString = "";
     FFmpegFrameFilter filter;
 
@@ -145,7 +145,7 @@
     private Button btnRecorderControl;
 
     /* The number of seconds in the continuous record loop (or 0 to disable loop). */
-    final int RECORD_LENGTH = 10;
+    final int RECORD_LENGTH = 0;
     Frame[] images;
     long[] timestamps;
     ShortBuffer[] samples;
@@ -562,7 +562,7 @@
                         filter.push(yuvImage);
                         Frame frame2;
                         while ((frame2 = filter.pull()) != null) {
-                            recorder.record(frame2);
+                            recorder.record(frame2, filter.getPixelFormat());
                         }
                     } else {
                         recorder.record(yuvImage);
