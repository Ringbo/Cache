diff --git a/logback-core/src/test/java/ch/qos/logback/core/sift/tracker/AppenderTrackerTImpl.java b/logback-core/src/test/java/ch/qos/logback/core/sift/tracker/AppenderTrackerTImpl.java
index f6edb1c..2dd5c51 100644
--- a/logback-core/src/test/java/ch/qos/logback/core/sift/tracker/AppenderTrackerTImpl.java
+++ b/logback-core/src/test/java/ch/qos/logback/core/sift/tracker/AppenderTrackerTImpl.java
@@ -85,7 +85,7 @@
 
   }
 
-  final private boolean isEntryStale(TEntry entry, long now) {
+  private boolean isEntryStale(TEntry entry, long now) {
     return ((entry.timestamp + THRESHOLD) < now);
   }
 
