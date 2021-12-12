diff --git a/QKSMS/src/main/java/com/moez/QKSMS/ui/settings/SettingsFragment.java b/QKSMS/src/main/java/com/moez/QKSMS/ui/settings/SettingsFragment.java
index b0d2c73..ec0b8a8 100644
--- a/QKSMS/src/main/java/com/moez/QKSMS/ui/settings/SettingsFragment.java
+++ b/QKSMS/src/main/java/com/moez/QKSMS/ui/settings/SettingsFragment.java
@@ -520,7 +520,7 @@
             Fragment fragment = SettingsFragment.newInstance(resId);
             getFragmentManager()
                     .beginTransaction()
-                    .add(R.id.content_frame, fragment, CATEGORY_TAG)
+                    .replace(R.id.content_frame, fragment, CATEGORY_TAG)
                     .commit();
         }
 
