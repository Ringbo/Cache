diff --git a/core/src/main/java/org/bitcoinj/core/Wallet.java b/core/src/main/java/org/bitcoinj/core/Wallet.java
index 5bfa2d1..958b436 100644
--- a/core/src/main/java/org/bitcoinj/core/Wallet.java
+++ b/core/src/main/java/org/bitcoinj/core/Wallet.java
@@ -4227,7 +4227,7 @@
     }
 
     @Override
-    public synchronized void setTag(String tag, ByteString value) {
+    public void setTag(String tag, ByteString value) {
         super.setTag(tag, value);
         saveNow();
     }
