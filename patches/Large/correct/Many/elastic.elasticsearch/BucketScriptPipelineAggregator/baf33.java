diff --git a/server/src/main/java/org/elasticsearch/search/aggregations/pipeline/BucketScriptPipelineAggregator.java b/server/src/main/java/org/elasticsearch/search/aggregations/pipeline/BucketScriptPipelineAggregator.java
index bd93718..d19425e 100644
--- a/server/src/main/java/org/elasticsearch/search/aggregations/pipeline/BucketScriptPipelineAggregator.java
+++ b/server/src/main/java/org/elasticsearch/search/aggregations/pipeline/BucketScriptPipelineAggregator.java
@@ -108,13 +108,13 @@
             if (skipBucket) {
                 newBuckets.add(bucket);
             } else {
-                Double returned = factory.newInstance(vars).execute();
+                Number returned = factory.newInstance(vars).execute();
                 if (returned == null) {
                     newBuckets.add(bucket);
                 } else {
                     final List<InternalAggregation> aggs = StreamSupport.stream(bucket.getAggregations().spliterator(), false).map(
                         (p) -> (InternalAggregation) p).collect(Collectors.toList());
-                    aggs.add(new InternalSimpleValue(name(), returned, formatter, new ArrayList<>(), metaData()));
+                    aggs.add(new InternalSimpleValue(name(), returned.doubleValue(), formatter, new ArrayList<>(), metaData()));
                     InternalMultiBucketAggregation.InternalBucket newBucket = originalAgg.createBucket(new InternalAggregations(aggs),
                         bucket);
                     newBuckets.add(newBucket);
