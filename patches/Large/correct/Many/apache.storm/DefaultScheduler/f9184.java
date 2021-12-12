diff --git a/storm-core/src/jvm/org/apache/storm/scheduler/DefaultScheduler.java b/storm-core/src/jvm/org/apache/storm/scheduler/DefaultScheduler.java
index 774e8fd..764c198 100644
--- a/storm-core/src/jvm/org/apache/storm/scheduler/DefaultScheduler.java
+++ b/storm-core/src/jvm/org/apache/storm/scheduler/DefaultScheduler.java
@@ -38,7 +38,7 @@
                 Integer workerCount = distribution.get(executorCount);
                 if (workerCount != null && workerCount > 0) {
                     slots.add(entry.getKey());
-                    executorCount--;
+                    workerCount--;
                     distribution.put(executorCount, workerCount);
                 }
             }
