diff --git a/community/kernel/src/test/java/org/neo4j/kernel/impl/util/Neo4jJobSchedulerTest.java b/community/kernel/src/test/java/org/neo4j/kernel/impl/util/Neo4jJobSchedulerTest.java
index f548a8b..ae447fa 100644
--- a/community/kernel/src/test/java/org/neo4j/kernel/impl/util/Neo4jJobSchedulerTest.java
+++ b/community/kernel/src/test/java/org/neo4j/kernel/impl/util/Neo4jJobSchedulerTest.java
@@ -86,7 +86,7 @@
         scheduler = new Neo4jJobScheduler( StringLogger.DEV_NULL );
 
         scheduler.start();
-        scheduler.scheduleRecurring( indexPopulation, countInvocationsJob, 1, MILLISECONDS );
+        scheduler.scheduleRecurring( indexPopulation, countInvocationsJob, 2, MILLISECONDS );
 
         // When
         scheduler.cancelRecurring( indexPopulation,  countInvocationsJob);
