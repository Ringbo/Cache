diff --git a/WordPress/src/main/java/org/wordpress/android/ui/plugins/PluginDetailActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/plugins/PluginDetailActivity.java
index 5ad8190..828f21a 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/plugins/PluginDetailActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/plugins/PluginDetailActivity.java
@@ -660,7 +660,7 @@
                 .setAction(R.string.retry, new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
-                        dispatchUpdatePluginAction();
+                        dispatchInstallPluginAction();
                     }
                 })
                 .show();
