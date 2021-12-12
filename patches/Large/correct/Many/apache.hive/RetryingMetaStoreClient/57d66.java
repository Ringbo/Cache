diff --git a/metastore/src/java/org/apache/hadoop/hive/metastore/RetryingMetaStoreClient.java b/metastore/src/java/org/apache/hadoop/hive/metastore/RetryingMetaStoreClient.java
index 3c125e0..c0d9c0c 100644
--- a/metastore/src/java/org/apache/hadoop/hive/metastore/RetryingMetaStoreClient.java
+++ b/metastore/src/java/org/apache/hadoop/hive/metastore/RetryingMetaStoreClient.java
@@ -176,13 +176,15 @@
           // TODO: most protocol exceptions are probably unrecoverable... throw?
           caughtException = (TException)t;
         } else if ((t instanceof MetaException) && t.getMessage().matches(
-            "(?s).*(JDO[a-zA-Z]*|TProtocol|TTransport)Exception.*")) {
+            "(?s).*(JDO[a-zA-Z]*|TProtocol|TTransport)Exception.*") &&
+            !t.getMessage().contains("java.sql.SQLIntegrityConstraintViolationException")) {
           caughtException = (MetaException)t;
         } else {
           throw t;
         }
       } catch (MetaException e) {
-        if (e.getMessage().matches("(?s).*(IO|TTransport)Exception.*")) {
+        if (e.getMessage().matches("(?s).*(IO|TTransport)Exception.*") &&
+            !e.getMessage().contains("java.sql.SQLIntegrityConstraintViolationException")) {
           caughtException = e;
         } else {
           throw e;
