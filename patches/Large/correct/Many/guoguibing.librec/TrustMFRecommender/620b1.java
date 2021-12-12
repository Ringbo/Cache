diff --git a/core/src/main/java/net/librec/recommender/context/rating/TrustMFRecommender.java b/core/src/main/java/net/librec/recommender/context/rating/TrustMFRecommender.java
index 1d6f27d..e5dbee0 100644
--- a/core/src/main/java/net/librec/recommender/context/rating/TrustMFRecommender.java
+++ b/core/src/main/java/net/librec/recommender/context/rating/TrustMFRecommender.java
@@ -125,7 +125,7 @@
 
                 loss += error * error;
 
-                double deriValue = Maths.logisticGradientValue(rating) * error;
+                double deriValue = Maths.logisticGradientValue(predictRating) * error;
                 for (int factorIdx = 0; factorIdx < numFactors; factorIdx++) {
                     double trusterUserTrusterFactorValue = trusterUserTrusterFactors.get(userIdx, factorIdx);
                     double trusterItemFactorValue = trusterItemFactors.get(itemIdx, factorIdx);
