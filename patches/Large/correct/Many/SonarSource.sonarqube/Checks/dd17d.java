diff --git a/sonar-plugin-api/src/main/java/org/sonar/api/batch/rule/Checks.java b/sonar-plugin-api/src/main/java/org/sonar/api/batch/rule/Checks.java
index 7f02163..c223f41 100644
--- a/sonar-plugin-api/src/main/java/org/sonar/api/batch/rule/Checks.java
+++ b/sonar-plugin-api/src/main/java/org/sonar/api/batch/rule/Checks.java
@@ -154,7 +154,7 @@
     return StringUtils.defaultIfEmpty(key, clazz.getCanonicalName());
   }
 
-  private Object instantiate(ActiveRule activeRule, Object checkClassOrInstance) {
+  private static Object instantiate(ActiveRule activeRule, Object checkClassOrInstance) {
     try {
       Object check = checkClassOrInstance;
       if (check instanceof Class) {
