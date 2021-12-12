diff --git a/atlas-gradle-plugin/atlas-plugin/src/main/java/com/taobao/android/builder/tasks/awo/utils/AwoInstaller.java b/atlas-gradle-plugin/atlas-plugin/src/main/java/com/taobao/android/builder/tasks/awo/utils/AwoInstaller.java
index f7ee2b7..26b4f17 100644
--- a/atlas-gradle-plugin/atlas-plugin/src/main/java/com/taobao/android/builder/tasks/awo/utils/AwoInstaller.java
+++ b/atlas-gradle-plugin/atlas-plugin/src/main/java/com/taobao/android/builder/tasks/awo/utils/AwoInstaller.java
@@ -406,7 +406,8 @@
         //        List<String> startCmd = Arrays.asList("shell", "am", "start", packageNameForPatch + "/" +
         // launcherActivityForPatch);
         List<String> patchCmd = Arrays.asList("shell", "am", "broadcast", "-a", "com.taobao.atlas.intent.PATCH_APP",
-                                              "-e", "pkg", patchPkg);
+                                              "-e", "pkg", patchPkg, "-n",
+                                              patchPkg + "/com.taobao.atlas.update.AwoPatchReceiver");
         try {
             executor.executeCommand(androidBuilder.getSdkInfo().getAdb().getAbsolutePath(), patchCmd, false);
         } catch (Exception e) {
