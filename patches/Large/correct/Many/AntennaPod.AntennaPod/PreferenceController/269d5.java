diff --git a/app/src/main/java/de/danoeh/antennapod/preferences/PreferenceController.java b/app/src/main/java/de/danoeh/antennapod/preferences/PreferenceController.java
index 39edfe5..4d4b2be 100644
--- a/app/src/main/java/de/danoeh/antennapod/preferences/PreferenceController.java
+++ b/app/src/main/java/de/danoeh/antennapod/preferences/PreferenceController.java
@@ -428,7 +428,7 @@
                 entries[x] = res.getString(R.string.pref_smart_mark_as_played_disabled);
             } else {
                 Integer v = Integer.parseInt(values[x]);
-                entries[x] = res.getQuantityString(R.plurals.time_seconds_quantified, v);
+                entries[x] = res.getQuantityString(R.plurals.time_seconds_quantified, v, v);
             }
         }
         pref.setEntries(entries);
