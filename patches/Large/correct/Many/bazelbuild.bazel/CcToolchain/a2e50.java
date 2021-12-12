diff --git a/src/main/java/com/google/devtools/build/lib/rules/cpp/CcToolchain.java b/src/main/java/com/google/devtools/build/lib/rules/cpp/CcToolchain.java
index 5ff1698..ca9cf8c 100644
--- a/src/main/java/com/google/devtools/build/lib/rules/cpp/CcToolchain.java
+++ b/src/main/java/com/google/devtools/build/lib/rules/cpp/CcToolchain.java
@@ -345,8 +345,11 @@
    * be overridden by subclasses of CcToolchain.
    *
    * @param ruleContext the rule context
+   * @throws RuleErrorException if there are configuration errors making it impossible to resolve
+   *     certain build variables of this toolchain
    */
-  protected Map<String, String> getBuildVariables(RuleContext ruleContext) {
+  protected Map<String, String> getBuildVariables(RuleContext ruleContext)
+      throws RuleErrorException {
     return ImmutableMap.<String, String>of();
   }
 
