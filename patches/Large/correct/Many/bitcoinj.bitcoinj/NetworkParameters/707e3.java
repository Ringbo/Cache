diff --git a/core/src/main/java/com/google/bitcoin/core/NetworkParameters.java b/core/src/main/java/com/google/bitcoin/core/NetworkParameters.java
index a05842d..a4ede15 100644
--- a/core/src/main/java/com/google/bitcoin/core/NetworkParameters.java
+++ b/core/src/main/java/com/google/bitcoin/core/NetworkParameters.java
@@ -176,7 +176,7 @@
     public final BigInteger MAX_MONEY = new BigInteger("21000000", 10).multiply(COIN);
 
     /** Sets up the given Networkparemets with testnet3 values. */
-    private static NetworkParameters createTestNet3(NetworkParameters n) {
+    private static NetworkParameters createTestNet(NetworkParameters n) {
         // Genesis hash is 000000000933ea01ad0ee984209779baaec3ced90fa3f408719526f8d77f4943
         n.proofOfWorkLimit = Utils.decodeCompactBits(0x1d00ffffL);
         n.packetMagic = 0x0b110907;
@@ -200,8 +200,8 @@
         return n;
     }
 
-    /** Sets up the given NetworkParameters with testnet values. */
-    private static NetworkParameters createTestNet(NetworkParameters n) {
+    /** Sets up the given NetworkParameters with testnet2 values. Don't use! */
+    private static NetworkParameters createOldTestNet(NetworkParameters n) {
         // Genesis hash is 0000000224b1593e3ff16a0e3b61285bbc393a39f78c8aa48c456142671f7110
         n.proofOfWorkLimit = Utils.decodeCompactBits(0x1d0fffffL);
         n.packetMagic = 0xfabfb5daL;
@@ -226,16 +226,16 @@
         return n;
     }
 
-    /** The test chain created by Gavin. */
-    public static NetworkParameters testNet() {
+    /** The first test chain created by Gavin. Don't use this! */
+    public static NetworkParameters oldTestNet() {
         NetworkParameters n = new NetworkParameters();
-        return createTestNet(n);
+        return createOldTestNet(n);
     }
 
     /** The testnet3 chain created by Gavin, included in Bitcoin 0.7. */
-    public static NetworkParameters testNet3() {
+    public static NetworkParameters testNet() {
         NetworkParameters n = new NetworkParameters();
-        return createTestNet3(n);
+        return createTestNet(n);
     }
 
     /** The primary BitCoin chain created by Satoshi. */
