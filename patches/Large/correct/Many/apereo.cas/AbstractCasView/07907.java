diff --git a/cas-server-core-web/src/main/java/org/jasig/cas/services/web/view/AbstractCasView.java b/cas-server-core-web/src/main/java/org/jasig/cas/services/web/view/AbstractCasView.java
index bc95219..05f258f 100644
--- a/cas-server-core-web/src/main/java/org/jasig/cas/services/web/view/AbstractCasView.java
+++ b/cas-server-core-web/src/main/java/org/jasig/cas/services/web/view/AbstractCasView.java
@@ -167,7 +167,7 @@
      * @param attributes the attributes
      * @return the map of attributes to return
      */
-    private Map<String, Object> convertAttributeValuesToMultiValuedObjects(final Map<String, Object> attributes) {
+    private static Map<String, Object> convertAttributeValuesToMultiValuedObjects(final Map<String, Object> attributes) {
         final Map<String, Object> attributesToReturn = new HashMap<>();
         final Set<Map.Entry<String, Object>> entries = attributes.entrySet();
         for (final Map.Entry<String, Object> entry : entries) {
