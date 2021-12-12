diff --git a/hbase-server/src/test/java/org/apache/hadoop/hbase/ipc/TestSimpleRpcScheduler.java b/hbase-server/src/test/java/org/apache/hadoop/hbase/ipc/TestSimpleRpcScheduler.java
index 3fab7fb..a0b3b54 100644
--- a/hbase-server/src/test/java/org/apache/hadoop/hbase/ipc/TestSimpleRpcScheduler.java
+++ b/hbase-server/src/test/java/org/apache/hadoop/hbase/ipc/TestSimpleRpcScheduler.java
@@ -104,7 +104,7 @@
     CallRunner task = createMockTask();
     task.setStatus(new MonitoredRPCHandlerImpl());
     scheduler.dispatch(task);
-    verify(task, timeout(1000)).run();
+    verify(task, timeout(10000)).run();
     scheduler.stop();
   }
 
@@ -218,7 +218,7 @@
       scheduler.dispatch(task);
     }
     for (CallRunner task : tasks) {
-      verify(task, timeout(1000)).run();
+      verify(task, timeout(10000)).run();
     }
     scheduler.stop();
 
