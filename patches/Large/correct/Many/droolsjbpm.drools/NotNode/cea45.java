diff --git a/drools-core/src/main/java/org/drools/reteoo/NotNode.java b/drools-core/src/main/java/org/drools/reteoo/NotNode.java
index 44b2e5e..f0a2ba0 100644
--- a/drools-core/src/main/java/org/drools/reteoo/NotNode.java
+++ b/drools-core/src/main/java/org/drools/reteoo/NotNode.java
@@ -241,7 +241,7 @@
             }
         } else {
             LinkedList list = leftTuple.getLinkedTuples();
-            for ( LinkedListNode node = list.getFirst(); node != null; node = node.getNext() ) {
+            for ( LinkedListNode node = list.removeFirst(); node != null; node = list.getFirst() ) {
                 ReteTuple tuple = (ReteTuple) ((LinkedListObjectWrapper) node).getObject();
                 tuple.retractTuple( context,
                                     workingMemory );
