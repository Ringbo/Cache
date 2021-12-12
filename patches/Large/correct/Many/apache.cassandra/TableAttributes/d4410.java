diff --git a/src/java/org/apache/cassandra/cql3/statements/TableAttributes.java b/src/java/org/apache/cassandra/cql3/statements/TableAttributes.java
index dee3385..63e1eec 100644
--- a/src/java/org/apache/cassandra/cql3/statements/TableAttributes.java
+++ b/src/java/org/apache/cassandra/cql3/statements/TableAttributes.java
@@ -142,7 +142,7 @@
         String value = compressionOpts.get(Option.CRC_CHECK_CHANCE.toString().toLowerCase());
         try
         {
-            return Double.parseDouble(value);
+            return Double.valueOf(value);
         }
         catch (NumberFormatException e)
         {
