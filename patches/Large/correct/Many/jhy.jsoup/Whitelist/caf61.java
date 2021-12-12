diff --git a/src/main/java/org/jsoup/safety/Whitelist.java b/src/main/java/org/jsoup/safety/Whitelist.java
index 2c1150c..7908c2c 100644
--- a/src/main/java/org/jsoup/safety/Whitelist.java
+++ b/src/main/java/org/jsoup/safety/Whitelist.java
@@ -319,10 +319,22 @@
         return this;
     }
 
-    boolean isSafeTag(String tag) {
+    /**
+     * Test if the supplied tag is allowed by this whitelist
+     * @param tag test tag
+     * @return true if allowed
+     */
+    protected boolean isSafeTag(String tag) {
         return tagNames.contains(TagName.valueOf(tag));
     }
 
+    /**
+     * Test if the supplied attribute is allowed by this whitelist for this tag
+     * @param tagName tag to consider allowing the attribute in
+     * @param el element under test, to confirm protocol
+     * @param attr attribute under test
+     * @return true if allowed
+     */
     boolean isSafeAttribute(String tagName, Element el, Attribute attr) {
         TagName tag = TagName.valueOf(tagName);
         AttributeKey key = AttributeKey.valueOf(attr.getKey());
