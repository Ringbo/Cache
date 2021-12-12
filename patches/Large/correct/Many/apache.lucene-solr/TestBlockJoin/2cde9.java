diff --git a/lucene/join/src/test/org/apache/lucene/search/join/TestBlockJoin.java b/lucene/join/src/test/org/apache/lucene/search/join/TestBlockJoin.java
index 827ac00..52a2ed4 100644
--- a/lucene/join/src/test/org/apache/lucene/search/join/TestBlockJoin.java
+++ b/lucene/join/src/test/org/apache/lucene/search/join/TestBlockJoin.java
@@ -1674,16 +1674,16 @@
     final RandomIndexWriter w = new RandomIndexWriter(random(), dir);
 
     // randomly generate resume->jobs[]->qualifications[]
-    final int numResumes = atLeast(50);
+    final int numResumes = atLeast(100);
     for (int r = 0; r < numResumes; r++) {
       final List<Document> docs = new ArrayList<>();
       
       final int rv = TestUtil.nextInt(random(), 1, 10);
-      final int numJobs = atLeast(1);
+      final int numJobs = atLeast(10);
       for (int j = 0; j < numJobs; j++) {
-        final int jv = TestUtil.nextInt(random(), 1, 10);
+        final int jv = TestUtil.nextInt(random(), -10, -1); // neg so no overlap with q (both used for "year")
 
-        final int numQualifications = atLeast(1);
+        final int numQualifications = atLeast(10);
         for (int q = 0; q < numQualifications; q++) {
           docs.add(makeQualification("q" + q + "_rv" + rv + "_jv" + jv, q));
         }
@@ -1704,7 +1704,7 @@
 
     final int numQueryIters = atLeast(1);
     for (int i = 0; i < numQueryIters; i++) {
-      final int qjv = TestUtil.nextInt(random(), 1, 10);
+      final int qjv = TestUtil.nextInt(random(), -10, -1);
       final int qrv = TestUtil.nextInt(random(), 1, 10);
       
       Query resumeQuery = new ToChildBlockJoinQuery(new TermQuery(new Term("country","rv" + qrv)),
