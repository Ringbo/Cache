diff --git a/subprojects/plugins/src/main/groovy/org/gradle/api/internal/jvm/DefaultClassDirectoryBinarySpec.java b/subprojects/plugins/src/main/groovy/org/gradle/api/internal/jvm/DefaultClassDirectoryBinarySpec.java
index 86684e5..ef4cf8d 100644
--- a/subprojects/plugins/src/main/groovy/org/gradle/api/internal/jvm/DefaultClassDirectoryBinarySpec.java
+++ b/subprojects/plugins/src/main/groovy/org/gradle/api/internal/jvm/DefaultClassDirectoryBinarySpec.java
@@ -45,7 +45,7 @@
     private boolean buildable = true;
 
     public DefaultClassDirectoryBinarySpec(String projectPath, String name, SourceSet sourceSet, JavaToolChain toolChain, JavaPlatform platform, Instantiator instantiator, ITaskFactory taskFactory) {
-        super(new DefaultComponentSpecIdentifier(projectPath, name), DefaultClassDirectoryBinarySpec.class);
+        super(new DefaultComponentSpecIdentifier(projectPath, name), ClassDirectoryBinarySpec.class);
         this.sourceSet = sourceSet;
         this.toolChain = toolChain;
         this.platform = platform;
