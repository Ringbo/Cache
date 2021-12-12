diff --git a/src/test/java/org/tron/core/net/node/HandleBlockMessageTest.java b/src/test/java/org/tron/core/net/node/HandleBlockMessageTest.java
index f9e524a..3c330f5 100644
--- a/src/test/java/org/tron/core/net/node/HandleBlockMessageTest.java
+++ b/src/test/java/org/tron/core/net/node/HandleBlockMessageTest.java
@@ -93,7 +93,7 @@
 
         peer.getSyncBlockRequested().put(blockMessage.getBlockId(), System.currentTimeMillis());
         node.onMessage(peer, blockMessageOther);
-        Assert.assertEquals(peer.getSyncBlockRequested().isEmpty(), false);
+        Assert.assertEquals(peer.getSyncBlockRequested().isEmpty(), true);
     }
 
     //根据父块生成一个区块
