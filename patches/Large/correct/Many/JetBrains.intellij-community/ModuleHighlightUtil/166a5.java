diff --git a/java/java-analysis-impl/src/com/intellij/codeInsight/daemon/impl/analysis/ModuleHighlightUtil.java b/java/java-analysis-impl/src/com/intellij/codeInsight/daemon/impl/analysis/ModuleHighlightUtil.java
index f1b92e3..1a88b08 100644
--- a/java/java-analysis-impl/src/com/intellij/codeInsight/daemon/impl/analysis/ModuleHighlightUtil.java
+++ b/java/java-analysis-impl/src/com/intellij/codeInsight/daemon/impl/analysis/ModuleHighlightUtil.java
@@ -97,7 +97,7 @@
   static HighlightInfo checkPackageStatement(@NotNull PsiPackageStatement statement, @NotNull PsiFile file) {
     if (PsiUtil.isModuleFile(file)) {
       String message = JavaErrorMessages.message("module.no.package");
-      HighlightInfo info = HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(statement).description(message).create();
+      HighlightInfo info = HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(statement).descriptionAndTooltip(message).create();
       QuickFixAction.registerQuickFixAction(info, factory().createDeleteFix(statement));
       return info;
     }
@@ -109,7 +109,7 @@
   static HighlightInfo checkFileName(@NotNull PsiJavaModule element, @NotNull PsiFile file) {
     if (!MODULE_INFO_FILE.equals(file.getName())) {
       String message = JavaErrorMessages.message("module.file.wrong.name");
-      HighlightInfo info = HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(range(element)).description(message).create();
+      HighlightInfo info = HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(range(element)).descriptionAndTooltip(message).create();
       QuickFixAction.registerQuickFixAction(info, factory().createRenameFileFix(MODULE_INFO_FILE));
       return info;
     }
@@ -125,7 +125,7 @@
       Collection<VirtualFile> others = FilenameIndex.getVirtualFilesByName(project, MODULE_INFO_FILE, module.getModuleScope(false));
       if (others.size() > 1) {
         String message = JavaErrorMessages.message("module.file.duplicate");
-        HighlightInfo info = HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(range(element)).description(message).create();
+        HighlightInfo info = HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(range(element)).descriptionAndTooltip(message).create();
         others.stream().map(f -> PsiManager.getInstance(project).findFile(f)).filter(f -> f != file).findFirst().ifPresent(
           duplicate -> QuickFixAction.registerQuickFixAction(info, new GoToSymbolFix(duplicate, JavaErrorMessages.message("module.open.duplicate.text")))
         );
@@ -176,7 +176,7 @@
       String refText = ref.apply(statement).orElse(null);
       if (refText != null && !filter.add(refText)) {
         String message = JavaErrorMessages.message(key, refText);
-        HighlightInfo info = HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(statement).description(message).create();
+        HighlightInfo info = HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(statement).descriptionAndTooltip(message).create();
         QuickFixAction.registerQuickFixAction(info, factory().createDeleteFix(statement));
         results.add(info);
       }
@@ -199,7 +199,7 @@
           String className = refText(ref), packageName = StringUtil.getPackageName(className);
           if (!exports.contains(packageName) && !uses.contains(className)) {
             String message = JavaErrorMessages.message("module.service.unused");
-            results.add(HighlightInfo.newHighlightInfo(HighlightInfoType.WARNING).range(range(ref)).description(message).create());
+            results.add(HighlightInfo.newHighlightInfo(HighlightInfoType.WARNING).range(range(ref)).descriptionAndTooltip(message).create());
           }
         }
       }
@@ -219,7 +219,7 @@
       VirtualFile root = ProjectFileIndex.SERVICE.getInstance(file.getProject()).getSourceRootForFile(vFile);
       if (root != null && !root.equals(vFile.getParent())) {
         String message = JavaErrorMessages.message("module.file.wrong.location");
-        HighlightInfo info = HighlightInfo.newHighlightInfo(HighlightInfoType.WARNING).range(range(element)).description(message).create();
+        HighlightInfo info = HighlightInfo.newHighlightInfo(HighlightInfoType.WARNING).range(range(element)).descriptionAndTooltip(message).create();
         QuickFixAction.registerQuickFixAction(info, new MoveFileFix(vFile, root, QuickFixBundle.message("move.file.to.source.root.text")));
         return info;
       }
@@ -239,7 +239,7 @@
       }
       else if (target == container) {
         String message = JavaErrorMessages.message("module.cyclic.dependence", container.getName());
-        return HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(refElement).description(message).create();
+        return HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(refElement).descriptionAndTooltip(message).create();
       }
       else {
         Collection<PsiJavaModule> cycle = JavaModuleGraphUtil.findCycle((PsiJavaModule)target);
@@ -247,7 +247,7 @@
           Stream<String> stream = cycle.stream().map(PsiJavaModule::getName);
           if (ApplicationManager.getApplication().isUnitTestMode()) stream = stream.sorted();
           String message = JavaErrorMessages.message("module.cyclic.dependence", stream.collect(Collectors.joining(", ")));
-          return HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(refElement).description(message).create();
+          return HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(refElement).descriptionAndTooltip(message).create();
         }
       }
     }
@@ -262,7 +262,7 @@
         (parent = statement.getParent()) instanceof PsiJavaModule &&
         ((PsiJavaModule)parent).hasModifierProperty(PsiModifier.OPEN)) {
       String message = JavaErrorMessages.message("module.opens.in.weak.module");
-      HighlightInfo info = HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(statement).description(message).create();
+      HighlightInfo info = HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(statement).descriptionAndTooltip(message).create();
       QuickFixAction.registerQuickFixAction(info, factory().createModifierListFix((PsiModifierListOwner)parent, PsiModifier.OPEN, false, false));
       return info;
     }
@@ -282,11 +282,11 @@
       HighlightInfoType type = statement.getRole() == Role.OPENS ? HighlightInfoType.WARNING : HighlightInfoType.ERROR;
       if (directories == null || directories.length == 0) {
         String message = JavaErrorMessages.message("package.not.found", packageName);
-        return HighlightInfo.newHighlightInfo(type).range(refElement).description(message).create();
+        return HighlightInfo.newHighlightInfo(type).range(refElement).descriptionAndTooltip(message).create();
       }
       if (PsiUtil.isPackageEmpty(directories, packageName)) {
         String message = JavaErrorMessages.message("package.is.empty", packageName);
-        return HighlightInfo.newHighlightInfo(type).range(refElement).description(message).create();
+        return HighlightInfo.newHighlightInfo(type).range(refElement).descriptionAndTooltip(message).create();
       }
     }
 
@@ -304,11 +304,11 @@
       assert ref != null : statement;
       if (!targets.add(refText)) {
         String message = JavaErrorMessages.message("module.duplicate.export", refText);
-        results.add(HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(refElement).description(message).create());
+        results.add(HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(refElement).descriptionAndTooltip(message).create());
       }
       else if (ref.multiResolve(true).length == 0) {
         String message = JavaErrorMessages.message("module.not.found", refElement.getReferenceText());
-        results.add(HighlightInfo.newHighlightInfo(HighlightInfoType.WARNING).range(refElement).description(message).create());
+        results.add(HighlightInfo.newHighlightInfo(HighlightInfoType.WARNING).range(refElement).descriptionAndTooltip(message).create());
       }
     }
 
@@ -321,11 +321,11 @@
       PsiElement target = refElement.resolve();
       if (target == null) {
         String message = JavaErrorMessages.message("cannot.resolve.symbol", refElement.getReferenceName());
-        return HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(range(refElement)).description(message).create();
+        return HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(range(refElement)).descriptionAndTooltip(message).create();
       }
       else if (target instanceof PsiClass && ((PsiClass)target).isEnum()) {
         String message = JavaErrorMessages.message("module.service.enum", ((PsiClass)target).getName());
-        return HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(range(refElement)).description(message).create();
+        return HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(range(refElement)).descriptionAndTooltip(message).create();
       }
     }
 
@@ -346,7 +346,7 @@
       String refText = refText(implRef);
       if (!filter.add(refText)) {
         String message = JavaErrorMessages.message("module.duplicate.impl", refText);
-        HighlightInfo info = HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(implRef).description(message).create();
+        HighlightInfo info = HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(implRef).descriptionAndTooltip(message).create();
         QuickFixAction.registerQuickFixAction(info, factory().createDeleteFix(implRef, QuickFixBundle.message("delete.reference.fix.text")));
         results.add(info);
         continue;
@@ -362,15 +362,15 @@
         if (InheritanceUtil.isInheritorOrSelf(implClass, (PsiClass)intTarget, true)) {
           if (implClass.hasModifierProperty(PsiModifier.ABSTRACT)) {
             String message = JavaErrorMessages.message("module.service.abstract", implClass.getName());
-            results.add(HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(range(implRef)).description(message).create());
+            results.add(HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(range(implRef)).descriptionAndTooltip(message).create());
           }
           else if (!(ClassUtil.isTopLevelClass(implClass) || implClass.hasModifierProperty(PsiModifier.STATIC))) {
             String message = JavaErrorMessages.message("module.service.inner", implClass.getName());
-            results.add(HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(range(implRef)).description(message).create());
+            results.add(HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(range(implRef)).descriptionAndTooltip(message).create());
           }
           else if (!PsiUtil.hasDefaultConstructor(implClass)) {
             String message = JavaErrorMessages.message("module.service.no.ctor", implClass.getName());
-            results.add(HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(range(implRef)).description(message).create());
+            results.add(HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(range(implRef)).descriptionAndTooltip(message).create());
           }
         }
         else if ((provider = findProvider(implClass)) != null) {
@@ -378,12 +378,12 @@
           PsiClass typeClass = type instanceof PsiClassType ? ((PsiClassType)type).resolve() : null;
           if (!InheritanceUtil.isInheritorOrSelf(typeClass, (PsiClass)intTarget, true)) {
             String message = JavaErrorMessages.message("module.service.provider.type", implClass.getName());
-            results.add(HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(range(implRef)).description(message).create());
+            results.add(HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(range(implRef)).descriptionAndTooltip(message).create());
           }
         }
         else {
           String message = JavaErrorMessages.message("module.service.impl");
-          results.add(HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(range(implRef)).description(message).create());
+          results.add(HighlightInfo.newHighlightInfo(HighlightInfoType.ERROR).range(range(implRef)).descriptionAndTooltip(message).create());
         }
       }
     }
@@ -433,19 +433,19 @@
     if (!refModule.equals(targetModule)) {
       if (targetModule == null) {
         String message = JavaErrorMessages.message("module.package.on.classpath");
-        return HighlightInfo.newHighlightInfo(HighlightInfoType.WRONG_REF).range(ref).description(message).create();
+        return HighlightInfo.newHighlightInfo(HighlightInfoType.WRONG_REF).range(ref).descriptionAndTooltip(message).create();
       }
 
       String refModuleName = refModule.getName();
       String requiredName = targetModule.getName();
       if (!(targetModule instanceof LightJavaModule || JavaModuleGraphUtil.exports(targetModule, packageName, refModule))) {
         String message = JavaErrorMessages.message("module.package.not.exported", requiredName, packageName, refModuleName);
-        return HighlightInfo.newHighlightInfo(HighlightInfoType.WRONG_REF).range(ref).description(message).create();
+        return HighlightInfo.newHighlightInfo(HighlightInfoType.WRONG_REF).range(ref).descriptionAndTooltip(message).create();
       }
 
       if (!(PsiJavaModule.JAVA_BASE.equals(requiredName) || JavaModuleGraphUtil.reads(refModule, targetModule))) {
         String message = JavaErrorMessages.message("module.not.in.requirements", refModuleName, requiredName);
-        HighlightInfo info = HighlightInfo.newHighlightInfo(HighlightInfoType.WRONG_REF).range(ref).description(message).create();
+        HighlightInfo info = HighlightInfo.newHighlightInfo(HighlightInfoType.WRONG_REF).range(ref).descriptionAndTooltip(message).create();
         QuickFixAction.registerQuickFixAction(info, new AddRequiredModuleFix(refModule, requiredName));
         return info;
       }
@@ -464,15 +464,15 @@
   private static HighlightInfo moduleResolveError(PsiJavaModuleReferenceElement refElement, PsiPolyVariantReference ref) {
     if (ref.multiResolve(true).length == 0) {
       String message = JavaErrorMessages.message("module.not.found", refElement.getReferenceText());
-      return HighlightInfo.newHighlightInfo(HighlightInfoType.WRONG_REF).range(refElement).description(message).create();
+      return HighlightInfo.newHighlightInfo(HighlightInfoType.WRONG_REF).range(refElement).descriptionAndTooltip(message).create();
     }
     else if (ref.multiResolve(false).length > 1) {
       String message = JavaErrorMessages.message("module.ambiguous", refElement.getReferenceText());
-      return HighlightInfo.newHighlightInfo(HighlightInfoType.WARNING).range(refElement).description(message).create();
+      return HighlightInfo.newHighlightInfo(HighlightInfoType.WARNING).range(refElement).descriptionAndTooltip(message).create();
     }
     else {
       String message = JavaErrorMessages.message("module.not.on.path", refElement.getReferenceText());
-      HighlightInfo info = HighlightInfo.newHighlightInfo(HighlightInfoType.WRONG_REF).range(refElement).description(message).create();
+      HighlightInfo info = HighlightInfo.newHighlightInfo(HighlightInfoType.WRONG_REF).range(refElement).descriptionAndTooltip(message).create();
       factory().registerOrderEntryFixes(new QuickFixActionRegistrarImpl(info), ref);
       return info;
     }
