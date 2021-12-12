diff --git a/src/main/java/com/google/devtools/build/lib/rules/cpp/CcCommon.java b/src/main/java/com/google/devtools/build/lib/rules/cpp/CcCommon.java
index ae66d2b..b4ded0e 100644
--- a/src/main/java/com/google/devtools/build/lib/rules/cpp/CcCommon.java
+++ b/src/main/java/com/google/devtools/build/lib/rules/cpp/CcCommon.java
@@ -463,7 +463,10 @@
         CppFileTypes.LINKER_SCRIPT);
   }
 
-  InstrumentedFilesProvider getInstrumentedFilesProvider(Iterable<Artifact> files,
+  /**
+   * Provides support for instrumentation.
+   */
+  public InstrumentedFilesProvider getInstrumentedFilesProvider(Iterable<Artifact> files,
       boolean withBaselineCoverage) {
     return cppConfiguration.isLipoContextCollector()
         ? InstrumentedFilesProviderImpl.EMPTY
