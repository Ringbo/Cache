diff --git a/webcam-capture-drivers/webcam-capture-driver-openimaj/src/main/java/com/github/sarxos/webcam/ds/openimaj/OpenImajDevice.java b/webcam-capture-drivers/webcam-capture-driver-openimaj/src/main/java/com/github/sarxos/webcam/ds/openimaj/OpenImajDevice.java
index 31c38fc..f43ae97 100644
--- a/webcam-capture-drivers/webcam-capture-driver-openimaj/src/main/java/com/github/sarxos/webcam/ds/openimaj/OpenImajDevice.java
+++ b/webcam-capture-drivers/webcam-capture-driver-openimaj/src/main/java/com/github/sarxos/webcam/ds/openimaj/OpenImajDevice.java
@@ -73,7 +73,7 @@
 		}
 
 		// TODO scale to dimension if not equal
-		return ImageUtilities.createBufferedImage(capture.getNextFrame());
+		return ImageUtilities.createBufferedImageForDisplay(capture.getNextFrame());
 	}
 
 	@Override
