diff --git a/dex-reader/src/main/java/com/googlecode/dex2jar/reader/DexCodeReader.java b/dex-reader/src/main/java/com/googlecode/dex2jar/reader/DexCodeReader.java
index b870cb0..6a6b270 100644
--- a/dex-reader/src/main/java/com/googlecode/dex2jar/reader/DexCodeReader.java
+++ b/dex-reader/src/main/java/com/googlecode/dex2jar/reader/DexCodeReader.java
@@ -424,7 +424,7 @@
                 break;
             }
             case F23x: {
-                int tmp = in.readShortx();
+                int tmp = in.readUShortx();
                 n.x3x(opcode, uOpcodeH, tmp & 0xFF, tmp >> 8);
                 break;
             }
