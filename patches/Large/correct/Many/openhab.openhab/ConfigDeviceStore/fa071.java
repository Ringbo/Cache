diff --git a/bundles/binding/org.openhab.binding.panstamp/src/main/java/org/openhab/binding/panstamp/internal/ConfigDeviceStore.java b/bundles/binding/org.openhab.binding.panstamp/src/main/java/org/openhab/binding/panstamp/internal/ConfigDeviceStore.java
index 8fe86e4..efc1e85 100644
--- a/bundles/binding/org.openhab.binding.panstamp/src/main/java/org/openhab/binding/panstamp/internal/ConfigDeviceStore.java
+++ b/bundles/binding/org.openhab.binding.panstamp/src/main/java/org/openhab/binding/panstamp/internal/ConfigDeviceStore.java
@@ -54,7 +54,7 @@
         val[7] = (byte) (prodId);
         if (map.containsKey(address)) {
             byte oldVal[] = map.get(address);
-            if (Arrays.equals(oldVal, val)) {
+            if (!Arrays.equals(oldVal, val)) {
                 logger.warn("Product code for device {} re-assigned from {}/{} to {}/{}.", address,
                         bytesToInt(oldVal, 0, 4), bytesToInt(oldVal, 4, 4), manId, prodId);
             }
@@ -81,7 +81,7 @@
 
     private int bytesToInt(byte bytes[], int idx, int len) {
         int val = 0;
-        for (int i = 0; i < len; ++len) {
+        for (int i = 0; i < len; i++) {
             val = val << 8;
             val = val | bytes[idx + i];
         }
