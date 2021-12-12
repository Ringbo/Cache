diff --git a/test/unit/org/apache/cassandra/db/marshal/DynamicCompositeTypeTest.java b/test/unit/org/apache/cassandra/db/marshal/DynamicCompositeTypeTest.java
index 87e6ac9..e248eae 100644
--- a/test/unit/org/apache/cassandra/db/marshal/DynamicCompositeTypeTest.java
+++ b/test/unit/org/apache/cassandra/db/marshal/DynamicCompositeTypeTest.java
@@ -207,7 +207,7 @@
         ByteBuffer cname5 = createDynamicCompositeKey("test2", uuids[1], 42, false, true);
 
         ByteBuffer key = ByteBufferUtil.bytes("kr");
-        RowMutation rm = new RowMutation("Keyspace1", key);
+        Mutation rm = new Mutation("Keyspace1", key);
         addColumn(rm, cname5);
         addColumn(rm, cname1);
         addColumn(rm, cname4);
@@ -217,7 +217,7 @@
 
         ColumnFamily cf = cfs.getColumnFamily(QueryFilter.getIdentityFilter(Util.dk("kr"), cfName, System.currentTimeMillis()));
 
-        Iterator<Column> iter = cf.getSortedColumns().iterator();
+        Iterator<Cell> iter = cf.getSortedColumns().iterator();
 
         assert iter.next().name().equals(cname5);
         assert iter.next().name().equals(cname4);
