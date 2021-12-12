diff --git a/qa/full-cluster-restart/src/test/java/org/elasticsearch/upgrades/FullClusterRestartIT.java b/qa/full-cluster-restart/src/test/java/org/elasticsearch/upgrades/FullClusterRestartIT.java
index e50e0c4..57c6ad7 100644
--- a/qa/full-cluster-restart/src/test/java/org/elasticsearch/upgrades/FullClusterRestartIT.java
+++ b/qa/full-cluster-restart/src/test/java/org/elasticsearch/upgrades/FullClusterRestartIT.java
@@ -687,8 +687,7 @@
      * Tests recovery of an index with or without a translog and the
      * statistics we gather about that.
      */
-    @AwaitsFix(bugUrl = "https://github.com/elastic/elasticsearch/issues/29544")
-    public void testRecovery() throws IOException {
+    public void testRecovery() throws Exception {
         int count;
         boolean shouldHaveTranslog;
         if (runningAgainstOldCluster) {
@@ -701,7 +700,7 @@
             indexRandomDocuments(count, true, true, i -> jsonBuilder().startObject().field("field", "value").endObject());
 
             // make sure all recoveries are done
-            ensureNoInitializingShards();
+            ensureGreen(index);
             // Explicitly flush so we're sure to have a bunch of documents in the Lucene index
             client().performRequest("POST", "/_flush");
             if (shouldHaveTranslog) {
