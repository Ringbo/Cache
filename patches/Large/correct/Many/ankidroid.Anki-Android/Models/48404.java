diff --git a/src/com/ichi2/libanki/Models.java b/src/com/ichi2/libanki/Models.java
index e9bad64..bdb32ed 100644
--- a/src/com/ichi2/libanki/Models.java
+++ b/src/com/ichi2/libanki/Models.java
@@ -1096,7 +1096,7 @@
                 s += flds.getJSONObject(i).getString("name");
             }
             JSONArray tmpls = m.getJSONArray("tmpls");
-            for (int i = 0; i < flds.length(); ++i) {
+            for (int i = 0; i < tmpls.length(); ++i) {
             	JSONObject t = tmpls.getJSONObject(i);
                 s += t.getString("name");
                 s += t.getString("qfmt");
