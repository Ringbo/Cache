diff --git a/astrid/plugin-src/com/todoroo/astrid/tags/TagFilterExposer.java b/astrid/plugin-src/com/todoroo/astrid/tags/TagFilterExposer.java
index 6a416ce..119ee2a 100644
--- a/astrid/plugin-src/com/todoroo/astrid/tags/TagFilterExposer.java
+++ b/astrid/plugin-src/com/todoroo/astrid/tags/TagFilterExposer.java
@@ -310,7 +310,7 @@
             if (text == null || text.length() == 0) {
                 return false;
             } else {
-                int renamed = tagService.rename(tag, text);
+                int renamed = tagService.rename(uuid, text);
                 Toast.makeText(this, getString(R.string.TEA_tags_renamed, tag, text, renamed),
                         Toast.LENGTH_SHORT).show();
                 return true;
