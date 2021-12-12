diff --git a/modules/Core/src/test/java/org/terasology/world/generator/TreeTests.java b/modules/Core/src/test/java/org/terasology/world/generator/TreeTests.java
index c14ffe7..b4afc08 100644
--- a/modules/Core/src/test/java/org/terasology/world/generator/TreeTests.java
+++ b/modules/Core/src/test/java/org/terasology/world/generator/TreeTests.java
@@ -57,7 +57,7 @@
         CoreRegistry.setContext(context);
 
         // Needed only as long as #1536 is unresolved
-        context.put(Config.class, new Config());
+        context.put(Config.class, new Config(null));
 
         blockManager = Mockito.mock(BlockManager.class);
         Block air = blockManager.getBlock(BlockManager.AIR_ID);
