diff --git a/AnkiDroid/src/main/java/com/ichi2/libanki/Media.java b/AnkiDroid/src/main/java/com/ichi2/libanki/Media.java
index 8cd2606..2b09593 100644
--- a/AnkiDroid/src/main/java/com/ichi2/libanki/Media.java
+++ b/AnkiDroid/src/main/java/com/ichi2/libanki/Media.java
@@ -307,7 +307,7 @@
                 // NOTE: python uses the named group 'fname'. Java doesn't have named groups, so we have to determine
                 // the index based on which pattern we are using
                 int fnameIdx = p == fSoundRegexps ? 2 : p == fImgRegExpU ? 2 : 3;
-                m = p.matcher(string);
+                m = p.matcher(s);
                 while (m.find()) {
                     String fname = m.group(fnameIdx);
                     boolean isLocal = !fRemotePattern.matcher(fname.toLowerCase(Locale.US)).find();
