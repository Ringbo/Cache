diff --git a/sonar-plugin-api/src/main/java/org/sonar/api/rules/AnnotationRuleParser.java b/sonar-plugin-api/src/main/java/org/sonar/api/rules/AnnotationRuleParser.java
index fd0df62..187f835 100644
--- a/sonar-plugin-api/src/main/java/org/sonar/api/rules/AnnotationRuleParser.java
+++ b/sonar-plugin-api/src/main/java/org/sonar/api/rules/AnnotationRuleParser.java
@@ -55,7 +55,7 @@
     return rules;
   }
 
-  private Rule create(String repositoryKey, Class annotatedClass) {
+  private static Rule create(String repositoryKey, Class annotatedClass) {
     org.sonar.check.Rule ruleAnnotation = AnnotationUtils.getAnnotation(annotatedClass, org.sonar.check.Rule.class);
     if (ruleAnnotation != null) {
       return toRule(repositoryKey, annotatedClass, ruleAnnotation);
