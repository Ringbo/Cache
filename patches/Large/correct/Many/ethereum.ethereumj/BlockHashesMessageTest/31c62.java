diff --git a/ethereumj-core/src/test/java/org/ethereum/net/BlockHashesMessageTest.java b/ethereumj-core/src/test/java/org/ethereum/net/BlockHashesMessageTest.java
index 45ff90a..7ec1111 100644
--- a/ethereumj-core/src/test/java/org/ethereum/net/BlockHashesMessageTest.java
+++ b/ethereumj-core/src/test/java/org/ethereum/net/BlockHashesMessageTest.java
@@ -26,7 +26,7 @@
         System.out.println(blockHashesMessage);
 
         assertEquals(EthMessageCodes.BLOCK_HASHES, blockHashesMessage.getCommand());
-        assertEquals(128, blockHashesMessage.getBlockHashes().size());
+        assertEquals(129, blockHashesMessage.getBlockHashes().size());
         // TODO maybe also assert values for individual hashes
         assertEquals(null, blockHashesMessage.getAnswerMessage());
     }
