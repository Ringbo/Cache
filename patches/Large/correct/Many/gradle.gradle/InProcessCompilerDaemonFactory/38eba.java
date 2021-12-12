diff --git a/subprojects/language-jvm/src/main/java/org/gradle/api/internal/tasks/compile/daemon/InProcessCompilerDaemonFactory.java b/subprojects/language-jvm/src/main/java/org/gradle/api/internal/tasks/compile/daemon/InProcessCompilerDaemonFactory.java
index a478fc5..3b393c2 100644
--- a/subprojects/language-jvm/src/main/java/org/gradle/api/internal/tasks/compile/daemon/InProcessCompilerDaemonFactory.java
+++ b/subprojects/language-jvm/src/main/java/org/gradle/api/internal/tasks/compile/daemon/InProcessCompilerDaemonFactory.java
@@ -59,13 +59,13 @@
                 for (String packageName : forkOptions.getSharedPackages()) {
                     filteredGroovySpec.allowPackage(packageName);
                 }
-                FilteringClassLoader filteredGroovy = classLoaderFactory.createFilteringClassLoader(groovyClassLoader, filteredGroovySpec);
+                ClassLoader filteredGroovy = classLoaderFactory.createFilteringClassLoader(groovyClassLoader, filteredGroovySpec);
 
                 FilteringClassLoader.Spec loggingSpec = new FilteringClassLoader.Spec();
                 loggingSpec.allowPackage("org.slf4j");
                 loggingSpec.allowClass(Logger.class);
                 loggingSpec.allowClass(LogLevel.class);
-                FilteringClassLoader loggingClassLoader = classLoaderFactory.createFilteringClassLoader(compiler.getClass().getClassLoader(), loggingSpec);
+                ClassLoader loggingClassLoader = classLoaderFactory.createFilteringClassLoader(compiler.getClass().getClassLoader(), loggingSpec);
 
                 ClassLoader groovyAndLoggingClassLoader = new CachingClassLoader(new MultiParentClassLoader(loggingClassLoader, filteredGroovy));
 
