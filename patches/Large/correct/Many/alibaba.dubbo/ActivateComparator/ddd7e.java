diff --git a/dubbo-common/src/main/java/org/apache/dubbo/common/extension/support/ActivateComparator.java b/dubbo-common/src/main/java/org/apache/dubbo/common/extension/support/ActivateComparator.java
index 5dcedc3..1114804 100644
--- a/dubbo-common/src/main/java/org/apache/dubbo/common/extension/support/ActivateComparator.java
+++ b/dubbo-common/src/main/java/org/apache/dubbo/common/extension/support/ActivateComparator.java
@@ -82,7 +82,7 @@
     }
 
     private Class<?> findSpi(Class clazz) {
-        if (clazz.getInterfaces().length <= 0) {
+        if (clazz.getInterfaces().length == 0) {
             return null;
         }
 
