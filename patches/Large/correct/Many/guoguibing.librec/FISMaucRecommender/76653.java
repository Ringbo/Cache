diff --git a/core/src/main/java/net/librec/recommender/cf/ranking/FISMaucRecommender.java b/core/src/main/java/net/librec/recommender/cf/ranking/FISMaucRecommender.java
index 62ab444..28f6ee8 100644
--- a/core/src/main/java/net/librec/recommender/cf/ranking/FISMaucRecommender.java
+++ b/core/src/main/java/net/librec/recommender/cf/ranking/FISMaucRecommender.java
@@ -153,7 +153,7 @@
                         DenseVector qi = Q.row(i).add(delta_qi.scale(lRate));
                         Q.setRow(i, qi);
                         DenseVector delta_qj = t.scale(e).minus(Q.row(j).scale(beta));
-                        DenseVector qj = Q.row(j).add(delta_qj.scale(lRate));
+                        DenseVector qj = Q.row(j).minus(delta_qj.scale(lRate));
                         Q.setRow(j, qj);
 
                         // update x
