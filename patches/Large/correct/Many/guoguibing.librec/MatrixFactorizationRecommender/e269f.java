diff --git a/core/src/main/java/net/librec/recommender/MatrixFactorizationRecommender.java b/core/src/main/java/net/librec/recommender/MatrixFactorizationRecommender.java
index d1bef38..360c96a 100644
--- a/core/src/main/java/net/librec/recommender/MatrixFactorizationRecommender.java
+++ b/core/src/main/java/net/librec/recommender/MatrixFactorizationRecommender.java
@@ -116,7 +116,7 @@
         }
 
         if (isBoldDriver && iter > 1) {
-            learnRate = Math.abs(lastLoss) > Math.abs(loss) ? learnRate * 1.05f : learnRate * 0.95f;
+            learnRate = Math.abs(lastLoss) > Math.abs(loss) ? learnRate * 1.05f : learnRate * 0.5f;
         } else if (decay > 0 && decay < 1) {
             learnRate *= decay;
         }
