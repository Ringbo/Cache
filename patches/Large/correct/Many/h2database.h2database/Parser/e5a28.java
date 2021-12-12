diff --git a/h2/src/main/org/h2/command/Parser.java b/h2/src/main/org/h2/command/Parser.java
index 20d09c7..9db3333 100644
--- a/h2/src/main/org/h2/command/Parser.java
+++ b/h2/src/main/org/h2/command/Parser.java
@@ -6093,7 +6093,7 @@
                 return commandIfTableExists(schema, tableName, ifTableExists, command);
             } else if (readIf("INDEX")) {
                 // MySQL compatibility
-                String indexOrConstraintName = readIdentifierWithSchema();
+                String indexOrConstraintName = readIdentifierWithSchema(schema.getName());
                 final SchemaCommand command;
                 if (schema.findIndex(session, indexOrConstraintName) != null) {
                     DropIndex dropIndexCommand = new DropIndex(session, getSchema());
