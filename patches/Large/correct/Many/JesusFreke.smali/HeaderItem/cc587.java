diff --git a/dexlib/src/main/java/org/jf/dexlib/HeaderItem.java b/dexlib/src/main/java/org/jf/dexlib/HeaderItem.java
index d215c1f..e3f9a0f 100644
--- a/dexlib/src/main/java/org/jf/dexlib/HeaderItem.java
+++ b/dexlib/src/main/java/org/jf/dexlib/HeaderItem.java
@@ -48,7 +48,7 @@
 
     /** the endianness constants */
     private static final int LITTLE_ENDIAN = 0x12345678;
-    private static final int BIG_ENDIAN = 0x78562312;
+    private static final int BIG_ENDIAN = 0x78563412;
 
     /* Which magic value to use when writing out the header item */
     private int magic_index = 0;
