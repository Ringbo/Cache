diff --git a/src/main/java/org/bytedeco/javacv/FFmpegFrameGrabber.java b/src/main/java/org/bytedeco/javacv/FFmpegFrameGrabber.java
index 29f92fa..1b70e60 100644
--- a/src/main/java/org/bytedeco/javacv/FFmpegFrameGrabber.java
+++ b/src/main/java/org/bytedeco/javacv/FFmpegFrameGrabber.java
@@ -355,10 +355,10 @@
                to ...666 and the given timestamp has been rounded to ...667
                (or vice versa)
             */
-            while (this.timestamp > timestamp + 1 && grabFrame(true, true, false, false) != null) {
+            while (this.timestamp > timestamp + 1 && grabFrame(false, true, false, false) != null) {
                 // flush frames if seeking backwards
             }
-            while (this.timestamp < timestamp - 1 && grabFrame(true, true, false, false) != null) {
+            while (this.timestamp < timestamp - 1 && grabFrame(false, true, false, false) != null) {
                 // decode up to the desired frame
             }
             if (video_c != null) {
