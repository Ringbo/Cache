diff --git a/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/ApplicationController.java b/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/ApplicationController.java
index 9ca9dcc..317a01e 100644
--- a/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/ApplicationController.java
+++ b/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/ApplicationController.java
@@ -335,7 +335,7 @@
             ConfigServerClient.PreparedApplication preparedApplication;
             DeploymentId deploymentId = new DeploymentId(applicationId, zone);
             // TODO: Using deploy() only in CD and in AWS for now
-            if (controller.system().equals(SystemName.cd) && deploymentId.zoneId().region().value().equals("aws-us-east-1a")) {
+            if (controller.system().equals(SystemName.cd) || deploymentId.zoneId().region().value().equals("aws-us-east-1a")) {
                 preparedApplication = configServer.deploy(deploymentId, options, cnames, rotationNames, applicationPackage.zippedContent());
             } else {
                 preparedApplication = configServer.prepare(deploymentId, options, cnames, rotationNames, applicationPackage.zippedContent());
