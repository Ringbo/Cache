diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/nioneo/store/AbstractNameStore.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/nioneo/store/AbstractNameStore.java
index d8070c8..67fefde 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/nioneo/store/AbstractNameStore.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/nioneo/store/AbstractNameStore.java
@@ -305,7 +305,7 @@
         {
             throw new InvalidRecordException( "Record[" + id + "] not in use" );
         }
-        if ( inUseByte != Record.IN_USE.byteValue() )
+        if ( inUseByte != Record.IN_USE.byteValue() && inUseByte != Record.NOT_IN_USE.byteValue() )
         {
             throw new InvalidRecordException( "Record[" + id + "] unknown in use flag[" + inUse + "]" );
         }
