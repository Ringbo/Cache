diff --git a/python/edu/src/com/jetbrains/python/edu/PyCharmEduInitialConfigurator.java b/python/edu/src/com/jetbrains/python/edu/PyCharmEduInitialConfigurator.java
index 8920cfe..e8476ac 100644
--- a/python/edu/src/com/jetbrains/python/edu/PyCharmEduInitialConfigurator.java
+++ b/python/edu/src/com/jetbrains/python/edu/PyCharmEduInitialConfigurator.java
@@ -219,11 +219,11 @@
 
   private static void patchKeymap() {
     Set<String> droppedActions = ContainerUtil.newHashSet(
-      "AddToFavoritesPopup", "RemoveFromFavorites",
+      "AddToFavoritesPopup",
       "DatabaseView.ImportDataSources",
       "CompileDirty", "Compile",
       // hidden
-      "AddNewFavoritesList", "EditFavorites", "RemoveFromFavorites", "RenameFavoritesList", "RemoveFavoritesList");
+      "AddNewFavoritesList", "EditFavorites", "RenameFavoritesList", "RemoveFavoritesList");
     KeymapManagerEx keymapManager = KeymapManagerEx.getInstanceEx();
 
 
