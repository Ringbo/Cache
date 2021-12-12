diff --git a/src/main/java/com/tagtraum/perf/gcviewer/GCModel.java b/src/main/java/com/tagtraum/perf/gcviewer/GCModel.java
index f7dd7cb..75b18b9 100644
--- a/src/main/java/com/tagtraum/perf/gcviewer/GCModel.java
+++ b/src/main/java/com/tagtraum/perf/gcviewer/GCModel.java
@@ -321,7 +321,7 @@
             if (lastPauseTimeStamp > 0) {
                 // JRockit sometimes has special timestamps that seem to go back in time,
                 // omit them here
-                if (event.getTimestamp() - lastPauseTimeStamp > 0) {
+                if (event.getTimestamp() - lastPauseTimeStamp >= 0) {
                     pauseInterval.add(event.getTimestamp() - lastPauseTimeStamp);
                 }
             }
