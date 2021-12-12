diff --git a/community/index/src/test/java/org/neo4j/index/internal/gbptree/GBPTreeTest.java b/community/index/src/test/java/org/neo4j/index/internal/gbptree/GBPTreeTest.java
index ee2a0bb..51a9fec 100644
--- a/community/index/src/test/java/org/neo4j/index/internal/gbptree/GBPTreeTest.java
+++ b/community/index/src/test/java/org/neo4j/index/internal/gbptree/GBPTreeTest.java
@@ -664,18 +664,18 @@
     }
 
     @Test
-    public void openWithReadHeaderMustThrowIOExceptionIfFileIsEmpty() throws Exception
+    public void openWithReadHeaderMustThrowMetadataMismatchExceptionIfFileIsEmpty() throws Exception
     {
-        openMustThrowIOExceptionIfFileIsEmpty( pageCache -> GBPTree.readHeader( pageCache, indexFile, layout, NO_HEADER_READER ) );
+        openMustThrowMetadataMismatchExceptionIfFileIsEmpty( pageCache -> GBPTree.readHeader( pageCache, indexFile, layout, NO_HEADER_READER ) );
     }
 
     @Test
-    public void openWithConstructorMustThrowIOExceptionIfFileIsEmpty() throws Exception
+    public void openWithConstructorMustThrowMetadataMismatchExceptionIfFileIsEmpty() throws Exception
     {
-        openMustThrowIOExceptionIfFileIsEmpty( pageCache -> index( pageCache ).build() );
+        openMustThrowMetadataMismatchExceptionIfFileIsEmpty( pageCache -> index( pageCache ).build() );
     }
 
-    private void openMustThrowIOExceptionIfFileIsEmpty( ThrowingConsumer<PageCache,IOException> opener ) throws Exception
+    private void openMustThrowMetadataMismatchExceptionIfFileIsEmpty( ThrowingConsumer<PageCache,IOException> opener ) throws Exception
     {
         // given an existing empty file
         PageCache pageCache = createPageCache( DEFAULT_PAGE_SIZE );
@@ -687,7 +687,7 @@
             opener.accept( pageCache );
             fail( "Should've thrown IOException" );
         }
-        catch ( IOException e )
+        catch ( MetadataMismatchException e )
         {
             // then good
         }
