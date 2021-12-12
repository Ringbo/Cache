diff --git a/src-ui/org/pentaho/di/ui/trans/dialog/TransDialog.java b/src-ui/org/pentaho/di/ui/trans/dialog/TransDialog.java
index 9ddb541..5d56010 100644
--- a/src-ui/org/pentaho/di/ui/trans/dialog/TransDialog.java
+++ b/src-ui/org/pentaho/di/ui/trans/dialog/TransDialog.java
@@ -1862,12 +1862,12 @@
 					RowMetaInterface r;
 					String createTable = "";
 					
-					if (Const.isEmpty(tablename)) {
+					if (!Const.isEmpty(tablename)) {
 						r = Database.getTransLogrecordFields(false, wBatch.getSelection(), wLogfield.getSelection());
 						createTable += db.getDDL(tablename, r);
 					}
 					
-					if (Const.isEmpty(stepTablename)) {
+					if (!Const.isEmpty(stepTablename)) {
 						r = Database.getStepPerformanceLogrecordFields();
 						createTable += db.getDDL(stepTablename, r);
 					}
