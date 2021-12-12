diff --git a/rlp/src/main/java/org/web3j/rlp/RlpEncoder.java b/rlp/src/main/java/org/web3j/rlp/RlpEncoder.java
index 568e7f7..b89485a 100644
--- a/rlp/src/main/java/org/web3j/rlp/RlpEncoder.java
+++ b/rlp/src/main/java/org/web3j/rlp/RlpEncoder.java
@@ -28,7 +28,7 @@
                 && bytesValue[0] >= (byte) 0x00
                 && bytesValue[0] <= (byte) 0x7f) {
             return bytesValue;
-        } else if (bytesValue.length < 55) {
+        } else if (bytesValue.length <= 55) {
             byte[] result = new byte[bytesValue.length + 1];
             result[0] = (byte) (offset + bytesValue.length);
             System.arraycopy(bytesValue, 0, result, 1, bytesValue.length);
