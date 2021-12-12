diff --git a/core/src/test/java/org/elasticsearch/index/engine/InternalEngineTests.java b/core/src/test/java/org/elasticsearch/index/engine/InternalEngineTests.java
index 7e5d8d7..8840059 100644
--- a/core/src/test/java/org/elasticsearch/index/engine/InternalEngineTests.java
+++ b/core/src/test/java/org/elasticsearch/index/engine/InternalEngineTests.java
@@ -1560,7 +1560,9 @@
             if (randomBoolean()) {
                 // refresh and take the chance to check everything is ok so far
                 assertVisibleCount(engine, docDeleted ? 0 : 1);
-                if (docDeleted == false) {
+                // even if doc is not not deleted, lastFieldValue can still be null if this is the
+                // first op and it failed.
+                if (docDeleted == false && lastFieldValue != null) {
                     try (Searcher searcher = engine.acquireSearcher("test")) {
                         final TotalHitCountCollector collector = new TotalHitCountCollector();
                         searcher.searcher().search(new TermQuery(new Term("value", lastFieldValue)), collector);
