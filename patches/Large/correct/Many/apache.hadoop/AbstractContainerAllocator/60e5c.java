diff --git a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/capacity/allocator/AbstractContainerAllocator.java b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/capacity/allocator/AbstractContainerAllocator.java
index 95e0533..36665d6 100644
--- a/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/capacity/allocator/AbstractContainerAllocator.java
+++ b/hadoop-yarn-project/hadoop-yarn/hadoop-yarn-server/hadoop-yarn-server-resourcemanager/src/main/java/org/apache/hadoop/yarn/server/resourcemanager/scheduler/capacity/allocator/AbstractContainerAllocator.java
@@ -96,7 +96,8 @@
         // This is a reserved container
         LOG.info("Reserved container " + " application="
             + application.getApplicationId() + " resource=" + allocatedResource
-            + " queue=" + this.toString() + " cluster=" + clusterResource);
+            + " queue=" + appInfo.getQueueName()
+            + " cluster=" + clusterResource);
         assignment.getAssignmentInformation().addReservationDetails(
             updatedContainer, application.getCSLeafQueue().getQueuePath());
         assignment.getAssignmentInformation().incrReservations();
@@ -124,9 +125,9 @@
         // Inform the ordering policy
         LOG.info("assignedContainer" + " application attempt=" + application
             .getApplicationAttemptId() + " container=" + updatedContainer
-            .getContainerId() + " queue=" + this + " clusterResource="
-            + clusterResource + " type=" + assignment.getType()
-            + " requestedPartition="
+            .getContainerId() + " queue=" + appInfo.getQueueName()
+            + " clusterResource=" + clusterResource
+            + " type=" + assignment.getType() + " requestedPartition="
             + updatedContainer.getNodeLabelExpression());
 
         assignment.getAssignmentInformation().addAllocationDetails(
