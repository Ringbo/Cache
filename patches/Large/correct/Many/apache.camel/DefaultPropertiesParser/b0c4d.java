diff --git a/camel-core/src/main/java/org/apache/camel/component/properties/DefaultPropertiesParser.java b/camel-core/src/main/java/org/apache/camel/component/properties/DefaultPropertiesParser.java
index c7fb283..3ab0f73 100644
--- a/camel-core/src/main/java/org/apache/camel/component/properties/DefaultPropertiesParser.java
+++ b/camel-core/src/main/java/org/apache/camel/component/properties/DefaultPropertiesParser.java
@@ -256,7 +256,7 @@
 
             if (value == null) {
                 StringBuilder esb = new StringBuilder();
-                if (propertiesComponent.isDefaultCreated()) {
+                if (propertiesComponent == null || propertiesComponent.isDefaultCreated()) {
                     // if the component was auto created then include more information that the end user should define it
                     esb.append("PropertiesComponent with name properties must be defined in CamelContext to support property placeholders. ");
                 }
