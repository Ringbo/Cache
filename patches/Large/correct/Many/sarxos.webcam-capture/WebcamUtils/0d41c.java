diff --git a/webcam-capture/src/main/java/com/github/sarxos/webcam/WebcamUtils.java b/webcam-capture/src/main/java/com/github/sarxos/webcam/WebcamUtils.java
index b7a4ad8..c7024e4 100644
--- a/webcam-capture/src/main/java/com/github/sarxos/webcam/WebcamUtils.java
+++ b/webcam-capture/src/main/java/com/github/sarxos/webcam/WebcamUtils.java
@@ -37,7 +37,7 @@
 	}
 
 	public static final void capture(Webcam webcam, String filename) {
-		if (filename.endsWith(".jpg")) {
+		if (!filename.endsWith(".jpg")) {
 			filename = filename + ".jpg";
 		}
 		capture(webcam, new File(filename));
@@ -45,7 +45,7 @@
 
 	public static final void capture(Webcam webcam, String filename, String format) {
 		String ext = "." + format.toLowerCase();
-		if (!filename.startsWith(ext)) {
+		if (!filename.endsWith(ext)) {
 			filename = filename + ext;
 		}
 		capture(webcam, new File(filename), format);
