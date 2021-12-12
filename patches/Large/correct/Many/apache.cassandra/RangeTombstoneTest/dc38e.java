diff --git a/test/unit/org/apache/cassandra/db/RangeTombstoneTest.java b/test/unit/org/apache/cassandra/db/RangeTombstoneTest.java
index 3b0f515..15ef19a 100644
--- a/test/unit/org/apache/cassandra/db/RangeTombstoneTest.java
+++ b/test/unit/org/apache/cassandra/db/RangeTombstoneTest.java
@@ -121,20 +121,20 @@
 
         // Inserting data
         String key = "k111";
-        RowMutation rm;
+        Mutation rm;
         ColumnFamily cf;
 
-        rm = new RowMutation(KSNAME, ByteBufferUtil.bytes(key));
+        rm = new Mutation(KSNAME, ByteBufferUtil.bytes(key));
         for (int i = 0; i < 40; i += 2)
             add(rm, i, 0);
         rm.apply();
 
-        rm = new RowMutation(KSNAME, ByteBufferUtil.bytes(key));
+        rm = new Mutation(KSNAME, ByteBufferUtil.bytes(key));
         cf = rm.addOrGet(CFNAME);
         delete(cf, 5, 10, 1);
         rm.apply();
 
-        rm = new RowMutation(KSNAME, ByteBufferUtil.bytes(key));
+        rm = new Mutation(KSNAME, ByteBufferUtil.bytes(key));
         cf = rm.addOrGet(CFNAME);
         delete(cf, 15, 20, 2);
         rm.apply();
