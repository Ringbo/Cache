diff --git a/core/camel-core/src/main/java/org/apache/camel/reifier/dataformat/TidyMarkupDataFormatReifier.java b/core/camel-core/src/main/java/org/apache/camel/reifier/dataformat/TidyMarkupDataFormatReifier.java
index c805e95..a6a67ea 100644
--- a/core/camel-core/src/main/java/org/apache/camel/reifier/dataformat/TidyMarkupDataFormatReifier.java
+++ b/core/camel-core/src/main/java/org/apache/camel/reifier/dataformat/TidyMarkupDataFormatReifier.java
@@ -38,7 +38,7 @@
             }
         }
 
-        return super.createDataFormat(camelContext);
+        return super.doCreateDataFormat(camelContext);
     }
 
     @Override
