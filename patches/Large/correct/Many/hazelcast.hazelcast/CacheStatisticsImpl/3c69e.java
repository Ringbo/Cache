diff --git a/hazelcast/src/main/java/com/hazelcast/cache/impl/CacheStatisticsImpl.java b/hazelcast/src/main/java/com/hazelcast/cache/impl/CacheStatisticsImpl.java
index 5355448..409731d 100644
--- a/hazelcast/src/main/java/com/hazelcast/cache/impl/CacheStatisticsImpl.java
+++ b/hazelcast/src/main/java/com/hazelcast/cache/impl/CacheStatisticsImpl.java
@@ -296,12 +296,12 @@
         for (;;) {
             long nanos = removeTimeTakenNanos;
             if (nanos <= Long.MAX_VALUE - duration) {
-                if (REMOVALS_UPDATER.compareAndSet(this, nanos, nanos + duration)) {
+                if (REMOVE_TIME_TAKEN_NANOS_UPDATER.compareAndSet(this, nanos, nanos + duration)) {
                     return;
                 }
             } else {
                 //counter full. Just reset.
-                if (REMOVALS_UPDATER.compareAndSet(this, nanos, duration)) {
+                if (REMOVE_TIME_TAKEN_NANOS_UPDATER.compareAndSet(this, nanos, duration)) {
                     clear();
                     return;
                 }
