diff --git a/engine/src/main/java/org/terasology/rendering/nui/layers/mainMenu/selectModulesScreen/SelectModulesScreen.java b/engine/src/main/java/org/terasology/rendering/nui/layers/mainMenu/selectModulesScreen/SelectModulesScreen.java
index 0c02d72..0b1254f 100644
--- a/engine/src/main/java/org/terasology/rendering/nui/layers/mainMenu/selectModulesScreen/SelectModulesScreen.java
+++ b/engine/src/main/java/org/terasology/rendering/nui/layers/mainMenu/selectModulesScreen/SelectModulesScreen.java
@@ -526,7 +526,7 @@
     }
 
     private List<Name> getExplicitlySelectedModules() {
-        return sortedModules.stream().filter(ModuleSelectionInfo::isExplicitSelection).map(info ->
+        return allSortedModules.stream().filter(ModuleSelectionInfo::isExplicitSelection).map(info ->
                 info.getMetadata().getId()).collect(Collectors.toCollection(ArrayList::new));
     }
 
