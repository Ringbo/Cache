diff --git a/drools-core/src/main/java/org/drools/marshalling/OutputMarshaller.java b/drools-core/src/main/java/org/drools/marshalling/OutputMarshaller.java
index 3fa1c93..7de5532 100644
--- a/drools-core/src/main/java/org/drools/marshalling/OutputMarshaller.java
+++ b/drools-core/src/main/java/org/drools/marshalling/OutputMarshaller.java
@@ -706,7 +706,7 @@
         }
 
         LeftTuple tupleOrigin = pc.getLeftTupleOrigin();
-        if ( tupleOrigin != null ) {
+        if ( tupleOrigin != null && tuples.containsKey( tupleOrigin )) {
             stream.writeBoolean( true );
             stream.writeInt( tuples.get( tupleOrigin ) );
         } else {
