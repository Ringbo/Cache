diff --git a/src/test/org/apache/solr/BaseDistributedSearchTestCase.java b/src/test/org/apache/solr/BaseDistributedSearchTestCase.java
index 79720b5..21cdc91 100644
--- a/src/test/org/apache/solr/BaseDistributedSearchTestCase.java
+++ b/src/test/org/apache/solr/BaseDistributedSearchTestCase.java
@@ -492,7 +492,7 @@
   }
 
   public void testDistribSearch() throws Exception {
-    for (int nServers = 1; nServers < 2; nServers++) {
+    for (int nServers = 1; nServers < 4; nServers++) {
       createServers(nServers);
       RandVal.uniqueValues = new HashSet(); //reset random values
       doTest();
