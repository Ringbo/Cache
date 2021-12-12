diff --git a/java/java-tests/testSrc/com/intellij/ide/util/frameworkSupport/FrameworkSupportProviderTestCase.java b/java/java-tests/testSrc/com/intellij/ide/util/frameworkSupport/FrameworkSupportProviderTestCase.java
index e90a8cd..78fcc4d 100644
--- a/java/java-tests/testSrc/com/intellij/ide/util/frameworkSupport/FrameworkSupportProviderTestCase.java
+++ b/java/java-tests/testSrc/com/intellij/ide/util/frameworkSupport/FrameworkSupportProviderTestCase.java
@@ -38,7 +38,7 @@
     super.setUp();
     final Project project = getProject();
     myFrameworkSupportModel = new FrameworkSupportModelImpl(project, "", LibrariesContainerFactory.createContainer(project));
-    myNodes = new HashMap<FrameworkType, FrameworkSupportNode>();
+    myNodes = new LinkedHashMap<FrameworkType, FrameworkSupportNode>();
     final List<FrameworkSupportInModuleProvider> providers = FrameworkSupportUtil.getAllProviders();
     Collections.sort(providers, FrameworkSupportUtil.getFrameworkSupportProvidersComparator(providers));
     for (FrameworkSupportInModuleProvider provider : providers) {
