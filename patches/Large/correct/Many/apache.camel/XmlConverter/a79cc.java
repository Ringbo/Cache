diff --git a/core/camel-base/src/main/java/org/apache/camel/converter/jaxp/XmlConverter.java b/core/camel-base/src/main/java/org/apache/camel/converter/jaxp/XmlConverter.java
index 2278ac0..ef2baef 100644
--- a/core/camel-base/src/main/java/org/apache/camel/converter/jaxp/XmlConverter.java
+++ b/core/camel-base/src/main/java/org/apache/camel/converter/jaxp/XmlConverter.java
@@ -512,7 +512,7 @@
                 xmlReader = xmlReaderPool.createXMLReader();
             }
         } catch (Exception ex) {
-            LOG.warn("Cannot create the SAXParser XMLReader, due to {}", ex);
+            LOG.warn("Cannot create the SAXParser XMLReader, due to {}", ex.getMessage(), ex);
         }
         return new SAXSource(xmlReader, inputSource);
     }
