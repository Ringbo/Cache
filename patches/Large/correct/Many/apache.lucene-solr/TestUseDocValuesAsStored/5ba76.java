diff --git a/solr/core/src/test/org/apache/solr/schema/TestUseDocValuesAsStored.java b/solr/core/src/test/org/apache/solr/schema/TestUseDocValuesAsStored.java
index 136d40e..27b55d0 100644
--- a/solr/core/src/test/org/apache/solr/schema/TestUseDocValuesAsStored.java
+++ b/solr/core/src/test/org/apache/solr/schema/TestUseDocValuesAsStored.java
@@ -109,7 +109,7 @@
   @After
   private void afterTest() throws Exception {
     clearIndex();
-    commit();
+    assertU(commit());
     deleteCore();
     System.clearProperty("managed.schema.mutable");
     System.clearProperty("enable.update.log");
