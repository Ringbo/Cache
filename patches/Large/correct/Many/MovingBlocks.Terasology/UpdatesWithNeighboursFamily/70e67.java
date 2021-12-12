diff --git a/engine/src/main/java/org/terasology/world/block/family/UpdatesWithNeighboursFamily.java b/engine/src/main/java/org/terasology/world/block/family/UpdatesWithNeighboursFamily.java
index cbfaf16..efc1a5e 100644
--- a/engine/src/main/java/org/terasology/world/block/family/UpdatesWithNeighboursFamily.java
+++ b/engine/src/main/java/org/terasology/world/block/family/UpdatesWithNeighboursFamily.java
@@ -75,7 +75,7 @@
     public Block getBlockFor(BlockUri blockUri) {
         if (getURI().equals(blockUri.getFamilyUri())) {
             try {
-                byte connections = Byte.parseByte(blockUri.getIdentifier().toString());
+                byte connections = Byte.parseByte(blockUri.getIdentifier().toLowerCase());
                 return blocks.get(connections);
             } catch (IllegalArgumentException e) {
                 return null;
