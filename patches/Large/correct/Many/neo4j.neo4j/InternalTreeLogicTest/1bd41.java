diff --git a/community/index/src/test/java/org/neo4j/index/internal/gbptree/InternalTreeLogicTest.java b/community/index/src/test/java/org/neo4j/index/internal/gbptree/InternalTreeLogicTest.java
index 1f8062a..4b4ba3f 100644
--- a/community/index/src/test/java/org/neo4j/index/internal/gbptree/InternalTreeLogicTest.java
+++ b/community/index/src/test/java/org/neo4j/index/internal/gbptree/InternalTreeLogicTest.java
@@ -1040,7 +1040,7 @@
     // KEEP even if unused
     private void printTree() throws IOException
     {
-        new TreePrinter<>( node, layout, stableGen, unstableGen ).printTree( cursor, System.out, true );
+        new TreePrinter<>( node, layout, stableGen, unstableGen ).printTree( cursor, System.out, true, true );
     }
 
     private static MutableLong key( long key )
