diff --git a/camel-core/src/main/java/org/apache/camel/model/dataformat/DataFormatType.java b/camel-core/src/main/java/org/apache/camel/model/dataformat/DataFormatType.java
index fc32570..2e87587 100644
--- a/camel-core/src/main/java/org/apache/camel/model/dataformat/DataFormatType.java
+++ b/camel-core/src/main/java/org/apache/camel/model/dataformat/DataFormatType.java
@@ -71,7 +71,7 @@
                     type = routeContext.getDataFormat(ref);
                 }
                 if (type != null) {
-                    dataFormat = type.createDataFormat(routeContext);
+                    dataFormat = type.getDataFormat(routeContext);
                 }
             }
 
