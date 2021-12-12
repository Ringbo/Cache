diff --git a/modules/suggest/src/test/org/apache/lucene/search/spell/TestSpellChecker.java b/modules/suggest/src/test/org/apache/lucene/search/spell/TestSpellChecker.java
index f5e7324..0799bb0 100755
--- a/modules/suggest/src/test/org/apache/lucene/search/spell/TestSpellChecker.java
+++ b/modules/suggest/src/test/org/apache/lucene/search/spell/TestSpellChecker.java
@@ -104,7 +104,7 @@
 
 
   public void testBuild() throws CorruptIndexException, IOException {
-    IndexReader r = IndexReader.open(userindex, true);
+    IndexReader r = IndexReader.open(userindex);
 
     spellChecker.clearIndex();
 
@@ -144,7 +144,7 @@
   }
 
   public void testComparator() throws Exception {
-    IndexReader r = IndexReader.open(userindex, true);
+    IndexReader r = IndexReader.open(userindex);
     Directory compIdx = newDirectory();
     SpellChecker compareSP = new SpellCheckerMock(compIdx, new LevensteinDistance(), new SuggestWordFrequencyComparator());
     addwords(r, compareSP, "field3");
@@ -162,7 +162,7 @@
   }
   
   public void testBogusField() throws Exception {
-    IndexReader r = IndexReader.open(userindex, true);
+    IndexReader r = IndexReader.open(userindex);
     Directory compIdx = newDirectory();
     SpellChecker compareSP = new SpellCheckerMock(compIdx, new LevensteinDistance(), new SuggestWordFrequencyComparator());
     addwords(r, compareSP, "field3");
@@ -177,7 +177,7 @@
   }
   
   public void testSuggestModes() throws Exception {
-    IndexReader r = IndexReader.open(userindex, true);
+    IndexReader r = IndexReader.open(userindex);
     spellChecker.clearIndex();
     addwords(r, spellChecker, "field1");
     
@@ -337,7 +337,7 @@
   }
 
   private int numdoc() throws IOException {
-    IndexReader rs = IndexReader.open(spellindex, true);
+    IndexReader rs = IndexReader.open(spellindex);
     int num = rs.numDocs();
     assertTrue(num != 0);
     //System.out.println("num docs: " + num);
@@ -346,7 +346,7 @@
   }
   
   public void testClose() throws IOException {
-    IndexReader r = IndexReader.open(userindex, true);
+    IndexReader r = IndexReader.open(userindex);
     spellChecker.clearIndex();
     String field = "field1";
     addwords(r, spellChecker, "field1");
@@ -402,7 +402,7 @@
    */
   public void testConcurrentAccess() throws IOException, InterruptedException {
     assertEquals(1, searchers.size());
-    final IndexReader r = IndexReader.open(userindex, true);
+    final IndexReader r = IndexReader.open(userindex);
     spellChecker.clearIndex();
     assertEquals(2, searchers.size());
     addwords(r, spellChecker, "field1");
