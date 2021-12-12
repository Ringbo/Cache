diff --git a/src-ui/org/pentaho/di/ui/job/dialog/JobDialog.java b/src-ui/org/pentaho/di/ui/job/dialog/JobDialog.java
index 4486709..214329a 100644
--- a/src-ui/org/pentaho/di/ui/job/dialog/JobDialog.java
+++ b/src-ui/org/pentaho/di/ui/job/dialog/JobDialog.java
@@ -1490,7 +1490,10 @@
 						db.connect();
 						
 						RowMetaInterface fields = logTable.getLogRecord(LogStatus.START, null, null).getRowMeta();
-                  String schemaTable = logTable.getDatabaseMeta().getSchemaTableCombination(db.environmentSubstitute(logTable.getSchemaName()), db.environmentSubstitute(logTable.getTableName()));
+                  String schemaTable = logTable.getDatabaseMeta().getQuotedSchemaTableCombination(
+                      db.environmentSubstitute(logTable.getSchemaName()), 
+                      db.environmentSubstitute(logTable.getTableName())
+                    );
 						String createTable = db.getDDL(schemaTable, fields);
 						
 						if (!Const.isEmpty(createTable))
