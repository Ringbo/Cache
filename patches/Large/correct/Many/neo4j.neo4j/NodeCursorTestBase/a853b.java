diff --git a/community/kernel-api/src/test/java/org/neo4j/internal/kernel/api/NodeCursorTestBase.java b/community/kernel-api/src/test/java/org/neo4j/internal/kernel/api/NodeCursorTestBase.java
index e8c384f..25d262a 100644
--- a/community/kernel-api/src/test/java/org/neo4j/internal/kernel/api/NodeCursorTestBase.java
+++ b/community/kernel-api/src/test/java/org/neo4j/internal/kernel/api/NodeCursorTestBase.java
@@ -191,7 +191,7 @@
             }
             assertFalse( nodes.hasLabel( fooLabel ) );
             assertTrue( nodes.hasLabel( barLabel ) );
-            assertTrue( nodes.hasLabel( barLabel ) );
+            assertTrue( nodes.hasLabel( bazLabel ) );
 
             assertFalse( "should only access a single node", nodes.next() );
 
@@ -204,7 +204,7 @@
             assertEquals( "number of labels", 0, labels.numberOfLabels() );
             assertFalse( nodes.hasLabel( fooLabel ) );
             assertFalse( nodes.hasLabel( barLabel ) );
-            assertFalse( nodes.hasLabel( barLabel ) );
+            assertFalse( nodes.hasLabel( bazLabel ) );
             assertFalse( "should only access a single node", nodes.next() );
         }
     }
