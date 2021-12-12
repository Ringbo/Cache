diff --git a/drools-core/src/main/java/org/drools/reteoo/EvalConditionNode.java b/drools-core/src/main/java/org/drools/reteoo/EvalConditionNode.java
index 838b4d4..56ffd5e 100644
--- a/drools-core/src/main/java/org/drools/reteoo/EvalConditionNode.java
+++ b/drools-core/src/main/java/org/drools/reteoo/EvalConditionNode.java
@@ -169,7 +169,7 @@
 
         if ( allowed ) {
             memory.add( tuple );
-            if ( exists ) {
+            if ( !exists ) {
                 propagateAssertTuple( tuple,
                                       context,
                                       workingMemory );
