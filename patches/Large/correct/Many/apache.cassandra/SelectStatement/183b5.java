diff --git a/src/java/org/apache/cassandra/cql3/statements/SelectStatement.java b/src/java/org/apache/cassandra/cql3/statements/SelectStatement.java
index 4951998..b41659c 100644
--- a/src/java/org/apache/cassandra/cql3/statements/SelectStatement.java
+++ b/src/java/org/apache/cassandra/cql3/statements/SelectStatement.java
@@ -370,7 +370,7 @@
         if (t == null)
             return p.getMinimumToken();
 
-        if (t.getType() == Term.Type.STRING)
+        if (t.getType() == Term.Type.STRING && !t.isToken)
         {
             try
             {
