diff --git a/modules/activiti-bpmn-converter/src/main/java/org/activiti/bpmn/converter/UserTaskXMLConverter.java b/modules/activiti-bpmn-converter/src/main/java/org/activiti/bpmn/converter/UserTaskXMLConverter.java
index d588c3d..fb523c6 100644
--- a/modules/activiti-bpmn-converter/src/main/java/org/activiti/bpmn/converter/UserTaskXMLConverter.java
+++ b/modules/activiti-bpmn-converter/src/main/java/org/activiti/bpmn/converter/UserTaskXMLConverter.java
@@ -162,7 +162,7 @@
           didWriteExtensionStartElement = true;
         }
         xtw.writeStartElement(ACTIVITI_EXTENSIONS_PREFIX, customProperty.getName(), ACTIVITI_EXTENSIONS_NAMESPACE);
-        xtw.writeCharacters(customProperty.getSimpleValue());
+        xtw.writeCData(customProperty.getSimpleValue());
         xtw.writeEndElement();
       }
     }
