diff --git a/dubbo-common/src/main/java/org/apache/dubbo/common/URL.java b/dubbo-common/src/main/java/org/apache/dubbo/common/URL.java
index cee9c86..63cee6f 100644
--- a/dubbo-common/src/main/java/org/apache/dubbo/common/URL.java
+++ b/dubbo-common/src/main/java/org/apache/dubbo/common/URL.java
@@ -727,7 +727,7 @@
         String methodKey = method + "." + key;
         Number n = getNumbers().get(methodKey);
         if (n != null) {
-            return n.intValue();
+            return n.doubleValue();
         }
         String value = getMethodParameter(method, key);
         if (StringUtils.isEmpty(value)) {
@@ -742,7 +742,7 @@
         String methodKey = method + "." + key;
         Number n = getNumbers().get(methodKey);
         if (n != null) {
-            return n.intValue();
+            return n.floatValue();
         }
         String value = getMethodParameter(method, key);
         if (StringUtils.isEmpty(value)) {
@@ -757,7 +757,7 @@
         String methodKey = method + "." + key;
         Number n = getNumbers().get(methodKey);
         if (n != null) {
-            return n.intValue();
+            return n.longValue();
         }
         String value = getMethodParameter(method, key);
         if (StringUtils.isEmpty(value)) {
