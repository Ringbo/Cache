diff --git a/connector/src/main/java/org/jboss/as/connector/deployers/processors/RaXmlDeploymentProcessor.java b/connector/src/main/java/org/jboss/as/connector/deployers/processors/RaXmlDeploymentProcessor.java
index 107ab3f..9e18388 100644
--- a/connector/src/main/java/org/jboss/as/connector/deployers/processors/RaXmlDeploymentProcessor.java
+++ b/connector/src/main/java/org/jboss/as/connector/deployers/processors/RaXmlDeploymentProcessor.java
@@ -167,7 +167,7 @@
                     switch (transition) {
                         case STARTING_to_UP: {
 
-                            CommonDeployment deploymentMD = ((ResourceAdapterDeploymentService) controller.getService()).getRaDeployment();
+                            CommonDeployment deploymentMD = ((ResourceAdapterXmlDeploymentService) controller.getService()).getRaxmlDeployment();
 
                             if (deploymentMD.getConnectionManagers() != null && deploymentMD.getConnectionManagers()[0].getPool() != null) {
                                 StatisticsPlugin poolStats = deploymentMD.getConnectionManagers()[0].getPool().getStatistics();
