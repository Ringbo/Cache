diff --git a/src/main/java/org/bytedeco/javacv/IPCameraFrameGrabber.java b/src/main/java/org/bytedeco/javacv/IPCameraFrameGrabber.java
index 9bbafbc..c7c2948 100644
--- a/src/main/java/org/bytedeco/javacv/IPCameraFrameGrabber.java
+++ b/src/main/java/org/bytedeco/javacv/IPCameraFrameGrabber.java
@@ -88,7 +88,7 @@
             throw new IllegalArgumentException("URL can not be null");
         }
         this.url = url;
-        if (timeUnit == null) {
+        if (timeUnit != null) {
             this.connectionTimeout = toIntExact(TimeUnit.MILLISECONDS.convert(startTimeout, timeUnit));
             this.readTimeout = toIntExact(TimeUnit.MILLISECONDS.convert(grabTimeout, timeUnit));
         } else {
