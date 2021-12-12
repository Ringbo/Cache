diff --git a/DataExtractionOSM/src/net/osmand/data/preparation/IndexCreator.java b/DataExtractionOSM/src/net/osmand/data/preparation/IndexCreator.java
index a259446..2e869da 100644
--- a/DataExtractionOSM/src/net/osmand/data/preparation/IndexCreator.java
+++ b/DataExtractionOSM/src/net/osmand/data/preparation/IndexCreator.java
@@ -323,7 +323,7 @@
 	
 	private void createDatabaseIndexesStructure() throws SQLException, IOException {
 		// 2.1 create temporary sqlite database to put temporary results to it
-		if (indexMap || indexAddress || indexTransport) {
+		if (indexMap || indexAddress || indexTransport || indexPOI) {
 			mapFile = new File(workingDir, getMapFileName());
 			// to save space
 			mapFile.getParentFile().mkdirs();
