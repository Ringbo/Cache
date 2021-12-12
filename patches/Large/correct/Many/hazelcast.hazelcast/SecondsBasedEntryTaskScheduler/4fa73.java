diff --git a/hazelcast/src/main/java/com/hazelcast/util/scheduler/SecondsBasedEntryTaskScheduler.java b/hazelcast/src/main/java/com/hazelcast/util/scheduler/SecondsBasedEntryTaskScheduler.java
index d34dc0b..6c90530 100644
--- a/hazelcast/src/main/java/com/hazelcast/util/scheduler/SecondsBasedEntryTaskScheduler.java
+++ b/hazelcast/src/main/java/com/hazelcast/util/scheduler/SecondsBasedEntryTaskScheduler.java
@@ -144,7 +144,7 @@
             if (second != null) {
                 final ConcurrentMap<Object, ScheduledEntry<K, V>> entries = scheduledEntries.get(second);
                 if (entries != null) {
-                    result = entries.remove(key);
+                    result = entries.remove(timeKey);
                 }
             }
         }
