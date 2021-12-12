diff --git a/core/src/main/java/org/bitcoinj/core/BitcoinSerializer.java b/core/src/main/java/org/bitcoinj/core/BitcoinSerializer.java
index 54c2a08..5f3ea07 100644
--- a/core/src/main/java/org/bitcoinj/core/BitcoinSerializer.java
+++ b/core/src/main/java/org/bitcoinj/core/BitcoinSerializer.java
@@ -367,7 +367,7 @@
             size = (int) readUint32(header, cursor);
             cursor += 4;
 
-            if (size > Message.MAX_SIZE)
+            if (size > Message.MAX_SIZE || size < 0)
                 throw new ProtocolException("Message size too large: " + size);
 
             // Old clients don't send the checksum.
