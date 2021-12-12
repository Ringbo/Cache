diff --git a/solr/core/src/test/org/apache/solr/update/TestInPlaceUpdatesDistrib.java b/solr/core/src/test/org/apache/solr/update/TestInPlaceUpdatesDistrib.java
index 74360e3..5386721 100644
--- a/solr/core/src/test/org/apache/solr/update/TestInPlaceUpdatesDistrib.java
+++ b/solr/core/src/test/org/apache/solr/update/TestInPlaceUpdatesDistrib.java
@@ -181,7 +181,7 @@
   // The following should work: full update to doc 0, in-place update for doc 0, delete doc 0
   private void outOfOrderDBQsTest() throws Exception {
     
-    del("*:*");
+    clearIndex();
     commit();
     
     buildRandomIndex(0);
@@ -241,12 +241,12 @@
     }
 
     log.info("outOfOrderDeleteUpdatesIndividualReplicaTest: This test passed fine...");
-    del("*:*");
+    clearIndex();
     commit();
   }
 
   private void docValuesUpdateTest() throws Exception {
-    del("*:*");
+    clearIndex();
     commit();
 
     // number of docs we're testing (0 <= id), index may contain additional random docs (id < 0)
@@ -397,7 +397,7 @@
   
   
   private void ensureRtgWorksWithPartialUpdatesTest() throws Exception {
-    del("*:*");
+    clearIndex();
     commit();
 
     float inplace_updatable_float = 1;
@@ -496,7 +496,7 @@
 
   private void outOfOrderUpdatesIndividualReplicaTest() throws Exception {
     
-    del("*:*");
+    clearIndex();
     commit();
 
     buildRandomIndex(0);
@@ -561,14 +561,14 @@
     }
 
     log.info("outOfOrderUpdatesIndividualReplicaTest: This test passed fine...");
-    del("*:*");
+    clearIndex();
     commit();
   }
   
   // The following should work: full update to doc 0, in-place update for doc 0, delete doc 0
   private void outOfOrderDeleteUpdatesIndividualReplicaTest() throws Exception {
     
-    del("*:*");
+    clearIndex();
     commit();
 
     buildRandomIndex(0);
@@ -627,7 +627,7 @@
     }
 
     log.info("outOfOrderDeleteUpdatesIndividualReplicaTest: This test passed fine...");
-    del("*:*");
+    clearIndex();
     commit();
   }
 
@@ -641,7 +641,7 @@
         DV(id=x, val=5, ver=3)
    */
   private void reorderedDBQsWithInPlaceUpdatesShouldNotThrowReplicaInLIRTest() throws Exception {
-    del("*:*");
+    clearIndex();
     commit();
 
     buildRandomIndex(0);
@@ -728,12 +728,12 @@
     }
 
     log.info("reorderedDBQsWithInPlaceUpdatesShouldNotThrowReplicaInLIRTest: This test passed fine...");
-    del("*:*");
+    clearIndex();
     commit();
   }
   
   private void delayedReorderingFetchesMissingUpdateFromLeaderTest() throws Exception {
-    del("*:*");
+    clearIndex();
     commit();
     
     float inplace_updatable_float = 1F;
@@ -795,7 +795,7 @@
     // This is to ensure that the fetch missing update from leader doesn't bomb out if the 
     // document has been deleted on the leader later on
     {
-      del("*:*");
+      clearIndex();
       commit();
       shardToJetty.get(SHARD1).get(1).jetty.getDebugFilter().unsetDelay();
       
@@ -1038,7 +1038,7 @@
    * dbq("inp:14",version=4)
    */
   private void testDBQUsingUpdatedFieldFromDroppedUpdate() throws Exception {
-    del("*:*");
+    clearIndex();
     commit();
     
     float inplace_updatable_float = 1F;
