diff --git a/deeplearning4j-scaleout/deeplearning4j-scaleout-akka/src/main/java/org/deeplearning4j/scaleout/statetracker/hazelcast/StateTrackerDropWizardResource.java b/deeplearning4j-scaleout/deeplearning4j-scaleout-akka/src/main/java/org/deeplearning4j/scaleout/statetracker/hazelcast/StateTrackerDropWizardResource.java
index e517033..4372b74 100755
--- a/deeplearning4j-scaleout/deeplearning4j-scaleout-akka/src/main/java/org/deeplearning4j/scaleout/statetracker/hazelcast/StateTrackerDropWizardResource.java
+++ b/deeplearning4j-scaleout/deeplearning4j-scaleout-akka/src/main/java/org/deeplearning4j/scaleout/statetracker/hazelcast/StateTrackerDropWizardResource.java
@@ -134,7 +134,7 @@
 
 
     public void shutdown() {
-        if(env.getAdminContext() != null)
+        if(env != null && env.getAdminContext() != null)
             env.getAdminContext().shutdown();
         else
             return;
