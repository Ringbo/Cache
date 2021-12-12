diff --git a/core/src/main/java/net/librec/recommender/AbstractRecommender.java b/core/src/main/java/net/librec/recommender/AbstractRecommender.java
index ded1038..4b2b4c1 100644
--- a/core/src/main/java/net/librec/recommender/AbstractRecommender.java
+++ b/core/src/main/java/net/librec/recommender/AbstractRecommender.java
@@ -472,7 +472,7 @@
         }
 
         // check if converged
-        boolean converged = Math.abs(loss) < 1e-5;
+        boolean converged = Math.abs(delta_loss) < 1e-5;
 
         return converged;
     }
