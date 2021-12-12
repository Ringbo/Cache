diff --git a/subprojects/core/src/main/groovy/org/gradle/internal/filewatch/DefaultFileWatcherFactory.java b/subprojects/core/src/main/groovy/org/gradle/internal/filewatch/DefaultFileWatcherFactory.java
index df76470..52f47cb 100644
--- a/subprojects/core/src/main/groovy/org/gradle/internal/filewatch/DefaultFileWatcherFactory.java
+++ b/subprojects/core/src/main/groovy/org/gradle/internal/filewatch/DefaultFileWatcherFactory.java
@@ -64,7 +64,7 @@
                 clazz = classLoader.loadClass("org.gradle.internal.filewatch.jdk7.Jdk7FileWatcherFactory");
                 return Cast.uncheckedCast(DirectInstantiator.instantiate(clazz, executor));
             } catch (ClassNotFoundException e) {
-                LOG.error("Could not load JDK7 class with a JDK7+ JVM, falling back to no-op implementation.", e);
+                LOG.error("Could not load JDK7 class with a JDK7+ JVM, falling back to no-op implementation.");
             }
         }
         LOG.debug("Using no-op file watcher service.");
