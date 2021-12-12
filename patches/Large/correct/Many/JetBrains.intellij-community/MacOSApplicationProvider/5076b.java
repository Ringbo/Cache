diff --git a/platform-impl/src/com/intellij/ide/MacOSApplicationProvider.java b/platform-impl/src/com/intellij/ide/MacOSApplicationProvider.java
index 4836c22..bcbc132 100644
--- a/platform-impl/src/com/intellij/ide/MacOSApplicationProvider.java
+++ b/platform-impl/src/com/intellij/ide/MacOSApplicationProvider.java
@@ -59,7 +59,7 @@
           }
 
           ConfigurableGroup[] group = new ConfigurableGroup[]{
-            new ProjectConfigurablesGroup(project),
+            new ProjectConfigurablesGroup(project, false),
             new IdeConfigurablesGroup()
           };
 
