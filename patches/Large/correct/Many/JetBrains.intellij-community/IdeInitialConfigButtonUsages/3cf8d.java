diff --git a/platform/platform-impl/src/com/intellij/internal/statistic/ideSettings/IdeInitialConfigButtonUsages.java b/platform/platform-impl/src/com/intellij/internal/statistic/ideSettings/IdeInitialConfigButtonUsages.java
index cb261e3..30d69a2 100644
--- a/platform/platform-impl/src/com/intellij/internal/statistic/ideSettings/IdeInitialConfigButtonUsages.java
+++ b/platform/platform-impl/src/com/intellij/internal/statistic/ideSettings/IdeInitialConfigButtonUsages.java
@@ -31,7 +31,7 @@
 
   private static volatile Set<String> ourPredefinedDisabledPlugins = ALL_PLUGINS_SELECTED;
 
-  private static volatile Set<String> ourDownloadedPlugins = Collections.emptySet();
+  private static Set<String> ourDownloadedPlugins = Collections.emptySet();
 
   public static ConfigImport getConfigImport() {
     return ourConfigImport;
@@ -66,11 +66,11 @@
     ourPredefinedDisabledPlugins = predefinedDisabledPlugins;
   }
 
-  public static Set<String> getDownloadedPlugins() {
+  public synchronized static Set<String> getDownloadedPlugins() {
     return ourDownloadedPlugins;
   }
 
-  public static void addDownloadedPlugin(String pluginId) {
+  public synchronized static void addDownloadedPlugin(String pluginId) {
     if (ourDownloadedPlugins.isEmpty()) {
       ourDownloadedPlugins = new HashSet<>();
     }
