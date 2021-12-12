diff --git a/fml/client/net/minecraft/src/ModLoader.java b/fml/client/net/minecraft/src/ModLoader.java
index 4dda3ec..8c82bcb 100644
--- a/fml/client/net/minecraft/src/ModLoader.java
+++ b/fml/client/net/minecraft/src/ModLoader.java
@@ -561,7 +561,7 @@
      */
     public static void registerEntityID(Class<? extends Entity> entityClass, String entityName, int id)
     {
-        EntityRegistry.registerEntityID(entityClass, entityName, id);
+        EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
     }
 
     /**
@@ -575,7 +575,7 @@
      */
     public static void registerEntityID(Class<? extends Entity> entityClass, String entityName, int id, int background, int foreground)
     {
-        EntityRegistry.registerEntityID(entityClass, entityName, id, background, foreground);
+        EntityRegistry.registerGlobalEntityID(entityClass, entityName, id, background, foreground);
     }
 
     public static void registerKey(BaseMod mod, KeyBinding keyHandler, boolean allowRepeat)
