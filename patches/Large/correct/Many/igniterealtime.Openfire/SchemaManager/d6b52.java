diff --git a/src/java/org/jivesoftware/database/SchemaManager.java b/src/java/org/jivesoftware/database/SchemaManager.java
index 48ee211..fea40df 100644
--- a/src/java/org/jivesoftware/database/SchemaManager.java
+++ b/src/java/org/jivesoftware/database/SchemaManager.java
@@ -323,9 +323,9 @@
                 }
                 // Send command to database.
                 if (!done && !command.toString().equals("")) {
-                    // Remove last semicolon when using Oracle to prevent "invalid character error"
-                    if (DbConnectionManager.getDatabaseType() == DbConnectionManager.DatabaseType
-                            .oracle) {
+                    // Remove last semicolon when using Oracle or DB2 to prevent "invalid character error"
+                    if (DbConnectionManager.getDatabaseType() == DbConnectionManager.DatabaseType.oracle ||
+                            DbConnectionManager.getDatabaseType() == DbConnectionManager.DatabaseType.db2) {
                         command.deleteCharAt(command.length() - 1);
                     }
                     Statement stmt = con.createStatement();
