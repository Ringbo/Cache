diff --git a/subprojects/jacoco/src/main/java/org/gradle/internal/jacoco/AntJacocoCheck.java b/subprojects/jacoco/src/main/java/org/gradle/internal/jacoco/AntJacocoCheck.java
index d5690a9..e9340e4 100644
--- a/subprojects/jacoco/src/main/java/org/gradle/internal/jacoco/AntJacocoCheck.java
+++ b/subprojects/jacoco/src/main/java/org/gradle/internal/jacoco/AntJacocoCheck.java
@@ -47,7 +47,7 @@
     @Override
     protected void configureReport(final GroovyObjectSupport antBuilder, final JacocoViolationRulesContainer violationRules) {
         if (!violationRules.getRules().isEmpty()) {
-            Map<String, Object> checkArgs = ImmutableMap.<String, Object>of("failonviolation", !violationRules.isFailOnViolation());
+            Map<String, Object> checkArgs = ImmutableMap.<String, Object>of("failonviolation", violationRules.isFailOnViolation());
             antBuilder.invokeMethod("check", new Object[] {checkArgs, new Closure<Object>(this, this) {
                 @SuppressWarnings("UnusedDeclaration")
                 public Object doCall(Object ignore) {
