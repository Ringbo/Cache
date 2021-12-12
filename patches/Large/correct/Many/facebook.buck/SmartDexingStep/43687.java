diff --git a/src/com/facebook/buck/android/SmartDexingStep.java b/src/com/facebook/buck/android/SmartDexingStep.java
index c72b243..b2bded2 100644
--- a/src/com/facebook/buck/android/SmartDexingStep.java
+++ b/src/com/facebook/buck/android/SmartDexingStep.java
@@ -474,7 +474,8 @@
       steps.add(new RmStep(tempDexJarOutput, true));
       steps.add(new XzStep(repackedJar));
       return new CompositeStep(steps);
-    } else if (outputPath.endsWith(DexStore.JAR.getExtension())) {
+    } else if (outputPath.endsWith(DexStore.JAR.getExtension()) ||
+        outputPath.endsWith("classes.dex")) {
       return new DxStep(outputPath, filesToDex, dxOptions);
     } else {
       throw new IllegalArgumentException(String.format(
