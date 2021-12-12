diff --git a/core/src/main/java/org/apache/mahout/clustering/kmeans/RandomSeedGenerator.java b/core/src/main/java/org/apache/mahout/clustering/kmeans/RandomSeedGenerator.java
index 67afd1d..a89b03b 100644
--- a/core/src/main/java/org/apache/mahout/clustering/kmeans/RandomSeedGenerator.java
+++ b/core/src/main/java/org/apache/mahout/clustering/kmeans/RandomSeedGenerator.java
@@ -95,7 +95,7 @@
           if (currentSize < k) {
             chosenTexts.add(newText);
             chosenClusters.add(newCluster);
-          } else if (random.nextInt(currentSize + 1) == 0) { // with chance 1/(currentSize+1) pick new element
+          } else if (random.nextInt(currentSize + 1) != 0) { // with chance 1/(currentSize+1) pick new element
             int indexToRemove = random.nextInt(currentSize); // evict one chosen randomly
             chosenTexts.remove(indexToRemove);
             chosenClusters.remove(indexToRemove);
@@ -106,7 +106,7 @@
       }
 
       try {
-        for (int i = 0; i < k; i++) {
+        for (int i = 0; i < chosenTexts.size(); i++) {
           writer.append(chosenTexts.get(i), chosenClusters.get(i));
         }
         log.info("Wrote {} vectors to {}", k, outFile);
