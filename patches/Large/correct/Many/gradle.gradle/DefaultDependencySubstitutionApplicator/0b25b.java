diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/dependencysubstitution/DefaultDependencySubstitutionApplicator.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/dependencysubstitution/DefaultDependencySubstitutionApplicator.java
index f888a4e..ae434b3 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/dependencysubstitution/DefaultDependencySubstitutionApplicator.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/dependencysubstitution/DefaultDependencySubstitutionApplicator.java
@@ -32,7 +32,7 @@
         DependencySubstitutionInternal details = new DefaultDependencySubstitution(dependency.getSelector(), dependency.getReason());
         try {
             rule.execute(details);
-        } catch (Throwable e) {
+        } catch (Exception e) {
             return SubstitutionResult.failed(e);
         }
         return SubstitutionResult.of(details);
