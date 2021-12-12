diff --git a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/variable/JPAEntityScanner.java b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/variable/JPAEntityScanner.java
index 8268ae2..0eb674c 100644
--- a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/variable/JPAEntityScanner.java
+++ b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/variable/JPAEntityScanner.java
@@ -71,7 +71,7 @@
     Id idAnnotation = null;
     for(Method method : methods) {
       idAnnotation = method.getAnnotation(Id.class);
-      if(idAnnotation != null) {
+      if(idAnnotation != null && !method.isBridge()) {
         idMethod = method;
         break;
       }
