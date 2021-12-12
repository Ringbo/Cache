diff --git a/application/src/main/java/org/thingsboard/server/service/install/SqlDatabaseSchemaService.java b/application/src/main/java/org/thingsboard/server/service/install/SqlDatabaseSchemaService.java
index e0d6264..acd3868 100644
--- a/application/src/main/java/org/thingsboard/server/service/install/SqlDatabaseSchemaService.java
+++ b/application/src/main/java/org/thingsboard/server/service/install/SqlDatabaseSchemaService.java
@@ -59,7 +59,7 @@
         Path schemaFile = Paths.get(this.dataDir, SQL_DIR, SCHEMA_SQL);
         try (Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword)) {
             String sql = new String(Files.readAllBytes(schemaFile), Charset.forName("UTF-8"));
-            conn.prepareStatement(sql).execute(); //NOSONAR, ignoring because method used to load initial thingsboard database schema
+            conn.createStatement().execute(sql); //NOSONAR, ignoring because method used to load initial thingsboard database schema
         }
 
     }
