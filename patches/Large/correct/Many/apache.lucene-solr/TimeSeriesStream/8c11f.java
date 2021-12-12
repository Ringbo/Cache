diff --git a/solr/solrj/src/java/org/apache/solr/client/solrj/io/stream/TimeSeriesStream.java b/solr/solrj/src/java/org/apache/solr/client/solrj/io/stream/TimeSeriesStream.java
index e0761a1..bb965b0 100644
--- a/solr/solrj/src/java/org/apache/solr/client/solrj/io/stream/TimeSeriesStream.java
+++ b/solr/solrj/src/java/org/apache/solr/client/solrj/io/stream/TimeSeriesStream.java
@@ -91,17 +91,17 @@
     }
 
     String end = null;
-    if(startExpression != null) {
+    if(endExpression != null) {
       end = ((StreamExpressionValue)endExpression.getParameter()).getValue();
     }
 
     String gap = null;
-    if(startExpression != null) {
+    if(gapExpression != null) {
       gap = ((StreamExpressionValue)gapExpression.getParameter()).getValue();
     }
 
     String field = null;
-    if(startExpression != null) {
+    if(fieldExpression != null) {
       field = ((StreamExpressionValue)fieldExpression.getParameter()).getValue();
     }
 
