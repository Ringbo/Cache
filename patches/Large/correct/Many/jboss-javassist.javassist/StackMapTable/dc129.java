diff --git a/src/main/javassist/bytecode/StackMapTable.java b/src/main/javassist/bytecode/StackMapTable.java
index 3a8edf0..f1704dc 100644
--- a/src/main/javassist/bytecode/StackMapTable.java
+++ b/src/main/javassist/bytecode/StackMapTable.java
@@ -743,7 +743,7 @@
                 else if (offsetDelta < 64) {
                     byte[] newinfo = insertGap(info, pos, 2);
                     newinfo[pos] = (byte)entry;
-                    ByteArray.write16bit(newDelta, info, pos + 1);
+                    ByteArray.write16bit(newDelta, newinfo, pos + 1);
                     updatedInfo = newinfo;
                 }
                 else
