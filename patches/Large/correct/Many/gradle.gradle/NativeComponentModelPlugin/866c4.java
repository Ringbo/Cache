diff --git a/subprojects/platform-native/src/main/groovy/org/gradle/nativeplatform/plugins/NativeComponentModelPlugin.java b/subprojects/platform-native/src/main/groovy/org/gradle/nativeplatform/plugins/NativeComponentModelPlugin.java
index 15cbc48..ea3e86f 100644
--- a/subprojects/platform-native/src/main/groovy/org/gradle/nativeplatform/plugins/NativeComponentModelPlugin.java
+++ b/subprojects/platform-native/src/main/groovy/org/gradle/nativeplatform/plugins/NativeComponentModelPlugin.java
@@ -280,7 +280,7 @@
             tasks.create(taskName, LinkSharedLibrary.class, new Action<LinkSharedLibrary>() {
                 @Override
                 public void execute(LinkSharedLibrary linkTask) {
-                    linkTask.setDescription("Links " + binary.getName());
+                    linkTask.setDescription("Links " + binary.getDisplayName());
                     linkTask.setToolChain(binary.getToolChain());
                     linkTask.setTargetPlatform(binary.getTargetPlatform());
                     linkTask.setOutputFile(binary.getSharedLibraryFile());
@@ -303,7 +303,7 @@
             tasks.create(taskName, CreateStaticLibrary.class, new Action<CreateStaticLibrary>() {
                 @Override
                 public void execute(CreateStaticLibrary task) {
-                    task.setDescription("Creates " + binary.getName());
+                    task.setDescription("Creates " + binary.getDisplayName());
                     task.setToolChain(binary.getToolChain());
                     task.setTargetPlatform(binary.getTargetPlatform());
                     task.setOutputFile(binary.getStaticLibraryFile());
@@ -327,7 +327,7 @@
             tasks.create(taskName, LinkExecutable.class, new Action<LinkExecutable>() {
                 @Override
                 public void execute(LinkExecutable linkTask) {
-                    linkTask.setDescription("Links " + binary.getName());
+                    linkTask.setDescription("Links " + binary.getDisplayName());
                     linkTask.setToolChain(binary.getToolChain());
                     linkTask.setTargetPlatform(binary.getTargetPlatform());
                     linkTask.setOutputFile(executableFile);
@@ -364,7 +364,7 @@
             return tasks.create(namingScheme.getTaskName("install"), InstallExecutable.class, new Action<InstallExecutable>() {
                 @Override
                 public void execute(InstallExecutable installTask) {
-                    installTask.setDescription("Installs a development image of " + namingScheme.getBaseName());
+                    installTask.setDescription("Installs a development image of " + binary.getDisplayName());
                     installTask.setGroup(LifecycleBasePlugin.BUILD_GROUP);
                     installTask.setToolChain(executable.getToolChain());
                     installTask.setExecutable(executable.getFile());
