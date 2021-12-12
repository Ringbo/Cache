diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/sql/SQLUtils.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/sql/SQLUtils.java
index 03692bb..ca58ebb 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/sql/SQLUtils.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/sql/SQLUtils.java
@@ -669,7 +669,7 @@
     public static boolean isExecQuery(@NotNull SQLDialect dialect, String query) {
         // Check for EXEC query
         final String[] executeKeywords = dialect.getExecuteKeywords();
-        if (executeKeywords.length > 0) {
+        if (executeKeywords != null && executeKeywords.length > 0) {
             final String queryStart = getFirstKeyword(dialect, query);
             for (String keyword : executeKeywords) {
                 if (keyword.equalsIgnoreCase(queryStart)) {
