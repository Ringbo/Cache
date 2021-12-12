diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-client/src/test/java/org/apache/hadoop/yarn/client/api/impl/TestNMClient.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-client/src/test/java/org/apache/hadoop/yarn/client/api/impl/TestNMClient.java
index 88dbf81..0d4a271 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-client/src/test/java/org/apache/hadoop/yarn/client/api/impl/TestNMClient.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-client/src/test/java/org/apache/hadoop/yarn/client/api/impl/TestNMClient.java
@@ -344,10 +344,11 @@
         // getContainerStatus can be called after stopContainer
         try {
           // O is possible if CLEANUP_CONTAINER is executed too late
-          // 137 is possible if the container is not terminated but killed
+          // -105 is possible if the container is not terminated but killed
           testGetContainerStatus(container, i, ContainerState.COMPLETE,
               "Container killed by the ApplicationMaster.", Arrays.asList(
-                  new Integer[] {ContainerExitStatus.KILLED_BY_APPMASTER}));
+                  new Integer[] {ContainerExitStatus.KILLED_BY_APPMASTER,
+                  ContainerExitStatus.SUCCESS}));
         } catch (YarnException e) {
           // The exception is possible because, after the container is stopped,
           // it may be removed from NM's context.
@@ -383,7 +384,10 @@
           assertEquals(container.getId(), status.getContainerId());
           assertTrue("" + index + ": " + status.getDiagnostics(),
               status.getDiagnostics().contains(diagnostics));
-          assertTrue(exitStatuses.contains(status.getExitStatus()));
+          
+          assertTrue("Exit Statuses are supposed to be in: " + exitStatuses +
+              ", but the actual exit status code is: " + status.getExitStatus(),
+              exitStatuses.contains(status.getExitStatus()));
           break;
         }
         Thread.sleep(100);
