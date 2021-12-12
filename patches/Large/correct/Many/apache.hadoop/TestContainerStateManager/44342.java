diff --git a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/ozone/scm/container/TestContainerStateManager.java b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/ozone/scm/container/TestContainerStateManager.java
index 633e876..9b1a4c1 100644
--- a/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/ozone/scm/container/TestContainerStateManager.java
+++ b/hadoop-hdfs-project/hadoop-hdfs/src/test/java/org/apache/hadoop/ozone/scm/container/TestContainerStateManager.java
@@ -159,11 +159,13 @@
     scmContainerMapping.updateContainerState(container2,
         OzoneProtos.LifeCycleEvent.CREATED);
 
+    // space has already been allocated in container1, now container 2 should
+    // be chosen.
     info = stateManager
         .getMatchingContainer(OzoneConsts.GB * 3, containerOwner,
             xceiverClientManager.getType(), xceiverClientManager.getFactor(),
             OzoneProtos.LifeCycleState.OPEN);
-    Assert.assertEquals(container1, info.getContainerName());
+    Assert.assertEquals(container2, info.getContainerName());
   }
 
   @Test
