diff --git a/test/unit/org/apache/cassandra/db/ColumnFamilyStoreTest.java b/test/unit/org/apache/cassandra/db/ColumnFamilyStoreTest.java
index 5a86ff4..4e6c87f 100644
--- a/test/unit/org/apache/cassandra/db/ColumnFamilyStoreTest.java
+++ b/test/unit/org/apache/cassandra/db/ColumnFamilyStoreTest.java
@@ -1322,7 +1322,7 @@
 
         String tableName = "Keyspace1";
         String cfName = "Standard1";
-        Table table = Table.open(tableName);
+        Keyspace table = Keyspace.open(tableName);
         ColumnFamilyStore cfs = table.getColumnFamilyStore(cfName);
         cfs.clearUnsafe();
 
@@ -1371,7 +1371,7 @@
 
         String tableName = "Keyspace1";
         String cfName = "Standard1";
-        Table table = Table.open(tableName);
+        Keyspace table = Keyspace.open(tableName);
         ColumnFamilyStore cfs = table.getColumnFamilyStore(cfName);
         cfs.clearUnsafe();
 
@@ -1420,7 +1420,7 @@
 
         String tableName = "Keyspace1";
         String cfName = "Standard1";
-        Table table = Table.open(tableName);
+        Keyspace table = Keyspace.open(tableName);
         ColumnFamilyStore cfs = table.getColumnFamilyStore(cfName);
         cfs.clearUnsafe();
 
@@ -1470,7 +1470,7 @@
 
         String tableName = "Keyspace1";
         String cfName = "Standard1";
-        Table table = Table.open(tableName);
+        Keyspace table = Keyspace.open(tableName);
         ColumnFamilyStore cfs = table.getColumnFamilyStore(cfName);
         cfs.clearUnsafe();
 
