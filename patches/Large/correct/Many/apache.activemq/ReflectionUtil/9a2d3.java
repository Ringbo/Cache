diff --git a/activemq-tooling/activemq-perf-maven-plugin/src/main/java/org/apache/activemq/tool/properties/ReflectionUtil.java b/activemq-tooling/activemq-perf-maven-plugin/src/main/java/org/apache/activemq/tool/properties/ReflectionUtil.java
index e20c49d..8e8413c 100644
--- a/activemq-tooling/activemq-perf-maven-plugin/src/main/java/org/apache/activemq/tool/properties/ReflectionUtil.java
+++ b/activemq-tooling/activemq-perf-maven-plugin/src/main/java/org/apache/activemq/tool/properties/ReflectionUtil.java
@@ -213,8 +213,7 @@
                     } else {
                         try {
                             Object val = getterMethods[i].invoke(targetObject, null);
-//                            if (val != null && val != targetObject) {
-                            if (val != null ) {
+                            if (val != null && val != targetObject) {
                                 props.putAll(retrieveClassProperties(propertyName + ".", val.getClass(), val));
                             }
                         } catch (InvocationTargetException e) {
