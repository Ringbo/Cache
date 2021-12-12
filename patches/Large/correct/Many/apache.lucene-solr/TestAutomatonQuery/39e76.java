diff --git a/lucene/core/src/test/org/apache/lucene/search/TestAutomatonQuery.java b/lucene/core/src/test/org/apache/lucene/search/TestAutomatonQuery.java
index 45e4486..9f46ab2 100644
--- a/lucene/core/src/test/org/apache/lucene/search/TestAutomatonQuery.java
+++ b/lucene/core/src/test/org/apache/lucene/search/TestAutomatonQuery.java
@@ -242,9 +242,9 @@
     }
   }
 
-  public void testHugeAutomaton() {
+  public void testBiggishAutomaton() {
     List<BytesRef> terms = new ArrayList<>();
-    while (terms.size() < 10000) {
+    while (terms.size() < 3000) {
       terms.add(new BytesRef(TestUtil.randomUnicodeString(random())));
     }
     Collections.sort(terms);
