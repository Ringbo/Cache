diff --git a/runners/core-java/src/main/java/org/apache/beam/runners/core/ReduceFnRunner.java b/runners/core-java/src/main/java/org/apache/beam/runners/core/ReduceFnRunner.java
index 78c4e0b..66fb27c 100644
--- a/runners/core-java/src/main/java/org/apache/beam/runners/core/ReduceFnRunner.java
+++ b/runners/core-java/src/main/java/org/apache/beam/runners/core/ReduceFnRunner.java
@@ -943,7 +943,7 @@
     directContext.timers().deleteTimer(eow, TimeDomain.EVENT_TIME);
     Instant gc = garbageCollectionTime(directContext.window());
     if (gc.isAfter(eow)) {
-      directContext.timers().deleteTimer(eow, TimeDomain.EVENT_TIME);
+      directContext.timers().deleteTimer(gc, TimeDomain.EVENT_TIME);
     }
   }
 
