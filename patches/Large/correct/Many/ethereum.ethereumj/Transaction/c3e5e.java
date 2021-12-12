diff --git a/ethereumj-core/src/main/java/org/ethereum/core/Transaction.java b/ethereumj-core/src/main/java/org/ethereum/core/Transaction.java
index 72a281f..3141d98 100644
--- a/ethereumj-core/src/main/java/org/ethereum/core/Transaction.java
+++ b/ethereumj-core/src/main/java/org/ethereum/core/Transaction.java
@@ -217,7 +217,7 @@
             throw new RuntimeException("Receive address is not valid");
         if (gasLimit.length > HASH_LENGTH)
             throw new RuntimeException("Gas Limit is not valid");
-        if (gasPrice.length > HASH_LENGTH)
+        if (gasPrice != null && gasPrice.length > HASH_LENGTH)
             throw new RuntimeException("Gas Price is not valid");
         if (value != null  && value.length > HASH_LENGTH)
             throw new RuntimeException("Value is not valid");
