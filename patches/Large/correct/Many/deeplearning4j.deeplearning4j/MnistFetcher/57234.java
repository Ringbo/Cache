diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/base/MnistFetcher.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/base/MnistFetcher.java
index b435b7d..fe8c617 100755
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/base/MnistFetcher.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/base/MnistFetcher.java
@@ -107,7 +107,7 @@
 	private void tryDownloadingAFewTimes(int attempt, URL url, File f, String targetMD5) throws IOException {
 		int maxTries = 3;
 		boolean isCorrectFile = f.isFile() && checkMD5OfFile(targetMD5, f);
-		if (attempt < maxTries && !isCorrectFile) {
+		if (attempt < maxTries && isCorrectFile) {
 			FileUtils.copyURLToFile(url, f);
 		} else {
 			throw new IOException(
