diff --git a/extensions-core/postgresql-metadata-storage/src/main/java/org/apache/druid/metadata/storage/postgresql/PostgreSQLMetadataStorageModule.java b/extensions-core/postgresql-metadata-storage/src/main/java/org/apache/druid/metadata/storage/postgresql/PostgreSQLMetadataStorageModule.java
index 6eaca55..6cbb09b 100644
--- a/extensions-core/postgresql-metadata-storage/src/main/java/org/apache/druid/metadata/storage/postgresql/PostgreSQLMetadataStorageModule.java
+++ b/extensions-core/postgresql-metadata-storage/src/main/java/org/apache/druid/metadata/storage/postgresql/PostgreSQLMetadataStorageModule.java
@@ -58,7 +58,7 @@
   {
     super.configure(binder);
 
-    JsonConfigProvider.bind(binder, "druid.metadata.postgres.ssl", PostgreSQLConnector.class);
+    JsonConfigProvider.bind(binder, "druid.metadata.postgres.ssl", PostgreSQLConnectorConfig.class);
 
     PolyBind
         .optionBinder(binder, Key.get(MetadataStorageProvider.class))
