diff --git a/forge/forge_common/net/minecraft/src/forge/MinecraftForge.java b/forge/forge_common/net/minecraft/src/forge/MinecraftForge.java
index 3741023..73a658b 100755
--- a/forge/forge_common/net/minecraft/src/forge/MinecraftForge.java
+++ b/forge/forge_common/net/minecraft/src/forge/MinecraftForge.java
@@ -850,17 +850,17 @@
      * @param mod The BaseMod that provides this Entity.
      * @param ID The ID for the Entity. Needs to be unique combination of Mod and ID.
      * @param range How close a player has to be to be informed this Entity exists.
-     * @param updateFrequancy How many ticks between checking and sending information updates for this Entity.
+     * @param updateFrequency How many ticks between checking and sending information updates for this Entity.
      * @param sendVelocityInfo If velocity information should be included in the update information.
      * @return True, if successfully registered. False if the class is already registered.
      */
-    public static boolean registerEntity(Class entityClass, NetworkMod mod, int ID, int range, int updateFrequancy, boolean sendVelocityInfo)
+    public static boolean registerEntity(Class entityClass, NetworkMod mod, int ID, int range, int updateFrequency, boolean sendVelocityInfo)
     {
         if (ForgeHooks.entityTrackerMap.containsKey(entityClass))
         {
             return false;
         }
-        ForgeHooks.entityTrackerMap.put(entityClass, new EntityTrackerInfo(mod, ID, range, updateFrequancy, sendVelocityInfo));
+        ForgeHooks.entityTrackerMap.put(entityClass, new EntityTrackerInfo(mod, ID, range, updateFrequency, sendVelocityInfo));
         return true;
     }
 
