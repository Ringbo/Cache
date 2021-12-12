diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/monitoring/CEQueueStatusImplConcurrentTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/monitoring/CEQueueStatusImplConcurrentTest.java
index 741807e..77a0ade 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/monitoring/CEQueueStatusImplConcurrentTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/monitoring/CEQueueStatusImplConcurrentTest.java
@@ -53,7 +53,7 @@
       executorService.submit(runnable);
     }
 
-    executorService.awaitTermination(5, TimeUnit.SECONDS);
+    executorService.awaitTermination(1, TimeUnit.SECONDS);
 
     assertThat(underTest.getReceivedCount()).isEqualTo(100);
     assertThat(underTest.getPendingCount()).isEqualTo(2);
