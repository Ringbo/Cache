diff --git a/src/test/org/apache/lucene/index/TestDeletionPolicy.java b/src/test/org/apache/lucene/index/TestDeletionPolicy.java
index 0373a6f..3fba927 100644
--- a/src/test/org/apache/lucene/index/TestDeletionPolicy.java
+++ b/src/test/org/apache/lucene/index/TestDeletionPolicy.java
@@ -187,7 +187,7 @@
 
     Directory dir = new RAMDirectory();
     ExpirationTimeDeletionPolicy policy = new ExpirationTimeDeletionPolicy(dir, SECONDS);
-    IndexWriter writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), true, policy);
+    IndexWriter writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), true, policy, IndexWriter.MaxFieldLength.LIMITED);
     writer.setUseCompoundFile(useCompoundFile);
     writer.close();
 
@@ -196,7 +196,7 @@
       // Record last time when writer performed deletes of
       // past commits
       lastDeleteTime = System.currentTimeMillis();
-      writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), false, policy);
+      writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), false, policy, IndexWriter.MaxFieldLength.LIMITED);
       writer.setUseCompoundFile(useCompoundFile);
       for(int j=0;j<17;j++) {
         addDoc(writer);
@@ -256,7 +256,7 @@
 
       Directory dir = new RAMDirectory();
 
-      IndexWriter writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), true, policy);
+      IndexWriter writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), true, policy, IndexWriter.MaxFieldLength.LIMITED);
       writer.setMaxBufferedDocs(10);
       writer.setUseCompoundFile(useCompoundFile);
       for(int i=0;i<107;i++) {
@@ -264,7 +264,7 @@
       }
       writer.close();
 
-      writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), false, policy);
+      writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), false, policy, IndexWriter.MaxFieldLength.LIMITED);
       writer.setUseCompoundFile(useCompoundFile);
       writer.optimize();
       writer.close();
@@ -294,7 +294,7 @@
           // Open & close a writer and assert that it
           // actually removed something:
           int preCount = dir.list().length;
-          writer = new IndexWriter(dir, false, new WhitespaceAnalyzer(), false, policy);
+          writer = new IndexWriter(dir, false, new WhitespaceAnalyzer(), false, policy, IndexWriter.MaxFieldLength.LIMITED);
           writer.close();
           int postCount = dir.list().length;
           assertTrue(postCount < preCount);
@@ -320,7 +320,7 @@
 
       Directory dir = new RAMDirectory();
 
-      IndexWriter writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), true, policy);
+      IndexWriter writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), true, policy, IndexWriter.MaxFieldLength.LIMITED);
       writer.setMaxBufferedDocs(10);
       writer.setUseCompoundFile(useCompoundFile);
       for(int i=0;i<107;i++) {
@@ -328,7 +328,7 @@
       }
       writer.close();
 
-      writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), false, policy);
+      writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), false, policy, IndexWriter.MaxFieldLength.LIMITED);
       writer.setUseCompoundFile(useCompoundFile);
       writer.optimize();
       writer.close();
@@ -368,7 +368,7 @@
       KeepLastNDeletionPolicy policy = new KeepLastNDeletionPolicy(N);
 
       for(int j=0;j<N+1;j++) {
-        IndexWriter writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), true, policy);
+        IndexWriter writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), true, policy, IndexWriter.MaxFieldLength.LIMITED);
         writer.setMaxBufferedDocs(10);
         writer.setUseCompoundFile(useCompoundFile);
         for(int i=0;i<17;i++) {
@@ -428,14 +428,14 @@
       KeepLastNDeletionPolicy policy = new KeepLastNDeletionPolicy(N);
 
       Directory dir = new RAMDirectory();
-      IndexWriter writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), true, policy);
+      IndexWriter writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), true, policy, IndexWriter.MaxFieldLength.LIMITED);
       writer.setUseCompoundFile(useCompoundFile);
       writer.close();
       Term searchTerm = new Term("content", "aaa");        
       Query query = new TermQuery(searchTerm);
 
       for(int i=0;i<N+1;i++) {
-        writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), false, policy);
+        writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), false, policy, IndexWriter.MaxFieldLength.LIMITED);
         writer.setUseCompoundFile(useCompoundFile);
         for(int j=0;j<17;j++) {
           addDoc(writer);
@@ -452,7 +452,7 @@
         reader.close();
         searcher.close();
       }
-      writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), false, policy);
+      writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), false, policy, IndexWriter.MaxFieldLength.LIMITED);
       writer.setUseCompoundFile(useCompoundFile);
       writer.optimize();
       // this is a commit when autoCommit=false:
@@ -531,7 +531,7 @@
       KeepLastNDeletionPolicy policy = new KeepLastNDeletionPolicy(N);
 
       Directory dir = new RAMDirectory();
-      IndexWriter writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), true, policy);
+      IndexWriter writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), true, policy, IndexWriter.MaxFieldLength.LIMITED);
       writer.setMaxBufferedDocs(10);
       writer.setUseCompoundFile(useCompoundFile);
       writer.close();
@@ -540,7 +540,7 @@
 
       for(int i=0;i<N+1;i++) {
 
-        writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), false, policy);
+        writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), false, policy, IndexWriter.MaxFieldLength.LIMITED);
         writer.setMaxBufferedDocs(10);
         writer.setUseCompoundFile(useCompoundFile);
         for(int j=0;j<17;j++) {
@@ -558,7 +558,7 @@
         reader.close();
         searcher.close();
 
-        writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), true, policy);
+        writer = new IndexWriter(dir, autoCommit, new WhitespaceAnalyzer(), true, policy, IndexWriter.MaxFieldLength.LIMITED);
         // This will not commit: there are no changes
         // pending because we opened for "create":
         writer.close();
