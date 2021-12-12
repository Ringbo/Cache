diff --git a/src/fitnesse/junit/JUnitHelper.java b/src/fitnesse/junit/JUnitHelper.java
index bb2207e..22f4daf 100644
--- a/src/fitnesse/junit/JUnitHelper.java
+++ b/src/fitnesse/junit/JUnitHelper.java
@@ -72,7 +72,7 @@
   }
 
   public void assertPasses(String pageName, String pageType, String suiteFilter, String excludeSuiteFilter) throws Exception {
-    FitNesseContext context = FitNesseSuite.initContext(new File(ContextConfigurator.DEFAULT_CONFIG_FILE), fitNesseRootPath, ContextConfigurator.DEFAULT_ROOT, port);
+    FitNesseContext context = FitNesseRunner.initContext(new File(ContextConfigurator.DEFAULT_CONFIG_FILE), fitNesseRootPath, ContextConfigurator.DEFAULT_ROOT, port);
 
     JavaFormatter testFormatter = new JavaFormatter(pageName);
     testFormatter.setResultsRepository(new JavaFormatter.FolderResultsRepository(outputDir));
