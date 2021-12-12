diff --git a/src/java/org/apache/cassandra/db/RowMutation.java b/src/java/org/apache/cassandra/db/RowMutation.java
index 7eb7edf..147466e 100644
--- a/src/java/org/apache/cassandra/db/RowMutation.java
+++ b/src/java/org/apache/cassandra/db/RowMutation.java
@@ -295,12 +295,12 @@
         {
             for (org.apache.cassandra.thrift.Column column : cosc.super_column.columns)
             {
-                rm.add(new QueryPath(cfName, cosc.super_column.name, column.name), column.value, column.timestamp);
+                rm.add(new QueryPath(cfName, cosc.super_column.name, column.name), column.value, column.timestamp, column.ttl);
             }
         }
         else
         {
-            rm.add(new QueryPath(cfName, null, cosc.column.name), cosc.column.value, cosc.column.timestamp);
+            rm.add(new QueryPath(cfName, null, cosc.column.name), cosc.column.value, cosc.column.timestamp, cosc.column.ttl);
         }
     }
 
