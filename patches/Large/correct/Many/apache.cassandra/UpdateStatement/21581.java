diff --git a/src/java/org/apache/cassandra/cql3/statements/UpdateStatement.java b/src/java/org/apache/cassandra/cql3/statements/UpdateStatement.java
index 97844ad..c690530 100644
--- a/src/java/org/apache/cassandra/cql3/statements/UpdateStatement.java
+++ b/src/java/org/apache/cassandra/cql3/statements/UpdateStatement.java
@@ -340,7 +340,8 @@
                     case COLUMN_ALIAS:
                         if (processedKeys.containsKey(name.name))
                             throw new InvalidRequestException(String.format("Multiple definitions found for PRIMARY KEY part %s", name));
-                        if (operation.getType() != Operation.Type.COLUMN)
+                        // We know collection are not accepted for key and column aliases
+                        if (operation.getType() != Operation.Type.COLUMN && operation.getType() != Operation.Type.PREPARED)
                             throw new InvalidRequestException(String.format("Invalid definition for %s, not a collection type", name));
                         processedKeys.put(name.name, operation.getValues());
                         break;
