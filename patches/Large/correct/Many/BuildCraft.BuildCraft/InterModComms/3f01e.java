diff --git a/common/buildcraft/core/InterModComms.java b/common/buildcraft/core/InterModComms.java
index aa91300..93fd605 100644
--- a/common/buildcraft/core/InterModComms.java
+++ b/common/buildcraft/core/InterModComms.java
@@ -75,7 +75,7 @@
 		} else {
 			NBTTagCompound recipe = msg.getNBTValue();
 			if (!recipe.hasKey("id") || !recipe.hasKey("input", 9) || !recipe.hasKey("output", 10)
-					|| !recipe.hasKey("energy", 6)) { // Ints - NBTBase#NBTTypes
+					|| !recipe.hasKey("energy", 3)) { // Ints - NBTBase#NBTTypes
 				failed = true;
 			} else {
 				NBTTagList list = (NBTTagList) recipe.getTag("input");
