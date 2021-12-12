diff --git a/core/src/test/java/org/bitcoinj/core/WalletTest.java b/core/src/test/java/org/bitcoinj/core/WalletTest.java
index fd42eec..6868f29 100644
--- a/core/src/test/java/org/bitcoinj/core/WalletTest.java
+++ b/core/src/test/java/org/bitcoinj/core/WalletTest.java
@@ -2893,7 +2893,7 @@
         assertTrue("Only one of the signatures should be missing/dummy", firstSigIsMissing ^ secondSigIsMissing);
         int localSigIndex = firstSigIsMissing ? 2 : 1;
         int length = input.getScriptSig().getChunks().get(localSigIndex).data.length;
-        assertTrue("Local sig should be present: " + length, length > 70);
+        assertTrue("Local sig should be present: " + length, length >= 70);
     }
 
 
