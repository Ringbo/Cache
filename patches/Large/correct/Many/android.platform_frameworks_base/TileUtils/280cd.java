diff --git a/packages/SettingsLib/src/com/android/settingslib/drawer/TileUtils.java b/packages/SettingsLib/src/com/android/settingslib/drawer/TileUtils.java
index baf12a0..a0109e2 100644
--- a/packages/SettingsLib/src/com/android/settingslib/drawer/TileUtils.java
+++ b/packages/SettingsLib/src/com/android/settingslib/drawer/TileUtils.java
@@ -414,13 +414,28 @@
         return false;
     }
 
-    private static int getIconFromUri(Context context, String uriString,
+    /**
+     * Gets the icon resource id from content provider.
+     * @param Context context
+     * @param uriString URI for the content provider
+     * @param providerMap Maps URI authorities to providers
+     * @return Resource id if returned by the content provider, otherwise 0
+     */
+    public static int getIconFromUri(Context context, String uriString,
             Map<String, IContentProvider> providerMap) {
         Bundle bundle = getBundleFromUri(context, uriString, providerMap);
         return (bundle != null) ? bundle.getInt(META_DATA_PREFERENCE_ICON, 0) : 0;
     }
 
-    private static String getTextFromUri(Context context, String uriString,
+    /**
+     * Gets text associated with the input key from the content provider.
+     * @param Context context
+     * @param uriString URI for the content provider
+     * @param providerMap Maps URI authorities to providers
+     * @param key Key mapping to the text in bundle returned by the content provider
+     * @return Text associated with the key, if returned by the content provider
+     */
+    public static String getTextFromUri(Context context, String uriString,
             Map<String, IContentProvider> providerMap, String key) {
         Bundle bundle = getBundleFromUri(context, uriString, providerMap);
         return (bundle != null) ? bundle.getString(key) : null;
