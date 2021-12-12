diff --git a/solr/core/src/java/org/apache/solr/handler/sql/SolrAggregate.java b/solr/core/src/java/org/apache/solr/handler/sql/SolrAggregate.java
index 983ab76..8c4d46d 100644
--- a/solr/core/src/java/org/apache/solr/handler/sql/SolrAggregate.java
+++ b/solr/core/src/java/org/apache/solr/handler/sql/SolrAggregate.java
@@ -73,7 +73,7 @@
       AggregateCall aggCall = namedAggCall.getKey();
 
       Pair<String, String> metric = toSolrMetric(implementor, aggCall, inNames);
-      implementor.addReverseAggMapping(namedAggCall.getValue(), metric.getKey().toLowerCase()+"("+metric.getValue()+")");
+      implementor.addReverseAggMapping(namedAggCall.getValue(), metric.getKey().toLowerCase(Locale.ROOT)+"("+metric.getValue()+")");
       implementor.addMetricPair(namedAggCall.getValue(), metric.getKey(), metric.getValue());
       if(aggCall.getName() == null) {
         implementor.addFieldMapping(namedAggCall.getValue(),
