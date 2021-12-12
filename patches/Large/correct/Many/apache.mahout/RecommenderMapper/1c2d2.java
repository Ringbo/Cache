diff --git a/core/src/main/java/org/apache/mahout/cf/taste/hadoop/item/RecommenderMapper.java b/core/src/main/java/org/apache/mahout/cf/taste/hadoop/item/RecommenderMapper.java
index a5fe979..3bef69a 100644
--- a/core/src/main/java/org/apache/mahout/cf/taste/hadoop/item/RecommenderMapper.java
+++ b/core/src/main/java/org/apache/mahout/cf/taste/hadoop/item/RecommenderMapper.java
@@ -127,7 +127,7 @@
     while (recommendationVectorIterator.hasNext()) {
       Vector.Element element = recommendationVectorIterator.next();
       int index = element.index();
-      if (userVector.get(index) != 0.0) {
+      if (userVector.get(index) == 0.0) {
         if (topItems.size() < recommendationsPerUser) {
           indexItemIDMap.get(new IntWritable(index), itemID);
           topItems.add(new GenericRecommendedItem(itemID.get(), (float) element.get()));
