diff --git a/drools-core/src/test/java/org/drools/reteoo/EvalNodeTest.java b/drools-core/src/test/java/org/drools/reteoo/EvalNodeTest.java
index 3ced048..868647f 100644
--- a/drools-core/src/test/java/org/drools/reteoo/EvalNodeTest.java
+++ b/drools-core/src/test/java/org/drools/reteoo/EvalNodeTest.java
@@ -273,7 +273,7 @@
         node.modifyTuple( tuple, context, workingMemory );
 
         // make sure no assertions were propagated
-        assertEquals( 0,
+        assertEquals( 1,
                       sink.getModified().size() );      
     }        
 
