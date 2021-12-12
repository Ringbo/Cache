diff --git a/dexlib/src/main/java/org/jf/dexlib/Util/ByteArrayInput.java b/dexlib/src/main/java/org/jf/dexlib/Util/ByteArrayInput.java
index 72fa004..e74a62e 100644
--- a/dexlib/src/main/java/org/jf/dexlib/Util/ByteArrayInput.java
+++ b/dexlib/src/main/java/org/jf/dexlib/Util/ByteArrayInput.java
@@ -120,7 +120,7 @@
                       ((data[readAt++] & 0xffL) << 32) |
                       ((data[readAt++] & 0xffL) << 40) |
                       ((data[readAt++] & 0xffL) << 48) |
-                      ((data[readAt++] & 0xffL) << 58);
+                      ((data[readAt++] & 0xffL) << 56);
         cursor = readAt;
         return result;
     }
