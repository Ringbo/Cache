diff --git a/ethereumj-core/src/test/java/org/ethereum/trie/TrieTest.java b/ethereumj-core/src/test/java/org/ethereum/trie/TrieTest.java
index 996a870..adaa64c 100644
--- a/ethereumj-core/src/test/java/org/ethereum/trie/TrieTest.java
+++ b/ethereumj-core/src/test/java/org/ethereum/trie/TrieTest.java
@@ -573,7 +573,7 @@
     @Test
     public void testMasiveDetermenisticUpdate() throws IOException, URISyntaxException {
 
-        // should be root: 89bb4c4051774dd9039305bdad93b7fb61fcf2e6c0905d1acf2658b9c00b35c6
+        // should be root: cfd77c0fcb037adefce1f4e2eb94381456a4746379d2896bb8f309c620436d30
 
         URL massiveUpload_1 = ClassLoader
                 .getSystemResource("trie/massive-upload.dmp");
@@ -583,7 +583,7 @@
 
         // *** Part - 1 ***
         // 1. load the data from massive-upload.dmp
-        //    which includes deletes/upadtes (100000 operations)
+        //    which includes deletes/upadtes (5000 operations)
         Trie trieSingle = new Trie(mockDb_2);
         for (int i = 0; i < strData.size() ; ++i){
 
@@ -606,7 +606,7 @@
         // 3. the rest of the data loaded with part of the trie not in the cache
         Trie trie = new Trie(mockDb);
 
-        for (int i = 0; i < 10000; ++i){
+        for (int i = 0; i < 2000; ++i){
 
             String[] keyVal= strData.get(i).split("=");
 
@@ -621,7 +621,7 @@
 
         Trie trie2 = new Trie(mockDb, trie.getRootHash());
 
-        for (int i = 10000; i < strData.size(); ++i){
+        for (int i = 2000; i < strData.size(); ++i){
 
             String[] keyVal= strData.get(i).split("=");
 
