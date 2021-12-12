diff --git a/src/java/org/apache/cassandra/config/CFMetaData.java b/src/java/org/apache/cassandra/config/CFMetaData.java
index 7a16031..d5726df 100644
--- a/src/java/org/apache/cassandra/config/CFMetaData.java
+++ b/src/java/org/apache/cassandra/config/CFMetaData.java
@@ -669,7 +669,7 @@
         // validate
         if (!cf_def.keyspace.toString().equals(ksName))
             throw new ConfigurationException(String.format("Keyspace mismatch (found %s; expected %s)",
-                                                           cf_def.keyspace, tableName));
+                                                           cf_def.keyspace, ksName));
         if (!cf_def.name.toString().equals(cfName))
             throw new ConfigurationException(String.format("Column family mismatch (found %s; expected %s)",
                                                            cf_def.name, cfName));
