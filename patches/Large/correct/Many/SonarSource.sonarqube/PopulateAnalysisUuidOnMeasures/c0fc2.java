diff --git a/sonar-db/src/main/java/org/sonar/db/version/v60/PopulateAnalysisUuidOnMeasures.java b/sonar-db/src/main/java/org/sonar/db/version/v60/PopulateAnalysisUuidOnMeasures.java
index e81abe6..0e87df1 100644
--- a/sonar-db/src/main/java/org/sonar/db/version/v60/PopulateAnalysisUuidOnMeasures.java
+++ b/sonar-db/src/main/java/org/sonar/db/version/v60/PopulateAnalysisUuidOnMeasures.java
@@ -42,10 +42,10 @@
       "where m.analysis_uuid is null");
     massUpdate.update("update project_measures set analysis_uuid=? where snapshot_id=? and analysis_uuid is null");
     massUpdate.rowPluralName("measures");
-    massUpdate.execute(this::handle);
+    massUpdate.execute(PopulateAnalysisUuidOnMeasures::handle);
   }
 
-  private boolean handle(Select.Row row, SqlStatement update) throws SQLException {
+  private static boolean handle(Select.Row row, SqlStatement update) throws SQLException {
     long snapshotId = row.getLong(1);
     String analysisUuid = row.getString(2);
 
