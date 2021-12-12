diff --git a/commons/src/main/java/org/archive/io/RecordingOutputStream.java b/commons/src/main/java/org/archive/io/RecordingOutputStream.java
index a077de2..dfec4f3 100644
--- a/commons/src/main/java/org/archive/io/RecordingOutputStream.java
+++ b/commons/src/main/java/org/archive/io/RecordingOutputStream.java
@@ -307,7 +307,7 @@
             throw new RecorderTimeoutException(); 
         }
         // need to throttle reading to hit max configured rate? 
-        if(position/duration > maxRateBytesPerMs) {
+        if(position/duration >= maxRateBytesPerMs) {
             long desiredDuration = position / maxRateBytesPerMs;
             try {
                 Thread.sleep(desiredDuration-duration);
