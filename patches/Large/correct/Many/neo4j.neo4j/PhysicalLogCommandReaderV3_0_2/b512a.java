diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/transaction/command/PhysicalLogCommandReaderV3_0_2.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/transaction/command/PhysicalLogCommandReaderV3_0_2.java
index d576785..77be130 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/transaction/command/PhysicalLogCommandReaderV3_0_2.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/transaction/command/PhysicalLogCommandReaderV3_0_2.java
@@ -471,7 +471,7 @@
     {
         // id+type+in_use(byte)+nr_of_bytes(int)+next_block(long)
         long id = channel.getLong();
-        assert id >= 0 && id <= (1l << 36) - 1 : id + " is not a valid dynamic record id";
+        assert id >= 0 && id <= (1L << 36) - 1 : id + " is not a valid dynamic record id";
         int type = channel.getInt();
         byte inUseFlag = channel.get();
         boolean inUse = (inUseFlag & Record.IN_USE.byteValue()) != 0;
@@ -484,11 +484,11 @@
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
