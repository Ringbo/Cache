diff --git a/subprojects/platform-jvm/src/main/java/org/gradle/jvm/internal/JarBinaryRules.java b/subprojects/platform-jvm/src/main/java/org/gradle/jvm/internal/JarBinaryRules.java
index 1206fc6..605b917 100644
--- a/subprojects/platform-jvm/src/main/java/org/gradle/jvm/internal/JarBinaryRules.java
+++ b/subprojects/platform-jvm/src/main/java/org/gradle/jvm/internal/JarBinaryRules.java
@@ -31,7 +31,7 @@
     void configureJarBinaries(final ComponentSpec jvmLibrary, BuildDirHolder buildDirHolder, final JavaToolChainRegistry toolChains) {
         final File binariesDir = new File(buildDirHolder.getDir(), "jars");
         final File classesDir = new File(buildDirHolder.getDir(), "classes");
-        jvmLibrary.getBinaries().withType(JarBinarySpecInternal.class).beforeEach(new Action<JarBinarySpec>() {
+        jvmLibrary.getBinaries().withType(JarBinarySpecInternal.class).beforeEach(new Action<JarBinarySpecInternal>() {
             @Override
             public void execute(JarBinarySpecInternal jarBinary) {
                 String jarBinaryName = jarBinary.getProjectScopedName();
