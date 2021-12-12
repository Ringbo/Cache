diff --git a/acra-core/src/main/java/org/acra/prefs/SharedPreferencesFactory.java b/acra-core/src/main/java/org/acra/prefs/SharedPreferencesFactory.java
index a0655cb..ba917b4 100644
--- a/acra-core/src/main/java/org/acra/prefs/SharedPreferencesFactory.java
+++ b/acra-core/src/main/java/org/acra/prefs/SharedPreferencesFactory.java
@@ -54,7 +54,7 @@
     public static boolean shouldEnableACRA(@NonNull SharedPreferences prefs) {
         boolean enableAcra = true;
         try {
-            final boolean disableAcra = prefs.getBoolean(ACRA.PREF_DISABLE_ACRA, true);
+            final boolean disableAcra = prefs.getBoolean(ACRA.PREF_DISABLE_ACRA, false);
             enableAcra = prefs.getBoolean(ACRA.PREF_ENABLE_ACRA, !disableAcra);
         } catch (Exception e) {
             // In case of a ClassCastException
