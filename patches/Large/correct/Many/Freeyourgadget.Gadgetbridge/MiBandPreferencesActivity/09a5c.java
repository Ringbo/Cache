diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/miband/MiBandPreferencesActivity.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/miband/MiBandPreferencesActivity.java
index dbb83aa..e121413 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/miband/MiBandPreferencesActivity.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/miband/MiBandPreferencesActivity.java
@@ -57,7 +57,7 @@
 
     private void addTryListeners() {
         for (final NotificationType type : NotificationType.values()) {
-            String prefKey = "mi_try_" + type.getFixedValue();
+            String prefKey = "mi_try_" + type.getGenericType();
             final Preference tryPref = findPreference(prefKey);
             if (tryPref != null) {
                 tryPref.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
