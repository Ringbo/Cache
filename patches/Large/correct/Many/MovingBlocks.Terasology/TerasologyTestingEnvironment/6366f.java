diff --git a/engine-tests/src/test/java/org/terasology/TerasologyTestingEnvironment.java b/engine-tests/src/test/java/org/terasology/TerasologyTestingEnvironment.java
index 0353a91..156a420 100644
--- a/engine-tests/src/test/java/org/terasology/TerasologyTestingEnvironment.java
+++ b/engine-tests/src/test/java/org/terasology/TerasologyTestingEnvironment.java
@@ -65,7 +65,7 @@
     private static ModuleManager moduleManager;
     private static AssetManager assetManager;
 
-    private static DisplayEnvironment env;
+    private static HeadlessEnvironment env;
 
     private EngineEntityManager engineEntityManager;
     private ComponentSystemManager componentSystemManager;
@@ -80,7 +80,7 @@
         if (!setup) {
             setup = true;
 
-            env = new DisplayEnvironment();
+            env = new HeadlessEnvironment();
             assetManager = CoreRegistry.get(AssetManager.class);
             blockManager = CoreRegistry.get(BlockManager.class);
             config = CoreRegistry.get(Config.class);
