diff --git a/check_api/src/main/java/com/google/errorprone/BaseErrorProneJavaCompiler.java b/check_api/src/main/java/com/google/errorprone/BaseErrorProneJavaCompiler.java
index 774f1ef..8d3d3ed 100644
--- a/check_api/src/main/java/com/google/errorprone/BaseErrorProneJavaCompiler.java
+++ b/check_api/src/main/java/com/google/errorprone/BaseErrorProneJavaCompiler.java
@@ -204,11 +204,11 @@
             .customRefactorer()
             .or(
                 () -> {
-                  ScannerSupplier toUse = scannerSupplier;
+                  ScannerSupplier toUse = ErrorPronePlugins.loadPlugins(scannerSupplier, context);
                   Set<String> namedCheckers = epOptions.patchingOptions().namedCheckers();
                   if (!namedCheckers.isEmpty()) {
                     toUse =
-                        scannerSupplier.filter(bci -> namedCheckers.contains(bci.canonicalName()));
+                        toUse.filter(bci -> namedCheckers.contains(bci.canonicalName()));
                   }
                   return ErrorProneScannerTransformer.create(toUse.applyOverrides(epOptions).get());
                 })
