diff --git a/community/kernel/src/test/java/org/neo4j/kernel/impl/api/integrationtest/TransactionHookIT.java b/community/kernel/src/test/java/org/neo4j/kernel/impl/api/integrationtest/TransactionHookIT.java
index 49949ee..a9fa468 100644
--- a/community/kernel/src/test/java/org/neo4j/kernel/impl/api/integrationtest/TransactionHookIT.java
+++ b/community/kernel/src/test/java/org/neo4j/kernel/impl/api/integrationtest/TransactionHookIT.java
@@ -54,8 +54,7 @@
         // Then
         verify( hook ).beforeCommit( any( ReadableTransactionState.class ), any( KernelTransaction.class ),
                 any( StoreReadLayer.class ), any( StorageStatement.class ) );
-        verify( hook ).afterCommit( any( ReadableTransactionState.class ), any( KernelTransaction.class ),
-                any( TransactionHook.Outcome.class ) );
+        verify( hook ).afterCommit( any( ReadableTransactionState.class ), any( KernelTransaction.class ), any() );
         verifyNoMoreInteractions( hook );
     }
 
