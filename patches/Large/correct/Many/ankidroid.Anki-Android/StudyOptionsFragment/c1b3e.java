diff --git a/AnkiDroid/src/main/java/com/ichi2/anki/StudyOptionsFragment.java b/AnkiDroid/src/main/java/com/ichi2/anki/StudyOptionsFragment.java
index 78f9e6a..6aba082 100644
--- a/AnkiDroid/src/main/java/com/ichi2/anki/StudyOptionsFragment.java
+++ b/AnkiDroid/src/main/java/com/ichi2/anki/StudyOptionsFragment.java
@@ -479,7 +479,7 @@
                 if (delays.length() > 0) {
                     dyn.put("delays", delays);
                 } else {
-                    dyn.remove("delays");
+                    dyn.put("delays", JSONObject.NULL);
                 }
                 JSONArray ar = dyn.getJSONArray("terms");
                 ar.getJSONArray(0).put(0,
