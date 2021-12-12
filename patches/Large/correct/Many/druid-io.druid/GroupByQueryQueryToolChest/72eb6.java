diff --git a/processing/src/main/java/io/druid/query/groupby/GroupByQueryQueryToolChest.java b/processing/src/main/java/io/druid/query/groupby/GroupByQueryQueryToolChest.java
index 22816b5..e15f109 100644
--- a/processing/src/main/java/io/druid/query/groupby/GroupByQueryQueryToolChest.java
+++ b/processing/src/main/java/io/druid/query/groupby/GroupByQueryQueryToolChest.java
@@ -355,7 +355,7 @@
 
             while (aggsIter.hasNext()) {
               final AggregatorFactory factory = aggsIter.next();
-              Object agg = event.remove(factory.getName());
+              Object agg = event.get(factory.getName());
               if (agg != null) {
                 event.put(factory.getName(), factory.deserialize(agg));
               }
