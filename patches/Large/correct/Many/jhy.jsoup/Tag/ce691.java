diff --git a/src/main/java/org/jsoup/parser/Tag.java b/src/main/java/org/jsoup/parser/Tag.java
index 28e3213..43d6c49 100644
--- a/src/main/java/org/jsoup/parser/Tag.java
+++ b/src/main/java/org/jsoup/parser/Tag.java
@@ -83,11 +83,10 @@
             return false;
 
         // head can only contain a few. if more than head in here, modify to have a list of valids
-        // TODO[must] - lookup what head can contain
-        // from memory: base, script, link, meta, title
+        // (could solve this with walk for ancestor)
         if (this.tagName.equals("head")) {
             if (child.tagName.equals("base") || child.tagName.equals("script") || child.tagName.equals("link") ||
-                    child.tagName.equals("meta") || child.tagName.equals("title")) {
+                    child.tagName.equals("meta") || child.tagName.equals("title") || child.tagName.equals("style") || child.tagName.equals("object")) {
                 return true;
             }
             return false;
