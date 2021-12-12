diff --git a/plugins/coverage/src/com/intellij/coverage/PackageAnnotator.java b/plugins/coverage/src/com/intellij/coverage/PackageAnnotator.java
index 29b4d87..54bef0b 100644
--- a/plugins/coverage/src/com/intellij/coverage/PackageAnnotator.java
+++ b/plugins/coverage/src/com/intellij/coverage/PackageAnnotator.java
@@ -301,7 +301,7 @@
 
     if (content == null) return false;
     ClassReader reader = new ClassReader(content, 0, content.length);
-    final CoverageSuiteImpl coverageSuite = (CoverageSuiteImpl)CoverageDataManager.getInstance(myProject).getCurrentSuite();
+    final JavaCoverageSuite coverageSuite = (JavaCoverageSuite)CoverageDataManager.getInstance(myProject).getCurrentSuite();
     if (coverageSuite == null) return false;
     SourceLineCounter counter = new SourceLineCounter(new EmptyVisitor(), classData, coverageSuite.getRunner() instanceof IDEACoverageRunner && coverageSuite.isTracingEnabled());
     reader.accept(counter, 0);
