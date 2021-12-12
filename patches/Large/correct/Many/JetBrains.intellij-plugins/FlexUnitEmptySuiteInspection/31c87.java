diff --git a/flex/src/com/intellij/lang/javascript/flex/flexunit/inspections/FlexUnitEmptySuiteInspection.java b/flex/src/com/intellij/lang/javascript/flex/flexunit/inspections/FlexUnitEmptySuiteInspection.java
index 6810dd0..82eb384 100644
--- a/flex/src/com/intellij/lang/javascript/flex/flexunit/inspections/FlexUnitEmptySuiteInspection.java
+++ b/flex/src/com/intellij/lang/javascript/flex/flexunit/inspections/FlexUnitEmptySuiteInspection.java
@@ -24,7 +24,7 @@
 
 
   protected void visitSuite(JSClass aClass, @NotNull ProblemsHolder holder, FlexUnitSupport support) {
-    if (support.isFlexUnit1SuiteSubclass(aClass) || support.isFlexUnit1SuiteSubclass(aClass)) return;
+    if (support.isFlexUnit1SuiteSubclass(aClass) || support.isFlexUnit1Subclass(aClass)) return;
     if (FlexUnitSupport.SUITE_RUNNER.equals(FlexUnitSupport.getCustomRunner(aClass)) && support.getSuiteTestClasses(aClass).isEmpty()) {
       final ASTNode nameIdentifier = aClass.findNameIdentifier();
       if (nameIdentifier != null) {
