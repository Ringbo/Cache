diff --git a/main/launcher/src/main/java/org/cryptomator/launcher/InterProcessCommunicator.java b/main/launcher/src/main/java/org/cryptomator/launcher/InterProcessCommunicator.java
index 7c2e56c..1c57701 100644
--- a/main/launcher/src/main/java/org/cryptomator/launcher/InterProcessCommunicator.java
+++ b/main/launcher/src/main/java/org/cryptomator/launcher/InterProcessCommunicator.java
@@ -102,7 +102,7 @@
 			}
 			try {
 				int port = ClientCommunicator.readPort(portFilePath);
-				LOG.debug("Connecting to port {}...");
+				LOG.debug("Connecting to port {}...", port);
 				Registry registry = LocateRegistry.getRegistry("localhost", port, new ClientSocketFactory());
 				this.remote = (IpcProtocolRemote) registry.lookup(RMI_NAME);
 			} catch (IOException e) {
