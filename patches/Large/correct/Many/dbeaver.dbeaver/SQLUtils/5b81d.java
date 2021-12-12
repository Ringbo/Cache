diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/sql/SQLUtils.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/sql/SQLUtils.java
index 9fdb50e..c114e6d 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/sql/SQLUtils.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/sql/SQLUtils.java
@@ -434,7 +434,7 @@
         if (matcher.find() && matcher.start(0) == 0) {
             sql = sql.substring(matcher.end(1));
         }
-        sql = sql.replaceAll("\\s+", " ");
+        sql = sql.replaceAll(" +", " ");
         if (sql.length() > MAX_SQL_DESCRIPTION_LENGTH) {
             sql = sql.substring(0, MAX_SQL_DESCRIPTION_LENGTH) + " ...";
         }
@@ -447,7 +447,7 @@
         try {
             StringBuilder sql = new StringBuilder();
             try (Reader is = new InputStreamReader(sqlScript.getContents())) {
-                char[] buffer = new char[16384];
+                char[] buffer = new char[1024];
                 for (;;) {
                     final int count = is.read(buffer);
                     if (count <= 0) {
