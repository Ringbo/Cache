diff --git a/core/src/test/java/org/elasticsearch/indices/IndicesServiceTests.java b/core/src/test/java/org/elasticsearch/indices/IndicesServiceTests.java
index fa4183f..5761997 100644
--- a/core/src/test/java/org/elasticsearch/indices/IndicesServiceTests.java
+++ b/core/src/test/java/org/elasticsearch/indices/IndicesServiceTests.java
@@ -207,7 +207,7 @@
             // shard lock released... we can now delete
             indicesService.processPendingDeletes(test.index(), test.getIndexSettings(), new TimeValue(0, TimeUnit.MILLISECONDS));
             assertEquals(indicesService.numPendingDeletes(test.index()), 0);
-            assertFalse(indicesService.hasUncompletedPendingDeletes());
+            assertTrue(indicesService.hasUncompletedPendingDeletes()); // "bogus" index has not been removed
         }
         assertAcked(client().admin().indices().prepareOpen("test"));
 
