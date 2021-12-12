diff --git a/core/src/main/java/net/librec/recommender/TensorRecommender.java b/core/src/main/java/net/librec/recommender/TensorRecommender.java
index 02ef3cd..9234aee 100644
--- a/core/src/main/java/net/librec/recommender/TensorRecommender.java
+++ b/core/src/main/java/net/librec/recommender/TensorRecommender.java
@@ -373,7 +373,7 @@
         }
 
         // check if converged
-        boolean converged = Math.abs(loss) < 1e-5;
+        boolean converged = Math.abs(delta_loss) < 1e-5;
 
         return converged;
     }
