diff --git a/querydsl-lucene/src/test/java/com/mysema/query/LuceneSerializerTest.java b/querydsl-lucene/src/test/java/com/mysema/query/LuceneSerializerTest.java
index 9c52b59..580b72e 100644
--- a/querydsl-lucene/src/test/java/com/mysema/query/LuceneSerializerTest.java
+++ b/querydsl-lucene/src/test/java/com/mysema/query/LuceneSerializerTest.java
@@ -637,7 +637,7 @@
 
     @Test
     public void various() throws Exception{
-        MatchingFilters filters = new MatchingFilters(Module.LUCENE, Target.LUCENE);
+        MatchingFiltersFactory filters = new MatchingFiltersFactory(Module.LUCENE, Target.LUCENE);
         for (BooleanExpression filter : filters.string(title, StringConstant.create("jurassic park"))){
             if (unsupportedOperation(filter)) {
                 continue;
