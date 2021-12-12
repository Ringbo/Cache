diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/transaction/command/PhysicalLogCommandReaderV2_2_10.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/transaction/command/PhysicalLogCommandReaderV2_2_10.java
index d539528..97c14db 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/transaction/command/PhysicalLogCommandReaderV2_2_10.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/transaction/command/PhysicalLogCommandReaderV2_2_10.java
@@ -380,7 +380,7 @@
     {
         // id+type+in_use(byte)+nr_of_bytes(int)+next_block(long)
         long id = channel.getLong();
-        assert id >= 0 && id <= (1l << 36) - 1 : id + " is not a valid dynamic record id";
+        assert id >= 0 && id <= (1L << 36) - 1 : id + " is not a valid dynamic record id";
         int type = channel.getInt();
         byte inUseFlag = channel.get();
         boolean inUse = (inUseFlag & Record.IN_USE.byteValue()) != 0;
@@ -393,11 +393,11 @@
             assert nrOfBytes >= 0 && nrOfBytes < ((1 << 24) - 1) : nrOfBytes
                     + " is not valid for a number of bytes field of " + "a dynamic record";
             long nextBlock = channel.getLong();
-            assert (nextBlock >= 0 && nextBlock <= (1l << 36 - 1))
+            assert (nextBlock >= 0 && nextBlock <= (1L << 36 - 1))
                     || (nextBlock == Record.NO_NEXT_BLOCK.intValue()) : nextBlock
                             + " is not valid for a next record field of " + "a dynamic record";
             record.setNextBlock( nextBlock );
-            byte data[] = new byte[nrOfBytes];
+            byte[] data = new byte[nrOfBytes];
             channel.get( data, nrOfBytes );
             record.setData( data );
         }
