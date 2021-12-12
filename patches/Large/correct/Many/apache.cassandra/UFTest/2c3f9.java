diff --git a/test/unit/org/apache/cassandra/cql3/UFTest.java b/test/unit/org/apache/cassandra/cql3/UFTest.java
index ce850b7..4975ca9 100644
--- a/test/unit/org/apache/cassandra/cql3/UFTest.java
+++ b/test/unit/org/apache/cassandra/cql3/UFTest.java
@@ -698,9 +698,9 @@
 
         // declared rtype = decimal , return type = int
         execute("CREATE OR REPLACE FUNCTION "+KEYSPACE+".js(val double) RETURNS decimal LANGUAGE javascript\n" +
-                "AS '100;';");
+                "AS 'parseInt(\"100\");';");
         assertRows(execute("SELECT key, val, js(val) FROM %s"),
-                   row(1, 1d, BigDecimal.valueOf(100L)));
+                   row(1, 1d, BigDecimal.valueOf(100d)));
         execute("DROP FUNCTION "+KEYSPACE+".js(double)");
 
         // declared rtype = decimal , return type = double
