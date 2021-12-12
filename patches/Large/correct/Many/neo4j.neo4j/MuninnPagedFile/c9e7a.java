diff --git a/community/io/src/main/java/org/neo4j/io/pagecache/impl/muninn/MuninnPagedFile.java b/community/io/src/main/java/org/neo4j/io/pagecache/impl/muninn/MuninnPagedFile.java
index b72efff..4f39e1a 100644
--- a/community/io/src/main/java/org/neo4j/io/pagecache/impl/muninn/MuninnPagedFile.java
+++ b/community/io/src/main/java/org/neo4j/io/pagecache/impl/muninn/MuninnPagedFile.java
@@ -37,7 +37,7 @@
 final class MuninnPagedFile implements PagedFile
 {
     private static int stripeFactor = Integer.getInteger(
-            "org.neo4j.io.pagecache.impl.muninn.MuninnPagedFile.stripeFactor", 8 );
+            "org.neo4j.io.pagecache.impl.muninn.MuninnPagedFile.stripeFactor", 10 );
     static final int translationTableStripeLevel = 1 << stripeFactor;
     static final int translationTableStripeMask = translationTableStripeLevel - 1;
 
@@ -83,7 +83,7 @@
         translationTableLocks = new StampedLock[translationTableStripeLevel];
         for ( int i = 0; i < translationTableStripeLevel; i++ )
         {
-            translationTables[i] = Primitive.longObjectMap( 32 );
+            translationTables[i] = Primitive.longObjectMap( 8 );
             translationTableLocks[i] = new StampedLock();
         }
         PageEvictionCallback onEviction = new MuninnPageEvictionCallback(
