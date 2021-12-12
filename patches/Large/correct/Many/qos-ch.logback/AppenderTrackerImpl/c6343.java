diff --git a/logback-core/src/main/java/ch/qos/logback/core/sift/AppenderTrackerImpl.java b/logback-core/src/main/java/ch/qos/logback/core/sift/AppenderTrackerImpl.java
index 6135912..59d1033 100644
--- a/logback-core/src/main/java/ch/qos/logback/core/sift/AppenderTrackerImpl.java
+++ b/logback-core/src/main/java/ch/qos/logback/core/sift/AppenderTrackerImpl.java
@@ -107,7 +107,7 @@
   }
   
   
-  final private boolean isEntryStale(Entry entry, long now) {
+  private boolean isEntryStale(Entry entry, long now) {
     return ((entry.timestamp + THRESHOLD) < now);
   }
 
