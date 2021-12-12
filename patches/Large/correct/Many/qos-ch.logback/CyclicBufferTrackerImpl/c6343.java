diff --git a/logback-core/src/main/java/ch/qos/logback/core/spi/CyclicBufferTrackerImpl.java b/logback-core/src/main/java/ch/qos/logback/core/spi/CyclicBufferTrackerImpl.java
index c7b5b1a..855eb33 100644
--- a/logback-core/src/main/java/ch/qos/logback/core/spi/CyclicBufferTrackerImpl.java
+++ b/logback-core/src/main/java/ch/qos/logback/core/spi/CyclicBufferTrackerImpl.java
@@ -145,7 +145,7 @@
     return map.size();
   }
 
-  final private boolean isEntryStale(Entry entry, long now) {
+  private boolean isEntryStale(Entry entry, long now) {
     return ((entry.timestamp + THRESHOLD) < now);
   }
 
