diff --git a/src/be/ibridge/kettle/core/database/Database.java b/src/be/ibridge/kettle/core/database/Database.java
index 54b6ccd..20bafb7 100644
--- a/src/be/ibridge/kettle/core/database/Database.java
+++ b/src/be/ibridge/kettle/core/database/Database.java
@@ -2258,7 +2258,10 @@
 		String debug="";
 		try
 		{
-			if (inform==null)
+			if (inform==null 
+					// Hack for MSSQL jtds 1.2 when using xxx NOT IN yyy we have to use a prepared statement (see BugID 3214)
+					&& databaseMeta.getDatabaseType()!=DatabaseMeta.TYPE_DATABASE_MSSQL
+					)
 			{
 				debug="inform==null";
 				sel_stmt = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
