diff --git a/pinot-core/src/main/java/com/linkedin/pinot/core/startree/v2/builder/BaseSingleTreeBuilder.java b/pinot-core/src/main/java/com/linkedin/pinot/core/startree/v2/builder/BaseSingleTreeBuilder.java
index 4410103..c5c8344 100644
--- a/pinot-core/src/main/java/com/linkedin/pinot/core/startree/v2/builder/BaseSingleTreeBuilder.java
+++ b/pinot-core/src/main/java/com/linkedin/pinot/core/startree/v2/builder/BaseSingleTreeBuilder.java
@@ -305,7 +305,7 @@
       appendToStarTree(recordIterator.next());
     }
     int numStarTreeRecords = _numDocs;
-    LOGGER.info("Generated {} star-tree records from {} segment records", numSegmentRecords, numStarTreeRecords);
+    LOGGER.info("Generated {} star-tree records from {} segment records", numStarTreeRecords, numSegmentRecords);
 
     int numRecordsUnderStarNode = _numDocs - numStarTreeRecords;
     constructStarTree(_rootNode, 0, _numDocs);
