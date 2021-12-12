diff --git a/camel-core/src/test/java/org/apache/camel/processor/aggregator/AlbertoAggregatorTest.java b/camel-core/src/test/java/org/apache/camel/processor/aggregator/AlbertoAggregatorTest.java
index 1e8d297..63306eb 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/aggregator/AlbertoAggregatorTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/aggregator/AlbertoAggregatorTest.java
@@ -187,7 +187,7 @@
                         from("direct:joinBrothers").aggregator(header(TYPE_HEADER),
                                 brothersAggregator);
 
-                agg.setBatchTimeout(1000L);
+                agg.setBatchTimeout(2000L);
                 agg.removeHeader(SURNAME_HEADER)
                         .removeHeader(TYPE_HEADER)
                         .to("mock:result");
