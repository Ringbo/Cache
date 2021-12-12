diff --git a/core/src/main/java/net/librec/recommender/cf/rating/SVDPlusPlusRecommender.java b/core/src/main/java/net/librec/recommender/cf/rating/SVDPlusPlusRecommender.java
index 164d4d9..d969e6f 100644
--- a/core/src/main/java/net/librec/recommender/cf/rating/SVDPlusPlusRecommender.java
+++ b/core/src/main/java/net/librec/recommender/cf/rating/SVDPlusPlusRecommender.java
@@ -148,7 +148,7 @@
             userImpFactor.scaleEqual(1.0 / impNor);
         }
         // sum with user factors
-        userImpFactor.add(userFactors.row(userIdx, false));
+        userImpFactor.addEqual(userFactors.row(userIdx, false));
 
         return predictRating + userImpFactor.inner(itemFactors.row(itemIdx, false));
     }
