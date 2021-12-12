diff --git a/subprojects/core/src/main/groovy/org/gradle/api/artifacts/result/UnresolvedDependencyResult.java b/subprojects/core/src/main/groovy/org/gradle/api/artifacts/result/UnresolvedDependencyResult.java
index c63e670..63e6b87 100644
--- a/subprojects/core/src/main/groovy/org/gradle/api/artifacts/result/UnresolvedDependencyResult.java
+++ b/subprojects/core/src/main/groovy/org/gradle/api/artifacts/result/UnresolvedDependencyResult.java
@@ -37,5 +37,5 @@
     /**
      * The failure that occurred.
      */
-    Exception getFailure();
+    Throwable getFailure();
 }
