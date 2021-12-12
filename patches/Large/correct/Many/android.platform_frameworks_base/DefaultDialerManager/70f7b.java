diff --git a/telecomm/java/android/telecom/DefaultDialerManager.java b/telecomm/java/android/telecom/DefaultDialerManager.java
index cd65232..2a707c9 100644
--- a/telecomm/java/android/telecom/DefaultDialerManager.java
+++ b/telecomm/java/android/telecom/DefaultDialerManager.java
@@ -170,7 +170,7 @@
 
         final Intent dialIntentWithTelScheme = new Intent(Intent.ACTION_DIAL);
         dialIntentWithTelScheme.setData(Uri.fromParts(PhoneAccount.SCHEME_TEL, "", null));
-        return filterByIntent(context, packageNames, dialIntentWithTelScheme);
+        return filterByIntent(context, packageNames, dialIntentWithTelScheme, userId);
     }
 
     public static List<String> getInstalledDialerApplications(Context context) {
@@ -204,17 +204,18 @@
      *
      * @param context A valid context
      * @param packageNames List of package names to filter.
+     * @param userId The UserId
      * @return The filtered list.
      */
     private static List<String> filterByIntent(Context context, List<String> packageNames,
-            Intent intent) {
+            Intent intent, int userId) {
         if (packageNames == null || packageNames.isEmpty()) {
             return new ArrayList<>();
         }
 
         final List<String> result = new ArrayList<>();
         final List<ResolveInfo> resolveInfoList = context.getPackageManager()
-                .queryIntentActivities(intent, 0);
+                .queryIntentActivitiesAsUser(intent, 0, userId);
         final int length = resolveInfoList.size();
         for (int i = 0; i < length; i++) {
             final ActivityInfo info = resolveInfoList.get(i).activityInfo;
