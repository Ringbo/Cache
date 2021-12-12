diff --git a/dropwizard-testing/src/main/java/com/yammer/dropwizard/testing/JsonHelpers.java b/dropwizard-testing/src/main/java/com/yammer/dropwizard/testing/JsonHelpers.java
index 0ba2be2..1a87955 100644
--- a/dropwizard-testing/src/main/java/com/yammer/dropwizard/testing/JsonHelpers.java
+++ b/dropwizard-testing/src/main/java/com/yammer/dropwizard/testing/JsonHelpers.java
@@ -32,9 +32,9 @@
      *
      * @param object    an object
      * @return {@code object} as a JSON string
-     * @throws IOException if there is an error writing {@code object} as JSON
+     * @throws IllegalArgumentException if there is an error encoding {@code object}
      */
-    public static String asJson(Object object) throws IOException {
+    public static String asJson(Object object) throws IllegalArgumentException {
         return JSON.writeValueAsString(object);
     }
 
