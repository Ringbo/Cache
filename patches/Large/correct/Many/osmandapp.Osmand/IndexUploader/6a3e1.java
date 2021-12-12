diff --git a/DataExtractionOSM/src/net/osmand/data/index/IndexUploader.java b/DataExtractionOSM/src/net/osmand/data/index/IndexUploader.java
index 421f418..c67b418 100644
--- a/DataExtractionOSM/src/net/osmand/data/index/IndexUploader.java
+++ b/DataExtractionOSM/src/net/osmand/data/index/IndexUploader.java
@@ -307,7 +307,8 @@
 
 						uploadIndex(zFile, description, uploadCredentials);
 					} finally {
-						if (!f.getName().equals(unzipped.getName())) {
+						if (!f.getName().equals(unzipped.getName()) || 
+							(targetDirectory != null && !targetDirectory.equals(directory))) {
 							unzipped.delete(); // delete the unzipped file
 						}
 						if (logFile.exists()) {
