diff --git a/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/mvnsettings/DefaultLocalMavenRepositoryLocator.java b/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/mvnsettings/DefaultLocalMavenRepositoryLocator.java
index 537d59e..6c57b88 100644
--- a/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/mvnsettings/DefaultLocalMavenRepositoryLocator.java
+++ b/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/mvnsettings/DefaultLocalMavenRepositoryLocator.java
@@ -59,7 +59,7 @@
             String placeholder = matcher.group(1);
             String replacement = placeholder.startsWith("env.") ? environmentVariables.get(placeholder.substring(4)) : systemProperties.get(placeholder);
             if (replacement == null) {
-                throw new CannotLocateLocalMavenRepositoryException(String.format("Cannot resolve placeholder '%s' in value '%s'", placeholder, replacement));
+                throw new CannotLocateLocalMavenRepositoryException(String.format("Cannot resolve placeholder '%s' in value '%s'", placeholder, value));
             }
             matcher.appendReplacement(result, Matcher.quoteReplacement(replacement));
         }
