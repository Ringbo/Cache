diff --git a/components/jolokia-assertions/src/main/java/io/fabric8/jolokia/support/JolokiaHelpers.java b/components/jolokia-assertions/src/main/java/io/fabric8/jolokia/support/JolokiaHelpers.java
index 44c3fc5..8b4f1a3 100644
--- a/components/jolokia-assertions/src/main/java/io/fabric8/jolokia/support/JolokiaHelpers.java
+++ b/components/jolokia-assertions/src/main/java/io/fabric8/jolokia/support/JolokiaHelpers.java
@@ -67,7 +67,7 @@
             JSONObject jsonObject = (JSONObject) value;
             if (!JSONObject.class.isAssignableFrom(clazz)) {
                 String json = jsonObject.toJSONString();
-                return getObjectMapper().reader(clazz).readValue(json);
+                return getObjectMapper().readerFor(clazz).readValue(json);
             }
         }
         return value;
