diff --git a/astrid/plugin-src/com/todoroo/astrid/actfm/ActFmLoginActivity.java b/astrid/plugin-src/com/todoroo/astrid/actfm/ActFmLoginActivity.java
index 7386f05..ef5eac6 100644
--- a/astrid/plugin-src/com/todoroo/astrid/actfm/ActFmLoginActivity.java
+++ b/astrid/plugin-src/com/todoroo/astrid/actfm/ActFmLoginActivity.java
@@ -304,7 +304,7 @@
         char last = 'a';
         for (int i = 0; i < chars.length; i++) {
             char r = acceptable.charAt(rand.nextInt(acceptable.length()));
-            while (checkSimilar(last, r))
+            while (!checkSimilar(last, r))
                 r = acceptable.charAt(rand.nextInt(acceptable.length()));
             last = r;
             chars[i] = r;
