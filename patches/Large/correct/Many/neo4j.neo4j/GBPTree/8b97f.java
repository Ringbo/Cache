diff --git a/community/index/src/main/java/org/neo4j/index/internal/gbptree/GBPTree.java b/community/index/src/main/java/org/neo4j/index/internal/gbptree/GBPTree.java
index 2dc0ce4..3bd28be 100644
--- a/community/index/src/main/java/org/neo4j/index/internal/gbptree/GBPTree.java
+++ b/community/index/src/main/java/org/neo4j/index/internal/gbptree/GBPTree.java
@@ -750,7 +750,7 @@
         // This index was created with another page size, re-open with that actual page size
         if ( pageSize != pageCache.pageSize() )
         {
-            if ( pageSize > pageCache.pageSize() )
+            if ( pageSize > pageCache.pageSize() || pageSize < 0 )
             {
                 throw new MetadataMismatchException(
                         "Tried to create tree with page size %d, but page cache used to open it this time " +
