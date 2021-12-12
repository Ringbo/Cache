diff --git a/modules/activiti-bpmn-converter/src/main/java/org/activiti/bpmn/converter/ServiceTaskXMLConverter.java b/modules/activiti-bpmn-converter/src/main/java/org/activiti/bpmn/converter/ServiceTaskXMLConverter.java
index bfb0b61..798cfbf 100644
--- a/modules/activiti-bpmn-converter/src/main/java/org/activiti/bpmn/converter/ServiceTaskXMLConverter.java
+++ b/modules/activiti-bpmn-converter/src/main/java/org/activiti/bpmn/converter/ServiceTaskXMLConverter.java
@@ -126,7 +126,7 @@
         } else {
           xtw.writeStartElement(ACTIVITI_EXTENSIONS_PREFIX, ELEMENT_FIELD_STRING, ACTIVITI_EXTENSIONS_NAMESPACE);
         }
-        xtw.writeCharacters(customProperty.getSimpleValue());
+        xtw.writeCData(customProperty.getSimpleValue());
         xtw.writeEndElement();
         xtw.writeEndElement();
       }
