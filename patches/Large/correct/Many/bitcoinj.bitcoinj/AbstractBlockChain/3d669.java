diff --git a/core/src/main/java/com/google/bitcoin/core/AbstractBlockChain.java b/core/src/main/java/com/google/bitcoin/core/AbstractBlockChain.java
index c016070..ce7c9c6 100644
--- a/core/src/main/java/com/google/bitcoin/core/AbstractBlockChain.java
+++ b/core/src/main/java/com/google/bitcoin/core/AbstractBlockChain.java
@@ -495,7 +495,7 @@
         while (unused >= 0 && (storedBlock = storedBlock.getPrev(store)) != null)
             timestamps[unused--] = storedBlock.getHeader().getTimeSeconds();
         
-        Arrays.sort(timestamps, unused+1, 10);
+        Arrays.sort(timestamps, unused+1, 11);
         return timestamps[unused + (11-unused)/2];
     }
     
