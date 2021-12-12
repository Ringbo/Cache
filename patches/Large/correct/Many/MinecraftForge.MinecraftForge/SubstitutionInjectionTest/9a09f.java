diff --git a/src/test/java/net/minecraftforge/fml/common/registry/SubstitutionInjectionTest.java b/src/test/java/net/minecraftforge/fml/common/registry/SubstitutionInjectionTest.java
index 68b3a1f..3f7a9d8 100644
--- a/src/test/java/net/minecraftforge/fml/common/registry/SubstitutionInjectionTest.java
+++ b/src/test/java/net/minecraftforge/fml/common/registry/SubstitutionInjectionTest.java
@@ -99,7 +99,7 @@
         assertEquals("ItemBlock points at vanilla block", toSub, dirtitem.getBlock());
 
         // TEST 2: Is the substitute still in the registry? The snapshot was taken before the substitute was added so it should NOT exist
-        GameData.injectSnapshot(snapshot, true, true);
+        GameData.injectSnapshot(snapshot, false, true);
         ObjectHolderRegistry.INSTANCE.applyObjectHolders();
         fnd = blockRegistry.getValue(MC_DIRT);
         currDirt = Blocks.DIRT;
@@ -120,16 +120,16 @@
         dirtitem = (ItemBlock) itemRegistry.getValue(MC_DIRT);
         assertEquals("ItemBlock points at vanilla block", toSub, dirtitem.getBlock());
 
-        // TEST 2 repeat: Is the substitute still in the registry? The snapshot was taken before the substitute was added so it should NOT exist
+        // TEST 3: Is the substitute still in the registry? The snapshot was taken before the substitute, but we inject frozen data, so we SHOULD have the sub.
         GameData.injectSnapshot(snapshot, true, true);
         ObjectHolderRegistry.INSTANCE.applyObjectHolders();
         fnd = blockRegistry.getValue(MC_DIRT);
         currDirt = Blocks.DIRT;
-        assertEquals("Got my dirt substitute - Blocks", vanilDirt, currDirt);
+        assertEquals("Got vanilla dirt - Blocks", toSub, currDirt);
         assertEquals("ObjectHolder didn't apply - Blocks and registry", currDirt, fnd);
-        assertEquals("Got my dirt substitute - registry", vanilDirt, fnd);
+        assertEquals("Got vanilla dirt - registry", toSub, fnd);
         dirtitem = (ItemBlock) itemRegistry.getValue(MC_DIRT);
-        assertEquals("ItemBlock points at my block", vanilDirt, dirtitem.getBlock());
+        assertEquals("ItemBlock points at vanilla block", toSub, dirtitem.getBlock());
 
         // TEST 3 repeat: Does the substitute get restored when reverting to frozen state? The substitute should be found in the registry again
         GameData.revertToFrozen();
