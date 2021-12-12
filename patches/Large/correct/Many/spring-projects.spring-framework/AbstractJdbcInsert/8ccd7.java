diff --git a/org.springframework.jdbc/src/main/java/org/springframework/jdbc/core/simple/AbstractJdbcInsert.java b/org.springframework.jdbc/src/main/java/org/springframework/jdbc/core/simple/AbstractJdbcInsert.java
index 8c7e1db..aef3a3a 100644
--- a/org.springframework.jdbc/src/main/java/org/springframework/jdbc/core/simple/AbstractJdbcInsert.java
+++ b/org.springframework.jdbc/src/main/java/org/springframework/jdbc/core/simple/AbstractJdbcInsert.java
@@ -604,7 +604,7 @@
 		int colIndex = 0;
 		for (Object value : values) {
 			colIndex++;
-			if (columnTypes == null || colIndex < columnTypes.length) {
+			if (columnTypes == null || colIndex > columnTypes.length) {
 				StatementCreatorUtils.setParameterValue(preparedStatement, colIndex, SqlTypeValue.TYPE_UNKNOWN, value);
 			}
 			else {
