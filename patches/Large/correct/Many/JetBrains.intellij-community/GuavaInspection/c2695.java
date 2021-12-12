diff --git a/java/typeMigration/src/com/intellij/refactoring/typeMigration/inspections/GuavaInspection.java b/java/typeMigration/src/com/intellij/refactoring/typeMigration/inspections/GuavaInspection.java
index dee2204..61156e6 100644
--- a/java/typeMigration/src/com/intellij/refactoring/typeMigration/inspections/GuavaInspection.java
+++ b/java/typeMigration/src/com/intellij/refactoring/typeMigration/inspections/GuavaInspection.java
@@ -280,7 +280,7 @@
     };
   }
 
-  public class MigrateGuavaTypeFix extends LocalQuickFixAndIntentionActionOnPsiElement implements BatchQuickFix<ProblemDescriptor> {
+  public class MigrateGuavaTypeFix extends LocalQuickFixAndIntentionActionOnPsiElement implements BatchQuickFix<CommonProblemDescriptor> {
     private final PsiType myTargetType;
 
     private MigrateGuavaTypeFix(@NotNull PsiElement element, PsiType targetType) {
@@ -333,13 +333,13 @@
 
     @Override
     public void applyFix(@NotNull final Project project,
-                         @NotNull ProblemDescriptor[] descriptors,
+                         @NotNull CommonProblemDescriptor[] descriptors,
                          @NotNull List<PsiElement> psiElementsToIgnore,
                          @Nullable Runnable refreshViews) {
       final List<PsiElement> elementsToFix = new ArrayList<PsiElement>();
       final List<PsiType> migrationTypes = new ArrayList<PsiType>();
 
-      for (ProblemDescriptor descriptor : descriptors) {
+      for (CommonProblemDescriptor descriptor : descriptors) {
         final MigrateGuavaTypeFix fix = getFix(descriptor);
         elementsToFix.add(fix.getStartElement());
         migrationTypes.add(fix.myTargetType);
@@ -348,7 +348,7 @@
       if (!elementsToFix.isEmpty()) performTypeMigration(elementsToFix, migrationTypes);
     }
 
-    private MigrateGuavaTypeFix getFix(ProblemDescriptor descriptor) {
+    private MigrateGuavaTypeFix getFix(CommonProblemDescriptor descriptor) {
       final QuickFix[] fixes = descriptor.getFixes();
       LOG.assertTrue(fixes != null);
       for (QuickFix fix : fixes) {
