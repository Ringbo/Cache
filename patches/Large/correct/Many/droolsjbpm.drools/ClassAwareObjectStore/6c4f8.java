diff --git a/drools-core/src/main/java/org/drools/core/common/ClassAwareObjectStore.java b/drools-core/src/main/java/org/drools/core/common/ClassAwareObjectStore.java
index 9a4d185..9b1d3ee 100644
--- a/drools-core/src/main/java/org/drools/core/common/ClassAwareObjectStore.java
+++ b/drools-core/src/main/java/org/drools/core/common/ClassAwareObjectStore.java
@@ -553,7 +553,7 @@
         @Override
         protected void fetchNextIterator() {
             HashTableIterator iterator = assrt ?
-                                         new HashTableIterator( stores.next().getAssertMap() ) :
+                                         new HashTableIterator( stores.next().getIdentityMap() ) :
                                          new HashTableIterator( stores.next().getNegMap() );
             iterator.reset();
             currentIterator = new JavaIteratorAdapter<InternalFactHandle>( iterator, JavaIteratorAdapter.FACT_HANDLE );
