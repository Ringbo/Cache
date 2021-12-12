diff --git a/platform/lang-impl/src/com/intellij/ide/projectView/impl/FileNestingBuilder.java b/platform/lang-impl/src/com/intellij/ide/projectView/impl/FileNestingBuilder.java
index 3a9c3f5..e0b41fb 100644
--- a/platform/lang-impl/src/com/intellij/ide/projectView/impl/FileNestingBuilder.java
+++ b/platform/lang-impl/src/com/intellij/ide/projectView/impl/FileNestingBuilder.java
@@ -34,7 +34,7 @@
    * Returns all possible nesting rules, including transitive rules
    */
   @NotNull
-  public Collection<ProjectViewFileNestingService.NestingRule> getNestingRules() {
+  public synchronized Collection<ProjectViewFileNestingService.NestingRule> getNestingRules() {
     final ProjectViewFileNestingService fileNestingService = ProjectViewFileNestingService.getInstance();
     final List<ProjectViewFileNestingService.NestingRule> baseRules = fileNestingService.getRules();
     final long modCount = fileNestingService.getModificationCount();
