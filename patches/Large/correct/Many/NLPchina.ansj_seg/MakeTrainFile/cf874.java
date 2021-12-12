diff --git a/src/main/java/org/ansj/app/crf/MakeTrainFile.java b/src/main/java/org/ansj/app/crf/MakeTrainFile.java
index e4a1fba..adc6f21 100644
--- a/src/main/java/org/ansj/app/crf/MakeTrainFile.java
+++ b/src/main/java/org/ansj/app/crf/MakeTrainFile.java
@@ -26,7 +26,7 @@
 
 		if (args != null && args.length == 2) {
 			inputPath = args[0];
-			inputPath = args[1];
+			outputPath = args[1];
 		}
 
 		if (StringUtil.isBlank(inputPath) || StringUtil.isBlank(outputPath)) {
