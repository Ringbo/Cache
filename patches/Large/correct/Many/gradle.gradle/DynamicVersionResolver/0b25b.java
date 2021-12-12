diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ivyresolve/DynamicVersionResolver.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ivyresolve/DynamicVersionResolver.java
index 812bea4..b0c7a2f 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ivyresolve/DynamicVersionResolver.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ivyresolve/DynamicVersionResolver.java
@@ -175,7 +175,7 @@
             RepositoryResolveState request = queue.removeFirst();
             try {
                 request.resolve();
-            } catch (Throwable t) {
+            } catch (Exception t) {
                 failures.add(t);
                 if (isCriticalFailure(t)) {
                     queue.clear();
