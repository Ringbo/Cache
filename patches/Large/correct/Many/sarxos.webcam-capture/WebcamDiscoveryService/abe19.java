diff --git a/webcam-capture/src/main/java/com/github/sarxos/webcam/WebcamDiscoveryService.java b/webcam-capture/src/main/java/com/github/sarxos/webcam/WebcamDiscoveryService.java
index feaf981..49c510f 100644
--- a/webcam-capture/src/main/java/com/github/sarxos/webcam/WebcamDiscoveryService.java
+++ b/webcam-capture/src/main/java/com/github/sarxos/webcam/WebcamDiscoveryService.java
@@ -286,7 +286,7 @@
 
 		running = false;
 
-		if (runner != null) {
+		if (runner == null) {
 			return;
 		}
 
