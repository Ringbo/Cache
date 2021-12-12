diff --git a/src/main/java/net/minecraftforge/registries/GameData.java b/src/main/java/net/minecraftforge/registries/GameData.java
index 7184d62..51e8472 100644
--- a/src/main/java/net/minecraftforge/registries/GameData.java
+++ b/src/main/java/net/minecraftforge/registries/GameData.java
@@ -158,7 +158,7 @@
         Validate.notNull(reg, "Attempted to get vanilla wrapper for unknown registry: " + cls.toString());
         @SuppressWarnings("unchecked")
         RegistryNamespacedDefaultedByKey<ResourceLocation, V> ret = reg.getSlaveMap(NamespacedDefaultedWrapper.Factory.ID, NamespacedDefaultedWrapper.class);
-        Validate.notNull(reg, "Attempted to get vanilla wrapper for registry created incorrectly: " + cls.toString());
+        Validate.notNull(ret, "Attempted to get vanilla wrapper for registry created incorrectly: " + cls.toString());
         return ret;
     }
 
@@ -168,7 +168,7 @@
         Validate.notNull(reg, "Attempted to get vanilla wrapper for unknown registry: " + cls.toString());
         @SuppressWarnings("unchecked")
         RegistryNamespaced<ResourceLocation, V> ret = reg.getSlaveMap(NamespacedWrapper.Factory.ID, NamespacedWrapper.class);
-        Validate.notNull(reg, "Attempted to get vanilla wrapper for registry created incorrectly: " + cls.toString());
+        Validate.notNull(ret, "Attempted to get vanilla wrapper for registry created incorrectly: " + cls.toString());
         return ret;
     }
 
