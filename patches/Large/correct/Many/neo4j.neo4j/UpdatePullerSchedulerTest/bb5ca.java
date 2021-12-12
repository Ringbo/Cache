diff --git a/enterprise/ha/src/test/java/org/neo4j/kernel/ha/UpdatePullerSchedulerTest.java b/enterprise/ha/src/test/java/org/neo4j/kernel/ha/UpdatePullerSchedulerTest.java
index 16cbe15..88a8032 100644
--- a/enterprise/ha/src/test/java/org/neo4j/kernel/ha/UpdatePullerSchedulerTest.java
+++ b/enterprise/ha/src/test/java/org/neo4j/kernel/ha/UpdatePullerSchedulerTest.java
@@ -61,7 +61,7 @@
     @Test
     public void scheduleUpdatePulling() throws Throwable
     {
-        OnDemandJobScheduler jobScheduler = new OnDemandJobScheduler();
+        OnDemandJobScheduler jobScheduler = new OnDemandJobScheduler( false );
         UpdatePullerScheduler pullerScheduler =
                 new UpdatePullerScheduler( jobScheduler, NullLogProvider.getInstance(), updatePuller, 10 );
 
