diff --git a/ejb3/src/main/java/org/jboss/as/ejb3/remote/protocol/versionone/VersionOneProtocolChannelReceiver.java b/ejb3/src/main/java/org/jboss/as/ejb3/remote/protocol/versionone/VersionOneProtocolChannelReceiver.java
index e93969f..4dcf0cb 100644
--- a/ejb3/src/main/java/org/jboss/as/ejb3/remote/protocol/versionone/VersionOneProtocolChannelReceiver.java
+++ b/ejb3/src/main/java/org/jboss/as/ejb3/remote/protocol/versionone/VersionOneProtocolChannelReceiver.java
@@ -173,7 +173,8 @@
         try {
             this.sendModuleUnAvailability(new DeploymentModuleIdentifier[]{deploymentModuleIdentifier});
         } catch (IOException e) {
-            logger.warn("Could not send module un-availability notification of module " + deploymentModuleIdentifier + " to channel " + this.channel, e);
+            // TODO: Change this to WARN once https://issues.jboss.org/browse/REM3-123 is fixed
+            logger.debug("Could not send module un-availability notification of module " + deploymentModuleIdentifier + " to channel " + this.channel, e);
         }
     }
 
