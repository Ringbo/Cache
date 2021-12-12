diff --git a/core/src/main/java/net/librec/eval/ranking/DiversityEvaluator.java b/core/src/main/java/net/librec/eval/ranking/DiversityEvaluator.java
index 937940b..39e9eea 100644
--- a/core/src/main/java/net/librec/eval/ranking/DiversityEvaluator.java
+++ b/core/src/main/java/net/librec/eval/ranking/DiversityEvaluator.java
@@ -53,7 +53,7 @@
             SymmMatrix itemSimilarity = similarities.get("item").getSimilarityMatrix();
             for (int userID = 0; userID < numUsers; userID++) {
                 List<ItemEntry<Integer, Double>> recommendArrayListByUser = recommendedList.getItemIdxListByUserIdx(userID);
-                if (recommendArrayListByUser.size() > 0) {
+                if (recommendArrayListByUser.size() > 1) {
                     // calculate the sum of dissimilarities for each pair of items per user
                     double totalDisSimilarityPerUser = 0.0;
                     int topK = this.topN <= recommendArrayListByUser.size() ? this.topN : recommendArrayListByUser.size();
