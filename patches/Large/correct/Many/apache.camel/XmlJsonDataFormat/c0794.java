diff --git a/camel-core/src/main/java/org/apache/camel/model/dataformat/XmlJsonDataFormat.java b/camel-core/src/main/java/org/apache/camel/model/dataformat/XmlJsonDataFormat.java
index b29f4ed..31eb6e7 100644
--- a/camel-core/src/main/java/org/apache/camel/model/dataformat/XmlJsonDataFormat.java
+++ b/camel-core/src/main/java/org/apache/camel/model/dataformat/XmlJsonDataFormat.java
@@ -96,10 +96,10 @@
             rootName = options.get(ROOT_NAME);
         }
         if (options.containsKey(ELEMENT_NAME)) {
-            encoding = options.get(ELEMENT_NAME);
+            elementName = options.get(ELEMENT_NAME);
         }
         if (options.containsKey(ARRAY_NAME)) {
-            elementName = options.get(ARRAY_NAME);
+            arrayName = options.get(ARRAY_NAME);
         }
         if (options.containsKey(EXPANDABLE_PROPERTIES)) {
             expandableProperties = Arrays.asList(options.get(EXPANDABLE_PROPERTIES).split(" "));
