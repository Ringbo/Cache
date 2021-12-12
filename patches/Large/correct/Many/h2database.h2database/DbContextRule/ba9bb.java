diff --git a/h2/src/main/org/h2/server/web/DbContextRule.java b/h2/src/main/org/h2/server/web/DbContextRule.java
index 91e9f24..8221c73 100644
--- a/h2/src/main/org/h2/server/web/DbContextRule.java
+++ b/h2/src/main/org/h2/server/web/DbContextRule.java
@@ -269,7 +269,7 @@
                 break;
             }
         }
-        if (table != null) {
+        if (table != null && table.columns != null) {
             for (int j = 0; j < table.columns.length; j++) {
                 String columnName = table.columns[j].name;
                 if (!StringUtils.toUpperEnglish(columnName).startsWith(columnPattern)) {
