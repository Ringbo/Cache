diff --git a/core/src/main/java/org/apache/mahout/cf/taste/impl/eval/GenericRecommenderIRStatsEvaluator.java b/core/src/main/java/org/apache/mahout/cf/taste/impl/eval/GenericRecommenderIRStatsEvaluator.java
index b014a73..d7c4df5 100644
--- a/core/src/main/java/org/apache/mahout/cf/taste/impl/eval/GenericRecommenderIRStatsEvaluator.java
+++ b/core/src/main/java/org/apache/mahout/cf/taste/impl/eval/GenericRecommenderIRStatsEvaluator.java
@@ -150,7 +150,7 @@
     return new IRStatisticsImpl(precision.getAverage(), recall.getAverage(), fallOut.getAverage());
   }
 
-  private void processOtherUser(Object id,
+  private static void processOtherUser(Object id,
                                 Collection<Item> relevantItems,
                                 Collection<User> trainingUsers,
                                 User user2) {
