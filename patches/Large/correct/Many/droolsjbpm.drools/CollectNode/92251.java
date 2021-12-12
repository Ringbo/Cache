diff --git a/drools-core/src/main/java/org/drools/reteoo/CollectNode.java b/drools-core/src/main/java/org/drools/reteoo/CollectNode.java
index dd003c7..178f421 100755
--- a/drools-core/src/main/java/org/drools/reteoo/CollectNode.java
+++ b/drools-core/src/main/java/org/drools/reteoo/CollectNode.java
@@ -375,7 +375,7 @@
                         } else {
                             // we must re-add this to ensure deterministic iteration
                             LeftTuple temp = childLeftTuple.getLeftParentNext();
-                            childLeftTuple.reAddLeft();
+                            childLeftTuple.reAddRight();
                             childLeftTuple = temp;
                         }
                     } else if ( childLeftTuple != null && childLeftTuple.getRightParent() == rightTuple ) {
@@ -469,7 +469,7 @@
                         final CollectContext colctx = (CollectContext) memory.betaMemory.getCreatedHandles().get( leftTuple );
                         if ( childLeftTuple == null || childLeftTuple.getLeftParent() == leftTuple ) {
                             // we must re-add this to ensure deterministic iteration
-                            childLeftTuple.reAddRight();
+                            childLeftTuple.reAddLeft();
                             removeMatch( rightTuple,
                                          childLeftTuple,
                                          colctx );
