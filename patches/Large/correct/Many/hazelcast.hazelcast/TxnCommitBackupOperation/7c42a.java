diff --git a/hazelcast/src/main/java/com/hazelcast/multimap/impl/txn/TxnCommitBackupOperation.java b/hazelcast/src/main/java/com/hazelcast/multimap/impl/txn/TxnCommitBackupOperation.java
index 1f32e31..90a5a7c 100644
--- a/hazelcast/src/main/java/com/hazelcast/multimap/impl/txn/TxnCommitBackupOperation.java
+++ b/hazelcast/src/main/java/com/hazelcast/multimap/impl/txn/TxnCommitBackupOperation.java
@@ -49,7 +49,9 @@
             op.run();
             op.afterRun();
         }
-        getOrCreateContainer().unlock(dataKey, caller, threadId);
+        // changed to forceUnlock because replica-sync of lock causes problems, same as IMap
+        // real solution is to make 'lock-and-get' backup-aware
+        getOrCreateContainer().forceUnlock(dataKey);
     }
 
     protected void writeInternal(ObjectDataOutput out) throws IOException {
