diff --git a/jps/jps-builders/src/org/jetbrains/jps/incremental/ChainedTargetsBuildListener.java b/jps/jps-builders/src/org/jetbrains/jps/incremental/ChainedTargetsBuildListener.java
index 489dc21..2759a2e 100644
--- a/jps/jps-builders/src/org/jetbrains/jps/incremental/ChainedTargetsBuildListener.java
+++ b/jps/jps-builders/src/org/jetbrains/jps/incremental/ChainedTargetsBuildListener.java
@@ -44,7 +44,7 @@
     for (Pair<String, String> pair : paths) {
       String relativePath = pair.getSecond();
       File file = relativePath.equals(".") ? new File(pair.getFirst()) : new File(pair.getFirst(), relativePath);
-      Collection<BuildRootDescriptor> descriptors = rootsIndex.findAllParentDescriptors(file, null, myContext);
+      Collection<BuildRootDescriptor> descriptors = rootsIndex.findAllParentDescriptors(file, myContext);
       for (BuildRootDescriptor descriptor : descriptors) {
         try {
           fsState.markDirty(myContext, file, descriptor, myContext.getProjectDescriptor().timestamps.getStorage(), false);
@@ -63,7 +63,7 @@
       File file = new File(FileUtil.toSystemDependentName(path));
       Collection<BuildRootDescriptor> descriptors = rootsIndex.findAllParentDescriptors(file, null, myContext);
       for (BuildRootDescriptor descriptor : descriptors) {
-        state.registerDeleted(descriptor.getTarget(), file);
+        state.registerDeleted(myContext, descriptor.getTarget(), file);
       }
     }
   }
