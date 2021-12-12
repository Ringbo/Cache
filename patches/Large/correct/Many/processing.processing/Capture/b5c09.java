diff --git a/video/Capture.java b/video/Capture.java
index 2d27095..9194767 100755
--- a/video/Capture.java
+++ b/video/Capture.java
@@ -143,9 +143,9 @@
       // workaround for bug with the intel macs
       QDGraphics qdgraphics = null; //new QDGraphics(qdrect);
       if (quicktime.util.EndianOrder.isNativeLittleEndian()) {
-        graphics = new QDGraphics(QDConstants.k32BGRAPixelFormat, qdrect);
+        qdgraphics = new QDGraphics(QDConstants.k32BGRAPixelFormat, qdrect);
       } else {
-        graphics = new QDGraphics(QDGraphics.kDefaultPixelFormat, qdrect);
+        qdgraphics = new QDGraphics(QDGraphics.kDefaultPixelFormat, qdrect);
       }
 
       capture = new SequenceGrabber();
