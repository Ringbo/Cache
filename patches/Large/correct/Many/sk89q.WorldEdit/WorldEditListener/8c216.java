diff --git a/src/WorldEditListener.java b/src/WorldEditListener.java
index b1f3bda..d5b3648 100755
--- a/src/WorldEditListener.java
+++ b/src/WorldEditListener.java
@@ -260,7 +260,7 @@
                 text[3] = args0.length > 4 ? args0[4] : "";
                 return new SignBlock(blockType.getID(), data, text);
             } else if (blockType == BlockType.MOB_SPAWNER) {
-                if (args0.length > 0) {
+                if (args0.length > 1) {
                     if (!ServerInterface.isValidMobType(args0[1])) {
                         throw new InvalidItemException(arg, "Unknown mob type '" + args0[1] + "'");
                     }
