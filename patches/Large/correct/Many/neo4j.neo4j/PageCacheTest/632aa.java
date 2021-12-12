diff --git a/community/io/src/test/java/org/neo4j/io/pagecache/PageCacheTest.java b/community/io/src/test/java/org/neo4j/io/pagecache/PageCacheTest.java
index d72ea5b..93c64af 100644
--- a/community/io/src/test/java/org/neo4j/io/pagecache/PageCacheTest.java
+++ b/community/io/src/test/java/org/neo4j/io/pagecache/PageCacheTest.java
@@ -2921,7 +2921,7 @@
     {
         File file = file( "a" );
         generateFileWithRecords( file, recordsPerFilePage * 2, recordSize );
-        getPageCache( fs, maxPages, pageCachePageSize, PageCacheTracer.NULL );
+        getPageCache( fs, maxPages, pageCachePageSize, PageCacheTracer.NULL, DefaultPageCursorTracerSupplier.INSTANCE );
         try ( PagedFile pf = pageCache.map( file, filePageSize ) )
         {
             PageCursor a = pf.io( 0, PF_SHARED_WRITE_LOCK );
@@ -2947,7 +2947,7 @@
     {
         File file = file( "a" );
         generateFileWithRecords( file, recordsPerFilePage * 2, recordSize );
-        getPageCache( fs, maxPages, pageCachePageSize, PageCacheTracer.NULL );
+        getPageCache( fs, maxPages, pageCachePageSize, PageCacheTracer.NULL, DefaultPageCursorTracerSupplier.INSTANCE );
         try ( PagedFile pf = pageCache.map( file, filePageSize ) )
         {
             PageCursor a = pf.io( 0, PF_SHARED_WRITE_LOCK );
