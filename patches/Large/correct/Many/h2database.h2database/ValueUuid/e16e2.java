diff --git a/h2/src/main/org/h2/value/ValueUuid.java b/h2/src/main/org/h2/value/ValueUuid.java
index b15afc1..9e2ee2f 100644
--- a/h2/src/main/org/h2/value/ValueUuid.java
+++ b/h2/src/main/org/h2/value/ValueUuid.java
@@ -57,17 +57,17 @@
     }
 
     /**
-     * Get or create a UUID for the given 32 bytes.
+     * Get or create a UUID for the given 16 bytes.
      *
-     * @param binary the byte array (must be at least 32 bytes long)
+     * @param binary the byte array (must be at least 16 bytes long)
      * @return the UUID
      */
     public static ValueUuid get(byte[] binary) {
-        if (binary.length < 32) {
+        if (binary.length < 16) {
             return get(StringUtils.convertBytesToString(binary));
         }
         long high = Utils.readLong(binary, 0);
-        long low = Utils.readLong(binary, 16);
+        long low = Utils.readLong(binary, 8);
         return (ValueUuid) Value.cache(new ValueUuid(high, low));
     }
 
