diff --git a/subprojects/core/src/main/groovy/org/gradle/process/internal/child/WorkerProcessClassPathProvider.java b/subprojects/core/src/main/groovy/org/gradle/process/internal/child/WorkerProcessClassPathProvider.java
index 273d21d..2069fa9 100644
--- a/subprojects/core/src/main/groovy/org/gradle/process/internal/child/WorkerProcessClassPathProvider.java
+++ b/subprojects/core/src/main/groovy/org/gradle/process/internal/child/WorkerProcessClassPathProvider.java
@@ -36,7 +36,7 @@
 
     public WorkerProcessClassPathProvider(CacheRepository cacheRepository) {
         this.cacheRepository = cacheRepository;
-        add("WORKER_PROCESS", toPatterns("gradle-core", "slf4j-api", "logback-classic", "logback-core", "jul-to-slf4j"));
+        add("WORKER_PROCESS", toPatterns("gradle-core", "gradle-cli", "slf4j-api", "logback-classic", "logback-core", "jul-to-slf4j"));
     }
 
     public Set<File> findClassPath(String name) {
