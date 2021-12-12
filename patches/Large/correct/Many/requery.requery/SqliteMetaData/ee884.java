diff --git a/requery-android/src/main/java/io/requery/android/sqlite/SqliteMetaData.java b/requery-android/src/main/java/io/requery/android/sqlite/SqliteMetaData.java
index 999a2cc..8a09830 100644
--- a/requery-android/src/main/java/io/requery/android/sqlite/SqliteMetaData.java
+++ b/requery-android/src/main/java/io/requery/android/sqlite/SqliteMetaData.java
@@ -450,7 +450,7 @@
         select.put("SELF_REFERENCING_COL_NAME", null);
         select.put("REF_GENERATION", null);
         QueryBuilder qb = new QueryBuilder(
-            new QueryBuilder.Options(getIdentifierQuoteString(), true, false, false))
+            new QueryBuilder.Options(getIdentifierQuoteString(), true, null, null, false, false))
             .keyword(Keyword.SELECT)
             .commaSeparated(select.entrySet(),
                 new QueryBuilder.Appender<Map.Entry<String, String>>() {
