diff --git a/ethereumj-core/src/main/java/org/ethereum/core/Transaction.java b/ethereumj-core/src/main/java/org/ethereum/core/Transaction.java
index 92e9a4c..4eff7d5 100644
--- a/ethereumj-core/src/main/java/org/ethereum/core/Transaction.java
+++ b/ethereumj-core/src/main/java/org/ethereum/core/Transaction.java
@@ -208,7 +208,7 @@
             throw new RuntimeException("Receive address is not valid");
         if (gasLimit.length > HASH_LENGTH)
             throw new RuntimeException("Gas Limit is not valid");
-        if (gasPrice.length > HASH_LENGTH)
+        if (gasPrice != null && gasPrice.length > HASH_LENGTH)
             throw new RuntimeException("Gas Price is not valid");
         if (value != null  && value.length > HASH_LENGTH)
             throw new RuntimeException("Value is not valid");
