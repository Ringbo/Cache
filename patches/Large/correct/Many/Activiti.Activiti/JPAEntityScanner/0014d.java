diff --git a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/variable/JPAEntityScanner.java b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/variable/JPAEntityScanner.java
index 5fbbb87..f3e9bf7 100644
--- a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/variable/JPAEntityScanner.java
+++ b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/variable/JPAEntityScanner.java
@@ -70,7 +70,7 @@
     Id idAnnotation = null;
     for (Method method : methods) {
       idAnnotation = method.getAnnotation(Id.class);
-      if (idAnnotation != null) {
+      if(idAnnotation != null && !method.isBridge()) {
         idMethod = method;
         break;
       }
