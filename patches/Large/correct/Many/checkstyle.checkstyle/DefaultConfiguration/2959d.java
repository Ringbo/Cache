diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/DefaultConfiguration.java b/src/main/java/com/puppycrawl/tools/checkstyle/DefaultConfiguration.java
index 89a4cc6..240f3ea 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/DefaultConfiguration.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/DefaultConfiguration.java
@@ -104,7 +104,7 @@
      * @param value the value of the attribute.
      */
     public void addAttribute(String attributeName, String value) {
-        final String current = attributeMap.put(attributeName, value);
+        final String current = attributeMap.get(attributeName);
         if (current == null) {
             attributeMap.put(attributeName, value);
         }
