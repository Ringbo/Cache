diff --git a/engine/src/main/java/org/terasology/engine/TerasologyEngine.java b/engine/src/main/java/org/terasology/engine/TerasologyEngine.java
index 13dbf17..49fe8cf 100644
--- a/engine/src/main/java/org/terasology/engine/TerasologyEngine.java
+++ b/engine/src/main/java/org/terasology/engine/TerasologyEngine.java
@@ -303,7 +303,7 @@
     }
 
     private void initAssets() {
-        BlockFamilyRegistryImpl familyFactoryRegistry = new BlockFamilyRegistryImpl(rootContext);
+        BlockFamilyRegistryImpl familyFactoryRegistry = new BlockFamilyRegistryImpl();
         rootContext.put(BlockFamilyRegistry.class, familyFactoryRegistry);
 
         // cast lambdas explicitly to avoid inconsistent compiler behavior wrt. type inference
