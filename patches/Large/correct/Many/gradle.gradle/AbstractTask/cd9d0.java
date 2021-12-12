diff --git a/subprojects/core/src/main/groovy/org/gradle/api/internal/AbstractTask.java b/subprojects/core/src/main/groovy/org/gradle/api/internal/AbstractTask.java
index d6e2c67..f480a26 100644
--- a/subprojects/core/src/main/groovy/org/gradle/api/internal/AbstractTask.java
+++ b/subprojects/core/src/main/groovy/org/gradle/api/internal/AbstractTask.java
@@ -395,7 +395,7 @@
     }
 
     public Task configure(Closure closure) {
-        return ConfigureUtil.configure(closure, this);
+        return ConfigureUtil.configure(closure, this, false);
     }
 
     public File getTemporaryDir() {
