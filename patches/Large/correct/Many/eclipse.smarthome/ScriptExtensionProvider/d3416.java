diff --git a/bundles/automation/org.eclipse.smarthome.automation.module.script/src/main/java/org/eclipse/smarthome/automation/module/script/ScriptExtensionProvider.java b/bundles/automation/org.eclipse.smarthome.automation.module.script/src/main/java/org/eclipse/smarthome/automation/module/script/ScriptExtensionProvider.java
index 865ca6f..d28017c 100644
--- a/bundles/automation/org.eclipse.smarthome.automation.module.script/src/main/java/org/eclipse/smarthome/automation/module/script/ScriptExtensionProvider.java
+++ b/bundles/automation/org.eclipse.smarthome.automation.module.script/src/main/java/org/eclipse/smarthome/automation/module/script/ScriptExtensionProvider.java
@@ -44,17 +44,20 @@
      * This method should return an Object of the given type. Note: get can be called multiple times in the scripts use
      * caching where appropriate.
      *
-     * @param scriptEngine the script engine instance requesting the given type
-     * @param type
-     * @return
+     * @param scriptIdentifier the identifier of the script that requests the given type
+     * @param type the type that is requested (must be part of the collection returned by the {@code #getTypes()} method
+     * @return the requested type (non-null)
+     * @throws IllegalArgumentException if the given type does not match to one returned by the {@code #getTypes()}
+     *             method
      */
-    public Object get(String scriptIdentifier, String type);
+    public Object get(String scriptIdentifier, String type) throws IllegalArgumentException;
 
     /**
      * This method should return variables and types of the concrete type which will be injected into the ScriptEngines
      * scope.
      *
-     * @param scriptEngineId - the script engine which will receive the preset
+     * @param scriptIdentifier the identifier of the script that receives the preset
+     * @return the presets, must be non-null (use an empty map instead)
      */
     public Map<String, Object> importPreset(String scriptIdentifier, String preset);
 
@@ -62,7 +65,7 @@
      * This will be called when the ScriptEngine will be unloaded (e.g. if the Script is deleted or updated).
      * Every Context information stored in the ScriptExtensionProvider should be removed.
      *
-     * @param scriptEngineId
+     * @param scriptIdentifier the identifier of the script that is unloaded
      */
     public void unload(String scriptIdentifier);
 
