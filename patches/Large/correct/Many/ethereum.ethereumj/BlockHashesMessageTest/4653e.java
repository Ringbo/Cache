diff --git a/ethereumj-core/src/test/java/org/ethereum/net/BlockHashesMessageTest.java b/ethereumj-core/src/test/java/org/ethereum/net/BlockHashesMessageTest.java
index 60a24b7..0ce2427 100644
--- a/ethereumj-core/src/test/java/org/ethereum/net/BlockHashesMessageTest.java
+++ b/ethereumj-core/src/test/java/org/ethereum/net/BlockHashesMessageTest.java
@@ -26,7 +26,7 @@
         System.out.println(blockHashesMessage);
 
         assertEquals(EthMessageCodes.BLOCK_HASHES, blockHashesMessage.getCommand());
-        assertEquals(129, blockHashesMessage.getBlockHashes().size());
+        assertEquals(128, blockHashesMessage.getBlockHashes().size());
         // TODO maybe also assert values for individual hashes
         assertEquals(null, blockHashesMessage.getAnswerMessage());
     }
