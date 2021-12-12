diff --git a/src/com/facebook/buck/rules/CachingBuildRuleBuilder.java b/src/com/facebook/buck/rules/CachingBuildRuleBuilder.java
index 0ae368c..c5481f4 100644
--- a/src/com/facebook/buck/rules/CachingBuildRuleBuilder.java
+++ b/src/com/facebook/buck/rules/CachingBuildRuleBuilder.java
@@ -465,7 +465,7 @@
     buildResult =
         Futures.catchingAsync(
             buildResult,
-            Exception.class,
+            Throwable.class,
             thrown -> {
               LOG.debug(thrown, "Building rule [%s] failed.", rule.getBuildTarget());
 
@@ -1052,7 +1052,7 @@
         new BuildRuleDiagnosticData(ruleDeps.get(rule), diagnosticKeysBuilder.build()));
   }
 
-  private Exception maybeAttachBuildRuleNameToException(@Nonnull Exception thrown) {
+  private Throwable maybeAttachBuildRuleNameToException(@Nonnull Throwable thrown) {
     if ((thrown instanceof HumanReadableException) || (thrown instanceof InterruptedException)) {
       return thrown;
     }
