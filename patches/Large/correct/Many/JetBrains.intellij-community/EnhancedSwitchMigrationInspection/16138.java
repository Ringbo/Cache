diff --git a/java/java-impl/src/com/intellij/codeInspection/EnhancedSwitchMigrationInspection.java b/java/java-impl/src/com/intellij/codeInspection/EnhancedSwitchMigrationInspection.java
index 3ffa298..a715557 100644
--- a/java/java-impl/src/com/intellij/codeInspection/EnhancedSwitchMigrationInspection.java
+++ b/java/java-impl/src/com/intellij/codeInspection/EnhancedSwitchMigrationInspection.java
@@ -20,7 +20,7 @@
 public class EnhancedSwitchMigrationInspection extends AbstractBaseJavaLocalInspectionTool {
   private final static SwitchConversion[] ourInspections = new SwitchConversion[]{
     EnhancedSwitchMigrationInspection::inspectReturningSwitch,
-    EnhancedSwitchMigrationInspection::inspectVariableAssiginigSwitch,
+    EnhancedSwitchMigrationInspection::inspectVariableAssigningSwitch,
     EnhancedSwitchMigrationInspection::inspectReplacementWithStatement
   };
 
@@ -395,7 +395,7 @@
    * }
    */
   @Nullable
-  public static SwitchReplacer inspectVariableAssiginigSwitch(@NotNull PsiStatement statement,
+  public static SwitchReplacer inspectVariableAssigningSwitch(@NotNull PsiStatement statement,
                                                       @NotNull PsiExpression expressionBeingSwitched,
                                                       @NotNull List<? extends OldSwitchStatementBranch> branches,
                                                       boolean isExhaustive) {
