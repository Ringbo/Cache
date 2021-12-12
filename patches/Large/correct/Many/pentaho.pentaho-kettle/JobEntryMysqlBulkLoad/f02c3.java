diff --git a/src/org/pentaho/di/job/entries/mysqlbulkload/JobEntryMysqlBulkLoad.java b/src/org/pentaho/di/job/entries/mysqlbulkload/JobEntryMysqlBulkLoad.java
index 87dd801..562282f 100644
--- a/src/org/pentaho/di/job/entries/mysqlbulkload/JobEntryMysqlBulkLoad.java
+++ b/src/org/pentaho/di/job/entries/mysqlbulkload/JobEntryMysqlBulkLoad.java
@@ -468,7 +468,7 @@
 			{
 				// the file doesn't exist
 				result.setNrErrors(1);
-				log.logDetailed(toString(), "File ["+realFilename+"] doesn't exist!");
+				log.logError(toString(), "File ["+realFilename+"] doesn't exist!");
 			}
 		}
 		else
