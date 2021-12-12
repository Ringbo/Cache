diff --git a/grails-plugin-converters/src/main/groovy/org/codehaus/groovy/grails/web/converters/marshaller/json/DomainClassMarshaller.java b/grails-plugin-converters/src/main/groovy/org/codehaus/groovy/grails/web/converters/marshaller/json/DomainClassMarshaller.java
index 4222294..66142c9 100644
--- a/grails-plugin-converters/src/main/groovy/org/codehaus/groovy/grails/web/converters/marshaller/json/DomainClassMarshaller.java
+++ b/grails-plugin-converters/src/main/groovy/org/codehaus/groovy/grails/web/converters/marshaller/json/DomainClassMarshaller.java
@@ -219,7 +219,7 @@
         }
         JSONWriter writer = json.getWriter();
         writer.object();
-        writer.key("class").value(referencedDomainClass.getName());
+        writer.key("class").value(referencedDomainClass.getFullName());
         writer.key("id").value(idValue);
         writer.endObject();
     }
