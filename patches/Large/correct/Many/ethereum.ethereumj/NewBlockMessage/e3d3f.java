diff --git a/ethereumj-core/src/main/java/org/ethereum/net/eth/message/NewBlockMessage.java b/ethereumj-core/src/main/java/org/ethereum/net/eth/message/NewBlockMessage.java
index bff253b..5e9072e 100644
--- a/ethereumj-core/src/main/java/org/ethereum/net/eth/message/NewBlockMessage.java
+++ b/ethereumj-core/src/main/java/org/ethereum/net/eth/message/NewBlockMessage.java
@@ -57,7 +57,7 @@
     }
 
     public BigInteger getDifficultyAsBigInt() {
-        return new BigInteger(difficulty);
+        return new BigInteger(1, difficulty);
     }
 
     @Override
