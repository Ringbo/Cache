diff --git a/drools-core/src/main/java/org/drools/reteoo/NotNode.java b/drools-core/src/main/java/org/drools/reteoo/NotNode.java
index 54f516a..70493b0 100644
--- a/drools-core/src/main/java/org/drools/reteoo/NotNode.java
+++ b/drools-core/src/main/java/org/drools/reteoo/NotNode.java
@@ -107,7 +107,7 @@
         memory.getTupleMemory().add( leftTuple );
 
         final Iterator it = memory.getObjectMemory().iterator( leftTuple );
-        this.constraints.updateFromTuple( leftTuple );
+        this.constraints.updateFromTuple( workingMemory, leftTuple );
         int matches = 0;
         for ( FactEntry entry = (FactEntry) it.next(); entry != null; entry = (FactEntry) it.next() ) {
             final InternalFactHandle handle = entry.getFactHandle();
@@ -144,7 +144,7 @@
         memory.getObjectMemory().add( handle );
 
         final Iterator it = memory.getTupleMemory().iterator();
-        this.constraints.updateFromFactHandle( handle );
+        this.constraints.updateFromFactHandle( workingMemory, handle );
         for ( ReteTuple tuple = (ReteTuple) it.next(); tuple != null; tuple = (ReteTuple) it.next() ) {
             if ( this.constraints.isAllowedCachedRight( tuple ) ) {
                 final int matches = tuple.getMatches();
@@ -181,7 +181,7 @@
         }
 
         final Iterator it = memory.getTupleMemory().iterator();
-        this.constraints.updateFromFactHandle( handle );
+        this.constraints.updateFromFactHandle( workingMemory, handle );
         for ( ReteTuple tuple = (ReteTuple) it.next(); tuple != null; tuple = (ReteTuple) it.next() ) {
             if ( this.constraints.isAllowedCachedRight( tuple ) ) {
                 tuple.setMatches( tuple.getMatches() - 1 );
