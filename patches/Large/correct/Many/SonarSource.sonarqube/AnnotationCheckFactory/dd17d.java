diff --git a/sonar-plugin-api/src/main/java/org/sonar/api/checks/AnnotationCheckFactory.java b/sonar-plugin-api/src/main/java/org/sonar/api/checks/AnnotationCheckFactory.java
index be86b62..397965b 100644
--- a/sonar-plugin-api/src/main/java/org/sonar/api/checks/AnnotationCheckFactory.java
+++ b/sonar-plugin-api/src/main/java/org/sonar/api/checks/AnnotationCheckFactory.java
@@ -74,7 +74,7 @@
     return null;
   }
 
-  private Object instantiate(ActiveRule activeRule, Object checkClassOrInstance) {
+  private static Object instantiate(ActiveRule activeRule, Object checkClassOrInstance) {
     try {
       Object check = checkClassOrInstance;
       if (check instanceof Class) {
