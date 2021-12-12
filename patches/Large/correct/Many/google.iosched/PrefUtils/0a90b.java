diff --git a/android/src/main/java/com/google/samples/apps/iosched/util/PrefUtils.java b/android/src/main/java/com/google/samples/apps/iosched/util/PrefUtils.java
index c539c69..87725fa 100644
--- a/android/src/main/java/com/google/samples/apps/iosched/util/PrefUtils.java
+++ b/android/src/main/java/com/google/samples/apps/iosched/util/PrefUtils.java
@@ -161,7 +161,7 @@
 
     public static void markUserRefusedSignIn(final Context context, final boolean refused) {
         SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
-        sp.edit().putBoolean(PREF_USER_REFUSED_SIGN_IN, refused).commit();
+        sp.edit().putBoolean(PREF_USER_REFUSED_SIGN_IN, refused).apply();
     }
 
     public static boolean hasUserRefusedSignIn(final Context context) {
