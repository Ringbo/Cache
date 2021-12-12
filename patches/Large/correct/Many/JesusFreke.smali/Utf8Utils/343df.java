diff --git a/dexlib/src/main/java/org/jf/dexlib/Util/Utf8Utils.java b/dexlib/src/main/java/org/jf/dexlib/Util/Utf8Utils.java
index c2ccd26..0011bc5 100644
--- a/dexlib/src/main/java/org/jf/dexlib/Util/Utf8Utils.java
+++ b/dexlib/src/main/java/org/jf/dexlib/Util/Utf8Utils.java
@@ -136,7 +136,7 @@
                         return throwBadUtf8(v1, at + 1);
                     }
                     int v2 = bytes[at + 2] & 0xFF;
-                    if ((v1 & 0xc0) != 0x80) {
+                    if ((v2 & 0xc0) != 0x80) {
                         return throwBadUtf8(v2, at + 2);
                     }
                     int value = ((v0 & 0x0f) << 12) | ((v1 & 0x3f) << 6) |
