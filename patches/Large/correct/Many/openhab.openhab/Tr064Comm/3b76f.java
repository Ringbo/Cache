diff --git a/bundles/binding/org.openhab.binding.fritzboxtr064/src/main/java/org/openhab/binding/fritzboxtr064/internal/Tr064Comm.java b/bundles/binding/org.openhab.binding.fritzboxtr064/src/main/java/org/openhab/binding/fritzboxtr064/internal/Tr064Comm.java
index 5b3eeb8..909cfad 100644
--- a/bundles/binding/org.openhab.binding.fritzboxtr064/src/main/java/org/openhab/binding/fritzboxtr064/internal/Tr064Comm.java
+++ b/bundles/binding/org.openhab.binding.fritzboxtr064/src/main/java/org/openhab/binding/fritzboxtr064/internal/Tr064Comm.java
@@ -224,7 +224,7 @@
         // check if special "soap value parser" handler for extracting SOAP value is defined. If yes, use svp
         if (itemMap.getSoapValueParser() == null) { // extract dataOutName1 as default, no handler used
             NodeList nlDataOutNodes = response.getSOAPPart().getElementsByTagName(itemMap.getReadDataOutName());
-            if (nlDataOutNodes != null & nlDataOutNodes.getLength() > 0) {
+            if (nlDataOutNodes != null && nlDataOutNodes.getLength() > 0) {
                 // extract value from soap response
                 value = nlDataOutNodes.item(0).getTextContent();
             } else {
@@ -734,7 +734,7 @@
                         }
                     } else {
                         NodeList nlDataOutNodes = sm.getSOAPPart().getElementsByTagName(mapping.getReadDataOutName()); // URL
-                        if (nlDataOutNodes != null & nlDataOutNodes.getLength() > 0) {
+                        if (nlDataOutNodes != null && nlDataOutNodes.getLength() > 0) {
                             // extract URL from soap response
                             String url = nlDataOutNodes.item(0).getTextContent();
                             Document xmlTamInfo = getFboxXmlResponse(url);
@@ -799,7 +799,7 @@
                         }
                     } else {
                         NodeList nlDataOutNodes = sm.getSOAPPart().getElementsByTagName(mapping.getReadDataOutName()); // URL
-                        if (nlDataOutNodes != null & nlDataOutNodes.getLength() > 0) {
+                        if (nlDataOutNodes != null && nlDataOutNodes.getLength() > 0) {
                             // extract URL from soap response
                             String url = nlDataOutNodes.item(0).getTextContent();
                             // only get missed calls of the last x days
