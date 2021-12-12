diff --git a/addons/binding/org.openhab.binding.homematic/src/main/java/org/openhab/binding/homematic/internal/communicator/AbstractHomematicGateway.java b/addons/binding/org.openhab.binding.homematic/src/main/java/org/openhab/binding/homematic/internal/communicator/AbstractHomematicGateway.java
index 8f03fd6..bdb244e 100644
--- a/addons/binding/org.openhab.binding.homematic/src/main/java/org/openhab/binding/homematic/internal/communicator/AbstractHomematicGateway.java
+++ b/addons/binding/org.openhab.binding.homematic/src/main/java/org/openhab/binding/homematic/internal/communicator/AbstractHomematicGateway.java
@@ -866,7 +866,7 @@
                     // the CCU1 does not support the ping command, we need a workaround
                     getRpcClient(getDefaultInterface()).listBidcosInterfaces(getDefaultInterface());
                     // if there is no exception, connection is valid
-                    connectionConfirmed();
+                    pongReceived();
                 } else {
                     getRpcClient(getDefaultInterface()).ping(getDefaultInterface(), id);
                 }
