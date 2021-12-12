diff --git a/lucene/src/test/org/apache/lucene/index/TestStressNRT.java b/lucene/src/test/org/apache/lucene/index/TestStressNRT.java
index ce4f01a..a607e60 100644
--- a/lucene/src/test/org/apache/lucene/index/TestStressNRT.java
+++ b/lucene/src/test/org/apache/lucene/index/TestStressNRT.java
@@ -40,7 +40,7 @@
 import org.apache.lucene.util._TestUtil;
 
 public class TestStressNRT extends LuceneTestCase {
-  volatile IndexReader reader;
+  volatile DirectoryReader reader;
 
   final ConcurrentHashMap<Integer,Long> model = new ConcurrentHashMap<Integer,Long>();
   Map<Integer,Long> committedModel = new HashMap<Integer,Long>();
@@ -125,7 +125,7 @@
                 if (numCommitting.incrementAndGet() <= maxConcurrentCommits) {
                   Map<Integer,Long> newCommittedModel;
                   long version;
-                  IndexReader oldReader;
+                  DirectoryReader oldReader;
 
                   synchronized(TestStressNRT.this) {
                     newCommittedModel = new HashMap<Integer,Long>(model);  // take a snapshot
@@ -134,7 +134,7 @@
                     oldReader.incRef();  // increment the reference since we will use this for reopening
                   }
 
-                  IndexReader newReader;
+                  DirectoryReader newReader;
                   if (rand.nextInt(100) < softCommitPercent) {
                     // assertU(h.commit("softCommit","true"));
                     if (random.nextBoolean()) {
@@ -146,7 +146,7 @@
                       if (VERBOSE) {
                         System.out.println("TEST: " + Thread.currentThread().getName() + ": reopen reader=" + oldReader + " version=" + version);
                       }
-                      newReader = IndexReader.openIfChanged(oldReader, writer.w, true);
+                      newReader = DirectoryReader.openIfChanged(oldReader, writer.w, true);
                     }
                   } else {
                     // assertU(commit());
@@ -157,7 +157,7 @@
                     if (VERBOSE) {
                       System.out.println("TEST: " + Thread.currentThread().getName() + ": now reopen after commit");
                     }
-                    newReader = IndexReader.openIfChanged(oldReader);
+                    newReader = DirectoryReader.openIfChanged(oldReader);
                   }
 
                   // Code below assumes newReader comes w/
@@ -306,7 +306,7 @@
               // so when querying, we should first check the model, and then the index
 
               long val;
-              IndexReader r;
+              DirectoryReader r;
               synchronized(TestStressNRT.this) {
                 val = committedModel.get(id);
                 r = reader;
