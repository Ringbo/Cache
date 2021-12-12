diff --git a/h2o-core/src/main/java/water/parser/ParseDataset.java b/h2o-core/src/main/java/water/parser/ParseDataset.java
index 43de9af..ce6e949 100644
--- a/h2o-core/src/main/java/water/parser/ParseDataset.java
+++ b/h2o-core/src/main/java/water/parser/ParseDataset.java
@@ -164,7 +164,7 @@
     }
 
     private void parseCleanup() {
-      assert _pds._job.isStopped();
+      assert !_pds._job.isStopped(); // Job still running till job.onExCompletion returns
       Futures fs = new Futures();
       // Find & remove all partially-built output vecs & chunks.
       // Since this is racily called, perhaps multiple times, read _mfpt only exactly once.
