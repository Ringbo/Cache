diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/continuous/GridContinuousProcessor.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/continuous/GridContinuousProcessor.java
index c07cc13..e218790 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/continuous/GridContinuousProcessor.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/continuous/GridContinuousProcessor.java
@@ -210,7 +210,7 @@
                         if (msg.errs().isEmpty()) {
                             LocalRoutineInfo routine = locInfos.get(msg.routineId());
 
-                            if (routine != null) {
+                            if (routine != null && routine.handler().isForQuery()) {
                                 try {
                                     Map<Integer, Long> cntrs = msg.updateCounters();
 
@@ -889,7 +889,7 @@
         }
 
         try {
-            if (ctx.cache() != null && ctx.cache().internalCache(hnd.cacheName()) != null) {
+            if (hnd.isForQuery() && ctx.cache() != null && ctx.cache().internalCache(hnd.cacheName()) != null) {
                 Map<Integer, Long> cntrs = ctx.cache().internalCache(hnd.cacheName())
                     .context().topology().updateCounters();
 
@@ -897,7 +897,7 @@
             }
         }
         catch (Exception e) {
-            U.warn(log, "Failed to load partition counters.");
+            U.warn(log, "Failed to load partition counters.", e);
         }
 
         if (err != null)
