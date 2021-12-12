diff --git a/src/java/org/apache/cassandra/cql3/functions/ScriptBasedUDF.java b/src/java/org/apache/cassandra/cql3/functions/ScriptBasedUDF.java
index 06452e6..4fe6ac9 100644
--- a/src/java/org/apache/cassandra/cql3/functions/ScriptBasedUDF.java
+++ b/src/java/org/apache/cassandra/cql3/functions/ScriptBasedUDF.java
@@ -139,7 +139,7 @@
         }
         catch (RuntimeException | ScriptException e)
         {
-            logger.info("Execution of UDF '{}' failed", name, e);
+            logger.debug("Execution of UDF '{}' failed", name, e);
             throw FunctionExecutionException.create(this, e);
         }
     }
