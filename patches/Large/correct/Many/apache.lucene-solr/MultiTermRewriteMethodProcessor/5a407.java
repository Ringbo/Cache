diff --git a/contrib/queryparser/src/java/org/apache/lucene/queryParser/standard/processors/MultiTermRewriteMethodProcessor.java b/contrib/queryparser/src/java/org/apache/lucene/queryParser/standard/processors/MultiTermRewriteMethodProcessor.java
index 57f4b85..d65a4ed 100644
--- a/contrib/queryparser/src/java/org/apache/lucene/queryParser/standard/processors/MultiTermRewriteMethodProcessor.java
+++ b/contrib/queryparser/src/java/org/apache/lucene/queryParser/standard/processors/MultiTermRewriteMethodProcessor.java
@@ -37,8 +37,7 @@
   protected QueryNode postProcessNode(QueryNode node) {
     
     // set setMultiTermRewriteMethod for WildcardQueryNode and PrefixWildcardQueryNode
-    if (node instanceof WildcardQueryNode || node instanceof  ParametricRangeQueryNode
-        || node instanceof ParametricRangeQueryNode) {
+    if (node instanceof WildcardQueryNode || node instanceof  ParametricRangeQueryNode) {
       
       if (!getQueryConfigHandler().hasAttribute(MultiTermRewriteMethodAttribute.class)) {
         // This should not happen, this attribute is created in the StandardQueryConfigHandler
