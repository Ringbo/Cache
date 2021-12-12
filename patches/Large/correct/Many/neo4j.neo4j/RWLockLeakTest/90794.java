diff --git a/community/kernel/src/test/java/org/neo4j/kernel/impl/transaction/RWLockLeakTest.java b/community/kernel/src/test/java/org/neo4j/kernel/impl/transaction/RWLockLeakTest.java
index 14073cb..7e07ff8 100644
--- a/community/kernel/src/test/java/org/neo4j/kernel/impl/transaction/RWLockLeakTest.java
+++ b/community/kernel/src/test/java/org/neo4j/kernel/impl/transaction/RWLockLeakTest.java
@@ -34,7 +34,7 @@
     public void assertWriteLockDoesNotLeakMemory() throws InterruptedException
     {
         final TransactionManager tm = mock( TransactionManager.class );
-        final RagManager ragManager = new RagManager( tm );
+        final RagManager ragManager = new RagManager();
         final Object resource = new Object();
         final RWLock lock = new RWLock( resource, ragManager );
         final Transaction tx1 = mock( Transaction.class );
@@ -52,7 +52,7 @@
     public void assertReadLockDoesNotLeakMemory() throws InterruptedException
     {
         final TransactionManager tm = mock( TransactionManager.class );
-        final RagManager ragManager = new RagManager( tm );
+        final RagManager ragManager = new RagManager();
         final Object resource = new Object();
         final RWLock lock = new RWLock( resource, ragManager );
         final Transaction tx1 = mock( Transaction.class );
