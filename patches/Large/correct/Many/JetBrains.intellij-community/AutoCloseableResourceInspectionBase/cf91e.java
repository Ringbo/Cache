diff --git a/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/com/siyeh/ig/resources/AutoCloseableResourceInspectionBase.java b/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/com/siyeh/ig/resources/AutoCloseableResourceInspectionBase.java
index 949d599..8ad8dcb 100644
--- a/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/com/siyeh/ig/resources/AutoCloseableResourceInspectionBase.java
+++ b/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/com/siyeh/ig/resources/AutoCloseableResourceInspectionBase.java
@@ -119,7 +119,8 @@
       }
       if (MethodCallUtils.isCallToMethod(expression, "java.util.Formatter", null, "format", null) ||
           MethodCallUtils.isCallToMethod(expression, "java.io.Writer", null, "append", null) ||
-          MethodCallUtils.isCallToMethod(expression, "com.google.common.base.Preconditions", null, "checkNotNull", null)) {
+          MethodCallUtils.isCallToMethod(expression, "com.google.common.base.Preconditions", null, "checkNotNull", null) ||
+          MethodCallUtils.isCallToMethod(expression, "org.hibernate.Session", null, "close")) {
         return;
       }
       if (!isNotSafelyClosedResource(expression)) {
