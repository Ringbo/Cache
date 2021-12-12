diff --git a/refactoring/impl/com/intellij/refactoring/safeDelete/SafeDeleteProcessor.java b/refactoring/impl/com/intellij/refactoring/safeDelete/SafeDeleteProcessor.java
index c610b0f..bf40450 100644
--- a/refactoring/impl/com/intellij/refactoring/safeDelete/SafeDeleteProcessor.java
+++ b/refactoring/impl/com/intellij/refactoring/safeDelete/SafeDeleteProcessor.java
@@ -98,7 +98,7 @@
 
   @NotNull
   protected UsageInfo[] findUsages() {
-    ArrayList<UsageInfo> usages = new ArrayList<UsageInfo>();
+    List<UsageInfo> usages = Collections.synchronizedList(new ArrayList<UsageInfo>());
     for (PsiElement element : myElements) {
       if (element instanceof PsiClass) {
         findClassUsages((PsiClass) element, usages);
@@ -127,7 +127,7 @@
     return UsageViewUtil.removeDuplicatedUsages(result);
   }
 
-  private void findParameterUsages(final PsiParameter parameter, final ArrayList<UsageInfo> usages) {
+  private void findParameterUsages(final PsiParameter parameter, final List<UsageInfo> usages) {
     final PsiMethod method = (PsiMethod)parameter.getDeclarationScope();
     final int index = method.getParameterList().getParameterIndex(parameter);
     //search for refs to current method only, do not search for refs to overriding methods, they'll be searched separately
@@ -183,7 +183,7 @@
     addNonCodeUsages(parameter, usages, myInsideDeletedElements);
   }
 
-  private void findFileUsages(final PsiFile file, final ArrayList<UsageInfo> usages) {
+  private void findFileUsages(final PsiFile file, final List<UsageInfo> usages) {
     findGenericElementUsages(file, usages);
     List<Property> declarations = Collections.emptyList();
     if (file instanceof PropertiesFile) {
@@ -195,7 +195,7 @@
     }
   }
 
-  private void findGenericElementUsages(final PsiElement element, final ArrayList<UsageInfo> usages) {
+  private void findGenericElementUsages(final PsiElement element, final List<UsageInfo> usages) {
     ReferencesSearch.search(element).forEach(new Processor<PsiReference>() {
       public boolean process(final PsiReference reference) {
         final PsiElement refElement = reference.getElement();
@@ -464,7 +464,7 @@
     return myCachedCommandName;
   }
 
-  private void findClassUsages(final PsiClass psiClass, final ArrayList<UsageInfo> usages) {
+  private void findClassUsages(final PsiClass psiClass, final List<UsageInfo> usages) {
     final boolean justPrivates = containsOnlyPrivates(psiClass);
 
     ReferencesSearch.search(psiClass).forEach(new Processor<PsiReference>() {
@@ -515,7 +515,7 @@
     return true;
   }
 
-  private void findMethodUsages(PsiMethod psiMethod, ArrayList<UsageInfo> usages) {
+  private void findMethodUsages(PsiMethod psiMethod, List<UsageInfo> usages) {
     PsiManager manager = psiMethod.getManager();
     final PsiSearchHelper searchHelper = manager.getSearchHelper();
     final Collection<PsiReference> references = ReferencesSearch.search(psiMethod).findAll();
@@ -576,7 +576,7 @@
     return list.toArray(new PsiMethod[list.size()]);
   }
 
-  private void findConstructorUsages(PsiMethod constructor, Collection<PsiReference> originalReferences, ArrayList<UsageInfo> usages) {
+  private void findConstructorUsages(PsiMethod constructor, Collection<PsiReference> originalReferences, List<UsageInfo> usages) {
     HashMap<PsiMethod, Collection<PsiReference>> constructorsToRefs = new HashMap<PsiMethod, Collection<PsiReference>>();
     HashSet<PsiMethod> newConstructors = new HashSet<PsiMethod>();
     if (isTheOnlyEmptyDefaultConstructor(constructor)) return;
@@ -621,7 +621,7 @@
   }
 
   private Set<PsiMethod> validateOverridingMethods(PsiMethod originalMethod, final Collection<PsiReference> originalReferences,
-                                                   Collection<PsiMethod> overridingMethods, HashMap<PsiMethod, Collection<PsiReference>> methodToReferences, ArrayList<UsageInfo> usages) {
+                                                   Collection<PsiMethod> overridingMethods, HashMap<PsiMethod, Collection<PsiReference>> methodToReferences, List<UsageInfo> usages) {
     Set<PsiMethod> validOverriding = new LinkedHashSet<PsiMethod>(overridingMethods);
     boolean anyNewBadRefs;
     do {
@@ -721,7 +721,7 @@
     return true;
   }
 
-  private void findFieldUsages(final PsiField psiField, final ArrayList<UsageInfo> usages) {
+  private void findFieldUsages(final PsiField psiField, final List<UsageInfo> usages) {
     ReferencesSearch.search(psiField).forEach(new Processor<PsiReference>() {
       public boolean process(final PsiReference reference) {
         if (!myInsideDeletedElements.isInsideDeleted(reference.getElement())) {
@@ -755,7 +755,7 @@
     }
   };
 
-  private void addNonCodeUsages(final PsiElement element, ArrayList<UsageInfo> usages, final UsageInsideDeleted insideElements) {
+  private void addNonCodeUsages(final PsiElement element, List<UsageInfo> usages, final UsageInsideDeleted insideElements) {
     RefactoringUtil.UsageInfoFactory nonCodeUsageFactory = new RefactoringUtil.UsageInfoFactory() {
       public UsageInfo createUsageInfo(@NotNull PsiElement usage, int startOffset, int endOffset) {
         if (!insideElements.isInsideDeleted(usage)) {
