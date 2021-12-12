diff --git a/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/compile/daemon/DaemonGroovyCompiler.java b/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/compile/daemon/DaemonGroovyCompiler.java
index 626f3a1..f7bc91a 100644
--- a/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/compile/daemon/DaemonGroovyCompiler.java
+++ b/subprojects/plugins/src/main/groovy/org/gradle/api/internal/tasks/compile/daemon/DaemonGroovyCompiler.java
@@ -67,7 +67,7 @@
         // is compatible with Gradle's current Ant version.
         Collection<File> antFiles = project.getServices().get(ClassPathRegistry.class).getClassPath("ANT").getAsFiles();
         Iterable<File> groovyFiles = Iterables.concat(spec.getGroovyClasspath(), antFiles);
-        List<String> groovyPackages = Arrays.asList("groovy", "org.codehaus.groovy", "groovyjarjarantlr", "groovyjarjarasm", "groovyjarjarcommonscli", "org.apache.tools.ant");
+        List<String> groovyPackages = Arrays.asList("groovy", "org.codehaus.groovy", "groovyjarjarantlr", "groovyjarjarasm", "groovyjarjarcommonscli", "org.apache.tools.ant", "com.sun.tools.javac");
         return new DaemonForkOptions(options.getMemoryInitialSize(), options.getMemoryMaximumSize(),
                 Collections.<String>emptyList(), groovyFiles, groovyPackages);
     }
