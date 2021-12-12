diff --git a/modules/suggest/src/test/org/apache/lucene/search/spell/TestLuceneDictionary.java b/modules/suggest/src/test/org/apache/lucene/search/spell/TestLuceneDictionary.java
index f8c6c83..c18b2c5 100644
--- a/modules/suggest/src/test/org/apache/lucene/search/spell/TestLuceneDictionary.java
+++ b/modules/suggest/src/test/org/apache/lucene/search/spell/TestLuceneDictionary.java
@@ -84,7 +84,7 @@
   
   public void testFieldNonExistent() throws IOException {
     try {
-      indexReader = IndexReader.open(store, true);
+      indexReader = IndexReader.open(store);
 
       ld = new LuceneDictionary(indexReader, "nonexistent_field");
       it = ld.getWordsIterator();
@@ -98,7 +98,7 @@
 
   public void testFieldAaa() throws IOException {
     try {
-      indexReader = IndexReader.open(store, true);
+      indexReader = IndexReader.open(store);
 
       ld = new LuceneDictionary(indexReader, "aaa");
       it = ld.getWordsIterator();
@@ -114,7 +114,7 @@
 
   public void testFieldContents_1() throws IOException {
     try {
-      indexReader = IndexReader.open(store, true);
+      indexReader = IndexReader.open(store);
 
       ld = new LuceneDictionary(indexReader, "contents");
       it = ld.getWordsIterator();
@@ -144,7 +144,7 @@
 
   public void testFieldContents_2() throws IOException {
     try {
-      indexReader = IndexReader.open(store, true);
+      indexReader = IndexReader.open(store);
 
       ld = new LuceneDictionary(indexReader, "contents");
       it = ld.getWordsIterator();
@@ -176,7 +176,7 @@
 
   public void testFieldZzz() throws IOException {
     try {
-      indexReader = IndexReader.open(store, true);
+      indexReader = IndexReader.open(store);
 
       ld = new LuceneDictionary(indexReader, "zzz");
       it = ld.getWordsIterator();
@@ -194,7 +194,7 @@
   public void testSpellchecker() throws IOException {
     Directory dir = newDirectory();
     SpellChecker sc = new SpellChecker(dir);
-    indexReader = IndexReader.open(store, true);
+    indexReader = IndexReader.open(store);
     sc.indexDictionary(new LuceneDictionary(indexReader, "contents"), newIndexWriterConfig(TEST_VERSION_CURRENT, null), false);
     String[] suggestions = sc.suggestSimilar("Tam", 1);
     assertEquals(1, suggestions.length);
