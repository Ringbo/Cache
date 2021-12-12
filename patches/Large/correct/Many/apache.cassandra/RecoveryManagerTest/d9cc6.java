diff --git a/test/unit/org/apache/cassandra/db/RecoveryManagerTest.java b/test/unit/org/apache/cassandra/db/RecoveryManagerTest.java
index cc24111..f3e8fa7 100644
--- a/test/unit/org/apache/cassandra/db/RecoveryManagerTest.java
+++ b/test/unit/org/apache/cassandra/db/RecoveryManagerTest.java
@@ -137,7 +137,7 @@
         Date date = CommitLogArchiver.format.parse("2112:12:12 12:12:12");
         long timeMS = date.getTime();
 
-        Keyspace keyspace1 = Keyspace.open(KEYSPACE1);
+        Keyspace keyspace1 = Keyspace.open("Keyspace1");
         DecoratedKey dk = Util.dk("dkey");
 
         // Col 0 and 9 are the only ones to be recovered
@@ -149,9 +149,9 @@
             else
                 ts = TimeUnit.MILLISECONDS.toMicros(timeMS + (i * 1000));
 
-            ColumnFamily cf = ArrayBackedSortedColumns.factory.create(KEYSPACE1, "Standard1");
+            ColumnFamily cf = ArrayBackedSortedColumns.factory.create("Keyspace1", "Standard1");
             cf.addColumn(column("name-" + i, "value", ts));
-            Mutation rm = new Mutation(KEYSPACE1, dk.getKey(), cf);
+            RowMutation rm = new RowMutation("Keyspace1", dk.key, cf);
             rm.apply();
         }
 
