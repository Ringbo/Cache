diff --git a/rt/management/src/main/java/org/apache/cxf/management/interceptor/AbstractMessageResponseTimeInterceptor.java b/rt/management/src/main/java/org/apache/cxf/management/interceptor/AbstractMessageResponseTimeInterceptor.java
index 71dffb0..92f9dc4 100644
--- a/rt/management/src/main/java/org/apache/cxf/management/interceptor/AbstractMessageResponseTimeInterceptor.java
+++ b/rt/management/src/main/java/org/apache/cxf/management/interceptor/AbstractMessageResponseTimeInterceptor.java
@@ -171,7 +171,7 @@
                 operationName = "\"" + escapePatternChars(nameProperty.toString()) + "\"";
             }
         }
-        StringBuffer buffer = new StringBuffer(sericeCounterName.toString());
+        StringBuilder buffer = new StringBuilder(sericeCounterName.toString());
         if (operationName != null) {
             buffer.append("," + ManagementConstants.OPERATION_NAME_PROP + "=" + operationName);
         }
