diff --git a/compiler/impl/com/intellij/compiler/ant/BuildPropertiesImpl.java b/compiler/impl/com/intellij/compiler/ant/BuildPropertiesImpl.java
index 6be0edf..3c5f03c 100644
--- a/compiler/impl/com/intellij/compiler/ant/BuildPropertiesImpl.java
+++ b/compiler/impl/com/intellij/compiler/ant/BuildPropertiesImpl.java
@@ -100,7 +100,7 @@
       add(new Comment(CompilerBundle.message("generated.ant.build.jdk.definitions.comment")), 1);
 
       for (final ProjectJdk jdk : jdks) {
-        if (jdk.getHomeDirectory() == null) {
+        if (jdk.getHomeDirectory() == null || jdk.getBinPath() == null) {
           continue;
         }
         final File home = VfsUtil.virtualToIoFile(jdk.getHomeDirectory());
