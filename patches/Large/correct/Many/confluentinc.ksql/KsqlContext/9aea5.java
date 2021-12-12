diff --git a/ksql-engine/src/main/java/io/confluent/ksql/KsqlContext.java b/ksql-engine/src/main/java/io/confluent/ksql/KsqlContext.java
index fff49de..5268bd3 100644
--- a/ksql-engine/src/main/java/io/confluent/ksql/KsqlContext.java
+++ b/ksql-engine/src/main/java/io/confluent/ksql/KsqlContext.java
@@ -78,7 +78,8 @@
         schemaRegistryClientFactory,
         clientSupplier,
         metaStore,
-        ksqlConfig
+        ksqlConfig,
+        adminClient
     );
 
     return new KsqlContext(ksqlConfig, engine);
