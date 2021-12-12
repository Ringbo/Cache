diff --git a/DataExtractionOSM/src/net/osmand/data/index/IndexBatchCreator.java b/DataExtractionOSM/src/net/osmand/data/index/IndexBatchCreator.java
index fb58b09..eb2c2d7 100644
--- a/DataExtractionOSM/src/net/osmand/data/index/IndexBatchCreator.java
+++ b/DataExtractionOSM/src/net/osmand/data/index/IndexBatchCreator.java
@@ -377,7 +377,7 @@
 				continue;
 			}
 			if (f.getName().endsWith(".osm.bz2") || f.getName().endsWith(".osm") || f.getName().endsWith(".osm.pbf")) {
-				generateIndex(f, null, alreadyGeneratedFiles, alreadyUploadedFiles);
+				generateIndex(f, null, null, alreadyGeneratedFiles, alreadyUploadedFiles);
 			}
 		}
 		System.out.println("GENERATING INDEXES FINISHED ");
