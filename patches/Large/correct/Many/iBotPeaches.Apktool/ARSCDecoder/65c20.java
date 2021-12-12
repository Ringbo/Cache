diff --git a/apktool-lib/src/main/java/brut/androlib/res/decoder/ARSCDecoder.java b/apktool-lib/src/main/java/brut/androlib/res/decoder/ARSCDecoder.java
index 239059d..19d7b66 100644
--- a/apktool-lib/src/main/java/brut/androlib/res/decoder/ARSCDecoder.java
+++ b/apktool-lib/src/main/java/brut/androlib/res/decoder/ARSCDecoder.java
@@ -267,7 +267,7 @@
         if (exceedingSize > 0) {
             byte[] buf = new byte[exceedingSize];
             mIn.readFully(buf);
-            BigInteger exceedingBI = new BigInteger(buf);
+            BigInteger exceedingBI = new BigInteger(1, buf);
 
             if (exceedingBI.equals(BigInteger.ZERO)) {
                 LOGGER.fine(String.format(
@@ -275,7 +275,7 @@
                     KNOWN_CONFIG_BYTES));
             } else {
                 LOGGER.warning(String.format(
-                    "Config flags size > %d. Exceeding bytes: %0" + (exceedingSize * 2) + "X.",
+                    "Config flags size > %d. Exceeding bytes: 0x%X.",
                     KNOWN_CONFIG_BYTES, exceedingBI));
                 isInvalid = true;
             }
