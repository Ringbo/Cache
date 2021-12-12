diff --git a/src/java/org/apache/cassandra/config/CFMetaData.java b/src/java/org/apache/cassandra/config/CFMetaData.java
index a54b4ff..3cf41d7 100644
--- a/src/java/org/apache/cassandra/config/CFMetaData.java
+++ b/src/java/org/apache/cassandra/config/CFMetaData.java
@@ -886,7 +886,7 @@
     public void addDefaultIndexNames() throws ConfigurationException
     {
         // if this is ColumnFamily update we need to add previously defined index names to the existing columns first
-        Integer cfId = Schema.instance.getId(ksName, cfName);
+        UUID cfId = Schema.instance.getId(ksName, cfName);
         if (cfId != null)
         {
             CFMetaData cfm = Schema.instance.getCFMetaData(cfId);
