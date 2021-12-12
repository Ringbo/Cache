diff --git a/camel-core/src/main/java/org/apache/camel/impl/DefaultUnitOfWork.java b/camel-core/src/main/java/org/apache/camel/impl/DefaultUnitOfWork.java
index 984e9a5..122d78b 100644
--- a/camel-core/src/main/java/org/apache/camel/impl/DefaultUnitOfWork.java
+++ b/camel-core/src/main/java/org/apache/camel/impl/DefaultUnitOfWork.java
@@ -107,7 +107,7 @@
     }
 
     public synchronized ProcessorType getLastInterceptedNode() {
-        if (routeList == null) {
+        if (routeList == null || routeList.isEmpty()) {
             return null;
         }
         return routeList.get(routeList.size() - 1);
