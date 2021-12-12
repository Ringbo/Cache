diff --git a/src/com/activeandroid/util/SQLiteUtils.java b/src/com/activeandroid/util/SQLiteUtils.java
index 333450e..2a6cf77 100644
--- a/src/com/activeandroid/util/SQLiteUtils.java
+++ b/src/com/activeandroid/util/SQLiteUtils.java
@@ -125,7 +125,7 @@
 
 		final Class<?> type = field.getType();
 		final String name = tableInfo.getColumnName(field);
-		final TypeSerializer typeSerializer = Cache.getParserForType(tableInfo.getType());
+		final TypeSerializer typeSerializer = Cache.getParserForType(field.getType());
 		final Column column = field.getAnnotation(Column.class);
 
 		if (typeSerializer != null) {
