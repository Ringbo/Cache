diff --git a/community/index/src/main/java/org/neo4j/index/gbptree/SeekCursor.java b/community/index/src/main/java/org/neo4j/index/gbptree/SeekCursor.java
index dccbc35..aa862ed 100644
--- a/community/index/src/main/java/org/neo4j/index/gbptree/SeekCursor.java
+++ b/community/index/src/main/java/org/neo4j/index/gbptree/SeekCursor.java
@@ -130,7 +130,7 @@
                 }
             }
             while ( resetPosition = reread = cursor.shouldRetry() );
-            if ( !cursor.checkAndClearBoundsFlag() )
+            if ( cursor.checkAndClearBoundsFlag() )
             {
                 throw new IllegalStateException( "Read out of bounds" );
             }
