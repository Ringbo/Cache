diff --git a/src/be/ibridge/kettle/job/entry/tableexists/JobEntryTableExists.java b/src/be/ibridge/kettle/job/entry/tableexists/JobEntryTableExists.java
index 265182d..e8cd586 100644
--- a/src/be/ibridge/kettle/job/entry/tableexists/JobEntryTableExists.java
+++ b/src/be/ibridge/kettle/job/entry/tableexists/JobEntryTableExists.java
@@ -190,7 +190,7 @@
 			{
 				db.connect();
                 String realTablename = StringUtil.environmentSubstitute(tablename);
-				if (db.checkTableExists(tablename))
+				if (db.checkTableExists(realTablename))
 				{
 					log.logDetailed(toString(), "Table ["+realTablename+"] exists.");
 					result.setResult(true);
