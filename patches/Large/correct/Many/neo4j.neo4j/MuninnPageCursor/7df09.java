diff --git a/community/io/src/main/java/org/neo4j/io/pagecache/impl/muninn/MuninnPageCursor.java b/community/io/src/main/java/org/neo4j/io/pagecache/impl/muninn/MuninnPageCursor.java
index 8efc872..2e6d63c 100644
--- a/community/io/src/main/java/org/neo4j/io/pagecache/impl/muninn/MuninnPageCursor.java
+++ b/community/io/src/main/java/org/neo4j/io/pagecache/impl/muninn/MuninnPageCursor.java
@@ -136,7 +136,7 @@
         }
     }
 
-    private void closeLinks( MuninnPageCursor cursor ) throws IOException
+    private void closeLinks( MuninnPageCursor cursor )
     {
         while ( cursor != null && cursor.pagedFile != null )
         {
