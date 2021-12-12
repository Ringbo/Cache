diff --git a/rt/core/src/main/java/org/apache/cxf/bus/spring/SpringBeanLocator.java b/rt/core/src/main/java/org/apache/cxf/bus/spring/SpringBeanLocator.java
index f02ad9f..4a9bef9 100644
--- a/rt/core/src/main/java/org/apache/cxf/bus/spring/SpringBeanLocator.java
+++ b/rt/core/src/main/java/org/apache/cxf/bus/spring/SpringBeanLocator.java
@@ -102,7 +102,7 @@
         Object answer = null;
         ApplicationContext aContext = applicationContext;
         // try to find out the bundleContext by going through the parent context
-        while (aContext != null && answer != null) {
+        while (aContext != null && answer == null) {
             answer = getBundleContext(aContext, b);
             aContext = aContext.getParent();
         }
