diff --git a/hazelcast/src/main/java/com/hazelcast/config/MapIndexConfig.java b/hazelcast/src/main/java/com/hazelcast/config/MapIndexConfig.java
index b7b7ad4..ad20f76 100644
--- a/hazelcast/src/main/java/com/hazelcast/config/MapIndexConfig.java
+++ b/hazelcast/src/main/java/com/hazelcast/config/MapIndexConfig.java
@@ -125,7 +125,7 @@
     public static String validateIndexAttribute(String attribute) {
         checkHasText(attribute, "Map index attribute must contain text");
         String keyPrefix = KEY_ATTRIBUTE_NAME.value();
-        if (attribute.startsWith(keyPrefix) & attribute.length() > keyPrefix.length()) {
+        if (attribute.startsWith(keyPrefix) && attribute.length() > keyPrefix.length()) {
             if (attribute.charAt(keyPrefix.length()) != '#') {
                 LOG.warning(KEY_ATTRIBUTE_NAME.value() + " used without a following '#' char in index attribute '"
                         + attribute + "'. Don't you want to index a key?");
