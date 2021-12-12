diff --git a/Dart/src/com/jetbrains/lang/dart/ide/findUsages/DartUnitMemberGroupRuleProvider.java b/Dart/src/com/jetbrains/lang/dart/ide/findUsages/DartUnitMemberGroupRuleProvider.java
index 9eddeb7..e8d01c4 100644
--- a/Dart/src/com/jetbrains/lang/dart/ide/findUsages/DartUnitMemberGroupRuleProvider.java
+++ b/Dart/src/com/jetbrains/lang/dart/ide/findUsages/DartUnitMemberGroupRuleProvider.java
@@ -22,6 +22,6 @@
 public class DartUnitMemberGroupRuleProvider implements FileStructureGroupRuleProvider {
   @Override
   public UsageGroupingRule getUsageGroupingRule(Project project) {
-    return new DartUnitMemberGroupingRule();
+    return new DartUnitMemberUsageGroupingRule();
   }
 }
