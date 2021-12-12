diff --git a/portal-impl/src/com/liferay/portal/dao/db/BaseDB.java b/portal-impl/src/com/liferay/portal/dao/db/BaseDB.java
index fcbca05..7ea4da7 100644
--- a/portal-impl/src/com/liferay/portal/dao/db/BaseDB.java
+++ b/portal-impl/src/com/liferay/portal/dao/db/BaseDB.java
@@ -381,7 +381,7 @@
 			String line = null;
 
 			while ((line = unsyncBufferedReader.readLine()) != null) {
-				if (line.startsWith("##")) {
+				if (line.isEmpty() || line.startsWith("##")) {
 					continue;
 				}
 
@@ -427,7 +427,7 @@
 						sb.setIndex(0);
 
 						try {
-							if (!sql.equals("COMMIT_TRANSACTION;")) {
+							if (!sql.equals("COMMIT_TRANSACTION;\n")) {
 								runSQL(connection, sql);
 							}
 							else {
