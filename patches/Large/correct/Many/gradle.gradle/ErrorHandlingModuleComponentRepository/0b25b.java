diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ivyresolve/ErrorHandlingModuleComponentRepository.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ivyresolve/ErrorHandlingModuleComponentRepository.java
index 54cdf23..07d50f3 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ivyresolve/ErrorHandlingModuleComponentRepository.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ivyresolve/ErrorHandlingModuleComponentRepository.java
@@ -240,7 +240,7 @@
                         }
                         return;
                     }
-                } catch (Throwable throwable) {
+                } catch (Exception throwable) {
                     unexpectedFailure = throwable;
                     failure = onError.transform(throwable);
                 }
