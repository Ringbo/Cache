diff --git a/WordPress/src/main/java/org/wordpress/android/ui/notifications/utils/SimperiumUtils.java b/WordPress/src/main/java/org/wordpress/android/ui/notifications/utils/SimperiumUtils.java
index 0641391..0fea3a6 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/notifications/utils/SimperiumUtils.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/notifications/utils/SimperiumUtils.java
@@ -39,7 +39,7 @@
         return mMetaBucket;
     }
 
-    public static Simperium configureSimperium(final Context context, String token) {
+    public static synchronized Simperium configureSimperium(final Context context, String token) {
         // Create a new instance of Simperium if it doesn't exist yet.
         // In any case, authorize the user.
         if (mSimperium == null) {
