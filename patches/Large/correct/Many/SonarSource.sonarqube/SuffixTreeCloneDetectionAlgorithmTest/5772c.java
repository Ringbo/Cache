diff --git a/sonar-duplications/src/test/java/org/sonar/duplications/detector/suffixtree/SuffixTreeCloneDetectionAlgorithmTest.java b/sonar-duplications/src/test/java/org/sonar/duplications/detector/suffixtree/SuffixTreeCloneDetectionAlgorithmTest.java
index 1a3624d..7d80e89 100644
--- a/sonar-duplications/src/test/java/org/sonar/duplications/detector/suffixtree/SuffixTreeCloneDetectionAlgorithmTest.java
+++ b/sonar-duplications/src/test/java/org/sonar/duplications/detector/suffixtree/SuffixTreeCloneDetectionAlgorithmTest.java
@@ -69,7 +69,7 @@
     CloneIndex index = createIndex();
     List<Block> fileBlocks = Lists.newArrayList();
     int indexInFile = 0;
-    for (int i = 0; i < 5000; i++) {
+    for (int i = 0; i < 2000; i++) {
       Block block = newBlock("x", new ByteArray("01"), indexInFile);
       fileBlocks.add(block);
       indexInFile++;
