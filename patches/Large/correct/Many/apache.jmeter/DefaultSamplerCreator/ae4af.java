diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/proxy/DefaultSamplerCreator.java b/src/protocol/http/org/apache/jmeter/protocol/http/proxy/DefaultSamplerCreator.java
index 88876d9..8d3c712 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/proxy/DefaultSamplerCreator.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/proxy/DefaultSamplerCreator.java
@@ -225,7 +225,7 @@
                     new ErrorDetectionHandler();
             xmlReader.setContentHandler(detectionHandler);
             xmlReader.parse(new InputSource(new StringReader(postData)));
-            return detectionHandler.isErrorDetected();
+            return !detectionHandler.isErrorDetected();
         } catch (ParserConfigurationException e) {
             return false;
         } catch (SAXException e) {
