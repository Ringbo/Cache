diff --git a/src/java/org/apache/cassandra/db/SystemTable.java b/src/java/org/apache/cassandra/db/SystemTable.java
index d88c91a..870955f 100644
--- a/src/java/org/apache/cassandra/db/SystemTable.java
+++ b/src/java/org/apache/cassandra/db/SystemTable.java
@@ -100,7 +100,7 @@
      */
     public static synchronized void updateToken(InetAddress ep, Token token)
     {
-        if (ep == FBUtilities.getBroadcastAddress())
+        if (ep == FBUtilities.getLocalAddress())
             return;
         IPartitioner p = StorageService.getPartitioner();
         ColumnFamily cf = ColumnFamily.create(Table.SYSTEM_TABLE, STATUS_CF);
