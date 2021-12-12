diff --git a/hazelcast/src/test/java/com/hazelcast/cluster/impl/AdvancedClusterStateTest.java b/hazelcast/src/test/java/com/hazelcast/cluster/impl/AdvancedClusterStateTest.java
index e063d72..67027d9 100644
--- a/hazelcast/src/test/java/com/hazelcast/cluster/impl/AdvancedClusterStateTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/cluster/impl/AdvancedClusterStateTest.java
@@ -222,7 +222,7 @@
         });
     }
 
-    @Test
+    @Test(timeout = 60000)
     public void changeClusterState_shouldFail_withoutBackup_whenInitiatorDies_afterPrepare() throws Exception {
         final TestHazelcastInstanceFactory factory = createHazelcastInstanceFactory(3);
         final HazelcastInstance[] instances = factory.newInstances();
@@ -230,7 +230,7 @@
         final HazelcastInstance hz = instances[instances.length - 1];
         TransactionManagerServiceImpl transactionManagerService = spyTransactionManagerService(hz);
 
-        TransactionOptions options = new TransactionOptions().setDurability(0).setTimeout(10, TimeUnit.SECONDS);
+        TransactionOptions options = new TransactionOptions().setDurability(0).setTimeout(30, TimeUnit.SECONDS);
         when(transactionManagerService.newAllowedDuringPassiveStateTransaction(options)).thenAnswer(new TransactionAnswer() {
             @Override
             protected void afterPrepare() {
