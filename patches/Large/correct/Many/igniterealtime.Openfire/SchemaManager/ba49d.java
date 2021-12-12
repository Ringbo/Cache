diff --git a/src/java/org/jivesoftware/database/SchemaManager.java b/src/java/org/jivesoftware/database/SchemaManager.java
index f181130..726d3cc 100644
--- a/src/java/org/jivesoftware/database/SchemaManager.java
+++ b/src/java/org/jivesoftware/database/SchemaManager.java
@@ -87,7 +87,8 @@
      *
      * @param plugin the plugin.
      * @return true if database schema checked out fine, or was automatically installed
-     *      or updated successfully.
+     *      or updated successfully, or if it isn't needed. False will only be returned
+     *      if there is an error.
      */
     public boolean checkPluginSchema(final Plugin plugin) {
         final PluginManager pluginManager = XMPPServer.getInstance().getPluginManager();
@@ -96,7 +97,7 @@
         // If the schema key or database version aren't defined, then the plugin doesn't
         // need database tables.
         if (schemaKey == null || schemaVersion == -1) {
-            return false;
+            return true;
         }
         Connection con = null;
         try {
@@ -177,7 +178,7 @@
         }
         // If already up to date, return.
         if (currentVersion == requiredVersion) {
-            return false;
+            return true;
         }
         // If the database schema isn't installed at all, we need to install it.
         else if (currentVersion == -1) {
