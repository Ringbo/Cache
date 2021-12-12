diff --git a/webcam-capture/src/main/java/com/github/sarxos/webcam/ds/buildin/WebcamDefaultDevice.java b/webcam-capture/src/main/java/com/github/sarxos/webcam/ds/buildin/WebcamDefaultDevice.java
index 0574cd0..86e89af 100644
--- a/webcam-capture/src/main/java/com/github/sarxos/webcam/ds/buildin/WebcamDefaultDevice.java
+++ b/webcam-capture/src/main/java/com/github/sarxos/webcam/ds/buildin/WebcamDefaultDevice.java
@@ -244,7 +244,7 @@
 		int minSize = size.width * size.height * 3;
 		int curSize = target.remaining();
 
-		if (minSize < curSize) {
+		if (minSize > curSize) {
 			throw new IllegalArgumentException(String.format("Not enough remaining space in target buffer (%d necessary vs %d remaining)", minSize, curSize));
 		}
 
