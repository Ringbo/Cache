diff --git a/core/src/main/java/com/google/bitcoin/core/AbstractBlockChain.java b/core/src/main/java/com/google/bitcoin/core/AbstractBlockChain.java
index 463f0c0..65013b9 100644
--- a/core/src/main/java/com/google/bitcoin/core/AbstractBlockChain.java
+++ b/core/src/main/java/com/google/bitcoin/core/AbstractBlockChain.java
@@ -188,7 +188,8 @@
             } catch (BlockStoreException e1) {
                 throw new RuntimeException(e1);
             }
-            throw e;
+            throw new VerificationException("Could not verify block " + block.getHashAsString() + "\n" +
+                    block.toString(), e);
         }
     }
     
@@ -672,7 +673,7 @@
         if (timespan > params.targetTimespan * 4)
             timespan = params.targetTimespan * 4;
 
-        BigInteger newDifficulty = Utils.decodeCompactBits(blockIntervalAgo.getDifficultyTarget());
+        BigInteger newDifficulty = Utils.decodeCompactBits(prev.getDifficultyTarget());
         newDifficulty = newDifficulty.multiply(BigInteger.valueOf(timespan));
         newDifficulty = newDifficulty.divide(BigInteger.valueOf(params.targetTimespan));
 
