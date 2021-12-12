diff --git a/src/test/java/org/elasticsearch/common/lucene/search/XBooleanFilterTests.java b/src/test/java/org/elasticsearch/common/lucene/search/XBooleanFilterTests.java
index fabdb0f..d41d4dc 100644
--- a/src/test/java/org/elasticsearch/common/lucene/search/XBooleanFilterTests.java
+++ b/src/test/java/org/elasticsearch/common/lucene/search/XBooleanFilterTests.java
@@ -482,7 +482,7 @@
                     rightResult.or(rightIter);
                 }
 
-                assertThat(leftResult.cardinality(), equalTo(leftResult.cardinality()));
+                assertThat(leftResult.cardinality(), equalTo(rightResult.cardinality()));
                 for (int i = 0; i < reader.maxDoc(); i++) {
                     assertThat(errorMsg(clauses, topLevel) + " -- failed at index " + i, leftResult.get(i), equalTo(rightResult.get(i)));
                 }
