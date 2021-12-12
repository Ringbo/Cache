diff --git a/src-db/org/pentaho/di/core/database/DatabaseMeta.java b/src-db/org/pentaho/di/core/database/DatabaseMeta.java
index c20fc54..762dc1b 100644
--- a/src-db/org/pentaho/di/core/database/DatabaseMeta.java
+++ b/src-db/org/pentaho/di/core/database/DatabaseMeta.java
@@ -1354,7 +1354,7 @@
 	public String stripCR(StringBuffer sbsql)
 	{
 		// DB2 Can't handle \n in SQL Statements...
-		if (supportsNewLinesInSQL()) {
+		if (!supportsNewLinesInSQL()) {
 			// Remove CR's
 			for (int i=sbsql.length()-1;i>=0;i--)
 			{
