diff --git a/addons/preferences/src/org/holoeverywhere/preference/_SharedPreferencesImpl_JSON.java b/addons/preferences/src/org/holoeverywhere/preference/_SharedPreferencesImpl_JSON.java
index 9fe9b04..adc8717 100644
--- a/addons/preferences/src/org/holoeverywhere/preference/_SharedPreferencesImpl_JSON.java
+++ b/addons/preferences/src/org/holoeverywhere/preference/_SharedPreferencesImpl_JSON.java
@@ -39,7 +39,7 @@
             Iterator<String> iterator = object.keys();
             while (iterator.hasNext()) {
                 final String key = iterator.next();
-                object.remove(key);
+                iterator.remove();
                 notifyOnChange(key);
             }
             return true;
