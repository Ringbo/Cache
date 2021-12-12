diff --git a/logback-core/src/test/java/ch/qos/logback/core/spi/CyclicBufferTracker_TImpl.java b/logback-core/src/test/java/ch/qos/logback/core/spi/CyclicBufferTracker_TImpl.java
index 4ac331a..79545ce 100644
--- a/logback-core/src/test/java/ch/qos/logback/core/spi/CyclicBufferTracker_TImpl.java
+++ b/logback-core/src/test/java/ch/qos/logback/core/spi/CyclicBufferTracker_TImpl.java
@@ -96,7 +96,7 @@
     }
   }
 
-  final private boolean isEntryStale(TEntry entry, long now) {
+  private boolean isEntryStale(TEntry entry, long now) {
     return ((entry.timestamp + THRESHOLD) < now);
   }
 
