diff --git a/src/java/grails/converters/JSON.java b/src/java/grails/converters/JSON.java
index f361790..fc460bc 100644
--- a/src/java/grails/converters/JSON.java
+++ b/src/java/grails/converters/JSON.java
@@ -175,7 +175,7 @@
      */
     public void value(Object o) throws ConverterException {
         try {
-            if (o == null) {
+            if (o == null || o.equals(JSONObject.NULL)) {
                 writer.value(null);
             } else if (o instanceof String) {
                 writer.value(o);
