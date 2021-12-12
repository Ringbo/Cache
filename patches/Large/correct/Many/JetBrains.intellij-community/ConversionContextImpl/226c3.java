diff --git a/platform/lang-impl/src/com/intellij/conversion/impl/ConversionContextImpl.java b/platform/lang-impl/src/com/intellij/conversion/impl/ConversionContextImpl.java
index 917d30d..0b5a102 100644
--- a/platform/lang-impl/src/com/intellij/conversion/impl/ConversionContextImpl.java
+++ b/platform/lang-impl/src/com/intellij/conversion/impl/ConversionContextImpl.java
@@ -124,7 +124,7 @@
 
   @NotNull
   public String expandPath(@NotNull String path, @NotNull ModuleSettingsImpl moduleSettings) {
-    return createExpandMacroMap(moduleSettings).substitute(path, true, null);
+    return createExpandMacroMap(moduleSettings).substitute(path, true);
   }
 
   private ExpandMacroToPathMap createExpandMacroMap(@Nullable ModuleSettingsImpl moduleSettings) {
@@ -139,12 +139,12 @@
   @NotNull
   public String collapsePath(@NotNull String path) {
     ReplacePathToMacroMap map = createCollapseMacroMap(PathMacrosImpl.PROJECT_DIR_MACRO_NAME, myProjectBaseDir);
-    return map.substitute(path, SystemInfo.isFileSystemCaseSensitive, null);
+    return map.substitute(path, SystemInfo.isFileSystemCaseSensitive);
   }
 
   public String collapsePath(@NotNull String path, @NotNull ModuleSettingsImpl moduleSettings) {
     final ReplacePathToMacroMap map = createCollapseMacroMap(PathMacrosImpl.MODULE_DIR_MACRO_NAME, moduleSettings.getModuleFile().getParentFile());
-    return map.substitute(path, SystemInfo.isFileSystemCaseSensitive, null);
+    return map.substitute(path, SystemInfo.isFileSystemCaseSensitive);
   }
 
   private static ReplacePathToMacroMap createCollapseMacroMap(final String macroName, final File dir) {
@@ -185,7 +185,7 @@
       for (Element root : roots) {
         final String url = root.getAttributeValue("url");
         final String path = VfsUtil.urlToPath(url);
-        files.add(new File(PathUtil.getLocalPath(pathMap.substitute(path, true, null))));
+        files.add(new File(PathUtil.getLocalPath(pathMap.substitute(path, true))));
       }
     }
     return files;
