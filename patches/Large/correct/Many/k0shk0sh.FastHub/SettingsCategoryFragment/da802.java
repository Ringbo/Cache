diff --git a/app/src/main/java/com/fastaccess/ui/modules/settings/category/SettingsCategoryFragment.java b/app/src/main/java/com/fastaccess/ui/modules/settings/category/SettingsCategoryFragment.java
index bd20ec9..381af82 100644
--- a/app/src/main/java/com/fastaccess/ui/modules/settings/category/SettingsCategoryFragment.java
+++ b/app/src/main/java/com/fastaccess/ui/modules/settings/category/SettingsCategoryFragment.java
@@ -351,7 +351,7 @@
                 Map<String, ?> savedPref = gson.fromJson(json.toString(), typeOfHashMap);
                 if (savedPref != null && !savedPref.isEmpty()) {
                     for (Map.Entry<String, ?> stringEntry : savedPref.entrySet()) {
-                        PrefHelper.set(stringEntry.getKey(), stringEntry.getKey());
+                        PrefHelper.set(stringEntry.getKey(), stringEntry.getValue());
                     }
                 }
                 callback.onThemeChanged();
