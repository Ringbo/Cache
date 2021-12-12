diff --git a/src/main/java/net/minecraftforge/fml/common/AutomaticEventSubscriber.java b/src/main/java/net/minecraftforge/fml/common/AutomaticEventSubscriber.java
index 950cf5e..c659748 100644
--- a/src/main/java/net/minecraftforge/fml/common/AutomaticEventSubscriber.java
+++ b/src/main/java/net/minecraftforge/fml/common/AutomaticEventSubscriber.java
@@ -85,7 +85,7 @@
             }
             catch (Throwable e)
             {
-                FMLLog.log.error("An error occurred trying to load an EventBusSubscriber {} for modid {}", mod.getModId(), e);
+                FMLLog.log.error("An error occurred trying to load an EventBusSubscriber {} for modid {}", targ.getClassName(), mod.getModId(), e);
                 throw new LoaderException(e);
             }
         }
