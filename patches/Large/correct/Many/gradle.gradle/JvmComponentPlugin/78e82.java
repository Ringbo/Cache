diff --git a/subprojects/platform-jvm/src/main/java/org/gradle/jvm/plugins/JvmComponentPlugin.java b/subprojects/platform-jvm/src/main/java/org/gradle/jvm/plugins/JvmComponentPlugin.java
index e28f814..ca76aee 100644
--- a/subprojects/platform-jvm/src/main/java/org/gradle/jvm/plugins/JvmComponentPlugin.java
+++ b/subprojects/platform-jvm/src/main/java/org/gradle/jvm/plugins/JvmComponentPlugin.java
@@ -145,7 +145,7 @@
         }
 
         @BinaryTasks
-        public void createTasks(ModelMap<Task> tasks, final JarBinarySpec binary, final @Path("buildDir") File buildDir) {
+        public void createTasks(ModelMap<Task> tasks, final JarBinarySpecInternal binary, final @Path("buildDir") File buildDir) {
            final File runtimeClassesDir = binary.getClassesDir();
             final File runtimeJarDestDir = binary.getJarFile().getParentFile();
             final String runtimeJarArchiveName = binary.getJarFile().getName();
