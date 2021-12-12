diff --git a/src/java/org/apache/cassandra/config/CFMetaData.java b/src/java/org/apache/cassandra/config/CFMetaData.java
index 2b5b02c..580bcc1 100644
--- a/src/java/org/apache/cassandra/config/CFMetaData.java
+++ b/src/java/org/apache/cassandra/config/CFMetaData.java
@@ -447,7 +447,7 @@
 
     public double getMergeShardsChance()
     {
-        return readRepairChance;
+        return mergeShardsChance;
     }
 
     public boolean getReplicateOnWrite()
