diff --git a/core/camel-core/src/main/java/org/apache/camel/reifier/dataformat/JacksonXMLDataFormatReifier.java b/core/camel-core/src/main/java/org/apache/camel/reifier/dataformat/JacksonXMLDataFormatReifier.java
index 29a7e97..cf2ace3 100644
--- a/core/camel-core/src/main/java/org/apache/camel/reifier/dataformat/JacksonXMLDataFormatReifier.java
+++ b/core/camel-core/src/main/java/org/apache/camel/reifier/dataformat/JacksonXMLDataFormatReifier.java
@@ -45,7 +45,7 @@
             }
         }
 
-        return super.createDataFormat(camelContext);
+        return super.doCreateDataFormat(camelContext);
     }
 
     @Override
