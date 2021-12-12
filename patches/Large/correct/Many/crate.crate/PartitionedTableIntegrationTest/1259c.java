diff --git a/sql/src/test/java/io/crate/integrationtests/PartitionedTableIntegrationTest.java b/sql/src/test/java/io/crate/integrationtests/PartitionedTableIntegrationTest.java
index cb9b516..e519893 100644
--- a/sql/src/test/java/io/crate/integrationtests/PartitionedTableIntegrationTest.java
+++ b/sql/src/test/java/io/crate/integrationtests/PartitionedTableIntegrationTest.java
@@ -1785,7 +1785,7 @@
         execute("insert into event (day, data, number) values ('2015-02-08', {sessionid = 'ciao'}, 42)");
         execute("insert into event (day, number) values ('2015-03-08', 84)");
         execute("refresh table event");
-        waitNoPendingTasksOnAll();
+        waitForMappingUpdateOnAll("event", "data.sessionid");
 
         execute("select data " +
                 "from event " +
