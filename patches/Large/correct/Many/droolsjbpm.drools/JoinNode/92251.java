diff --git a/drools-core/src/main/java/org/drools/reteoo/JoinNode.java b/drools-core/src/main/java/org/drools/reteoo/JoinNode.java
index ce9bed8..ff8fe71 100644
--- a/drools-core/src/main/java/org/drools/reteoo/JoinNode.java
+++ b/drools-core/src/main/java/org/drools/reteoo/JoinNode.java
@@ -224,7 +224,7 @@
                                                                                       workingMemory,
                                                                                       this.tupleMemoryEnabled );
                             // we must re-add this to ensure deterministic iteration
-                            temp.reAddRight();
+                            temp.reAddLeft();
                         }
                     } else if ( childLeftTuple != null && childLeftTuple.getLeftParent() == leftTuple ) {
                         childLeftTuple = this.sink.propagateRetractChildLeftTuple( childLeftTuple,
@@ -307,7 +307,7 @@
                                                                                       workingMemory,
                                                                                       this.tupleMemoryEnabled );
                             // we must re-add this to ensure deterministic iteration
-                            temp.reAddLeft();
+                            temp.reAddRight();
                         }
                     } else if ( childLeftTuple != null && childLeftTuple.getRightParent() == rightTuple ) {
                         childLeftTuple = this.sink.propagateRetractChildLeftTuple( childLeftTuple,
