diff --git a/src/test/java/org/elasticsearch/cluster/ClusterServiceTests.java b/src/test/java/org/elasticsearch/cluster/ClusterServiceTests.java
index 160cf25..b93f7a1 100644
--- a/src/test/java/org/elasticsearch/cluster/ClusterServiceTests.java
+++ b/src/test/java/org/elasticsearch/cluster/ClusterServiceTests.java
@@ -83,7 +83,7 @@
         clusterService1.submitStateUpdateTask("test2", new TimeoutClusterStateUpdateTask() {
             @Override
             public TimeValue timeout() {
-                return TimeValue.timeValueMillis(2);
+                return TimeValue.timeValueMillis(100);
             }
 
             @Override
@@ -102,7 +102,7 @@
             }
         });
 
-        assertThat(timedOut.await(500, TimeUnit.MILLISECONDS), equalTo(true));
+        assertThat(timedOut.await(1000, TimeUnit.MILLISECONDS), equalTo(true));
         block.countDown();
         Thread.sleep(100); // sleep a bit to double check that execute on the timed out update task is not called...
         assertThat(executeCalled.get(), equalTo(false));
