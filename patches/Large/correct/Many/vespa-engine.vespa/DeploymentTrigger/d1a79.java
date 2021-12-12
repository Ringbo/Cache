diff --git a/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/deployment/DeploymentTrigger.java b/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/deployment/DeploymentTrigger.java
index 5bad3d6..d0296ca 100644
--- a/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/deployment/DeploymentTrigger.java
+++ b/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/deployment/DeploymentTrigger.java
@@ -269,9 +269,9 @@
 
         Deployment deployment = application.deployments().get(jobType.zone(controller.system()).get());
         return Optional.ofNullable(deployment).map(Deployment::at)
-                       .filter(ignored ->      (   application.change().upgrades(deployment.version())
+                       .filter(ignored ->    ! (   application.change().upgrades(deployment.version())
                                                 || application.change().upgrades(deployment.applicationVersion()))
-                                          && ! (   application.change().downgrades(deployment.version())
+                                          &&   (   application.change().downgrades(deployment.version())
                                                 || application.change().downgrades(deployment.applicationVersion())));
     }
 
