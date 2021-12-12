diff --git a/portal-impl/src/com/liferay/portal/tools/SourceFormatter.java b/portal-impl/src/com/liferay/portal/tools/SourceFormatter.java
index 385f4e8..405b915 100644
--- a/portal-impl/src/com/liferay/portal/tools/SourceFormatter.java
+++ b/portal-impl/src/com/liferay/portal/tools/SourceFormatter.java
@@ -632,7 +632,8 @@
 			}
 
 			if ((excluded == null) && (line.length() > 80) &&
-				!line.startsWith("import ") && !line.startsWith("package ")) {
+				!line.startsWith("import ") && !line.startsWith("package ") &&
+				!line.matches("\\s*\\*.*")) {
 
 				if (fileName.endsWith("Table.java") &&
 					line.contains("String TABLE_SQL_CREATE = ")) {
