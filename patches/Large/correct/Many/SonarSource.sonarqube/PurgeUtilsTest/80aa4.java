diff --git a/plugins/sonar-dbcleaner-plugin/src/test/java/org/sonar/plugins/dbcleaner/api/PurgeUtilsTest.java b/plugins/sonar-dbcleaner-plugin/src/test/java/org/sonar/plugins/dbcleaner/api/PurgeUtilsTest.java
index 20b7d9f..97918dd 100644
--- a/plugins/sonar-dbcleaner-plugin/src/test/java/org/sonar/plugins/dbcleaner/api/PurgeUtilsTest.java
+++ b/plugins/sonar-dbcleaner-plugin/src/test/java/org/sonar/plugins/dbcleaner/api/PurgeUtilsTest.java
@@ -50,6 +50,6 @@
 
     PurgeUtils.deleteSnapshotsData(getSession(), Arrays.asList(3, 4));
 
-    checkTables("purgeSnapshots", "snapshots", "project_measures", "measure_data", "rule_failures", "snapshot_sources", "dependencies", "events");
+    checkTables("purgeSnapshots", "snapshots", "project_measures", "measure_data", "rule_failures", "snapshot_sources", "dependencies", "events", "duplications_index");
   }
 }
