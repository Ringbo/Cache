diff --git a/portal-impl/src/com/liferay/portal/dao/db/OracleDB.java b/portal-impl/src/com/liferay/portal/dao/db/OracleDB.java
index e96d2a4..c229eb2 100644
--- a/portal-impl/src/com/liferay/portal/dao/db/OracleDB.java
+++ b/portal-impl/src/com/liferay/portal/dao/db/OracleDB.java
@@ -219,7 +219,7 @@
 		StringBuffer sb = new StringBuffer();
 
 		while (matcher.find()) {
-			int size = GetterUtil.getInteger(matcher.group());
+			int size = GetterUtil.getInteger(matcher.group(1));
 
 			if (size > 4000) {
 				size = 4000;
@@ -328,6 +328,6 @@
 	private static OracleDB _instance = new OracleDB();
 
 	private static Pattern _varcharPattern = Pattern.compile(
-		"VARCHAR(\\(\\d+\\))");
+		"VARCHAR\\((\\d+)\\)");
 
 }
\ No newline at end of file
