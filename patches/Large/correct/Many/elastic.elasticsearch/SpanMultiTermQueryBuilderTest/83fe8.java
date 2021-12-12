diff --git a/core/src/test/java/org/elasticsearch/index/query/SpanMultiTermQueryBuilderTest.java b/core/src/test/java/org/elasticsearch/index/query/SpanMultiTermQueryBuilderTest.java
index c63b3e0..15e59b9 100644
--- a/core/src/test/java/org/elasticsearch/index/query/SpanMultiTermQueryBuilderTest.java
+++ b/core/src/test/java/org/elasticsearch/index/query/SpanMultiTermQueryBuilderTest.java
@@ -68,8 +68,8 @@
     @Test
     public void testUnsupportedInnerQueryType() throws IOException {
         QueryParseContext parseContext = createContext();
-        // test makes only sense if date field is mapped
-        if (parseContext.fieldMapper(DATE_FIELD_NAME) != null) {
+        // test makes only sense if we have at least one type registered with date field mapping
+        if (getCurrentTypes().length > 0 && parseContext.fieldMapper(DATE_FIELD_NAME) != null) {
             try {
                 RangeQueryBuilder query = new RangeQueryBuilder(DATE_FIELD_NAME);
                 new SpanMultiTermQueryBuilder(query).toQuery(createContext());
