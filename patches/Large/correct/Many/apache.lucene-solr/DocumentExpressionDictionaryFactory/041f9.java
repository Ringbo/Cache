diff --git a/solr/core/src/java/org/apache/solr/spelling/suggest/DocumentExpressionDictionaryFactory.java b/solr/core/src/java/org/apache/solr/spelling/suggest/DocumentExpressionDictionaryFactory.java
index d5f9ced..5782ab8 100644
--- a/solr/core/src/java/org/apache/solr/spelling/suggest/DocumentExpressionDictionaryFactory.java
+++ b/solr/core/src/java/org/apache/solr/spelling/suggest/DocumentExpressionDictionaryFactory.java
@@ -99,7 +99,7 @@
     try {
       expression = JavascriptCompiler.compile(weightExpression);
     } catch (ParseException e) {
-      throw new RuntimeException();
+      throw new RuntimeException(e);
     }
     SimpleBindings bindings = new SimpleBindings();
     for (SortField sortField : sortFields) {
