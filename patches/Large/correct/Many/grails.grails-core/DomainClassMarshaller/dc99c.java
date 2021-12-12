diff --git a/grails-plugin-converters/src/main/groovy/org/codehaus/groovy/grails/web/converters/marshaller/json/DomainClassMarshaller.java b/grails-plugin-converters/src/main/groovy/org/codehaus/groovy/grails/web/converters/marshaller/json/DomainClassMarshaller.java
index b335d4d..4222294 100644
--- a/grails-plugin-converters/src/main/groovy/org/codehaus/groovy/grails/web/converters/marshaller/json/DomainClassMarshaller.java
+++ b/grails-plugin-converters/src/main/groovy/org/codehaus/groovy/grails/web/converters/marshaller/json/DomainClassMarshaller.java
@@ -133,7 +133,7 @@
                 Object referenceObject = beanWrapper.getPropertyValue(property.getName());
                 if (isRenderDomainClassRelations()) {
                     if (referenceObject == null) {
-                        writer.value(null);
+                        writer.valueNull();
                     }
                     else {
                         referenceObject = proxyHandler.unwrapIfProxy(referenceObject);
