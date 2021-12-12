diff --git a/jdbc/src/main/java/com/yahoo/ycsb/db/JdbcDBClient.java b/jdbc/src/main/java/com/yahoo/ycsb/db/JdbcDBClient.java
index 3cb1570..e59111d 100644
--- a/jdbc/src/main/java/com/yahoo/ycsb/db/JdbcDBClient.java
+++ b/jdbc/src/main/java/com/yahoo/ycsb/db/JdbcDBClient.java
@@ -283,11 +283,11 @@
     StringBuilder update = new StringBuilder("UPDATE ");
     update.append(updateType.tableName);
     update.append(" SET ");
-    for (int i = 1; i <= updateType.numFields; i++) {
+    for (int i = 0; i < updateType.numFields; i++) {
       update.append(COLUMN_PREFIX);
       update.append(i);
       update.append("=?");
-      if (i < updateType.numFields) update.append(", ");
+      if (i < updateType.numFields - 1) update.append(", ");
     }
     update.append(" WHERE ");
     update.append(PRIMARY_KEY);
