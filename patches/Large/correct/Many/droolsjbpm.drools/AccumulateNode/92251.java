diff --git a/drools-core/src/main/java/org/drools/reteoo/AccumulateNode.java b/drools-core/src/main/java/org/drools/reteoo/AccumulateNode.java
index 3ebdd11..9a5724d 100755
--- a/drools-core/src/main/java/org/drools/reteoo/AccumulateNode.java
+++ b/drools-core/src/main/java/org/drools/reteoo/AccumulateNode.java
@@ -358,7 +358,7 @@
                         } else {
                             // we must re-add this to ensure deterministic iteration
                             LeftTuple temp = childLeftTuple.getLeftParentNext();
-                            childLeftTuple.reAddLeft();
+                            childLeftTuple.reAddRight();
                             childLeftTuple = temp;
                         }
                     } else if ( childLeftTuple != null && childLeftTuple.getRightParent() == rightTuple ) {
@@ -468,7 +468,7 @@
                         final AccumulateContext accctx = (AccumulateContext) memory.betaMemory.getCreatedHandles().get( leftTuple );
                         if ( childLeftTuple == null || childLeftTuple.getLeftParent() == leftTuple ) {
                             // we must re-add this to ensure deterministic iteration
-                            childLeftTuple.reAddRight();
+                            childLeftTuple.reAddLeft();
                             removeMatch( rightTuple,
                                          childLeftTuple,
                                          workingMemory,
