diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/internal/utils/CheckUtil.java b/src/test/java/com/puppycrawl/tools/checkstyle/internal/utils/CheckUtil.java
index be08981..ce0e81d 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/internal/utils/CheckUtil.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/internal/utils/CheckUtil.java
@@ -139,7 +139,7 @@
                 .getContextClassLoader();
         final String packageName = "com.puppycrawl.tools.checkstyle";
         return getCheckstyleModulesRecursive(packageName, loader).stream()
-                .filter(ModuleReflectionUtils::isCheckstyleCheck)
+                .filter(ModuleReflectionUtils::isCheckstyleTreeWalkerCheck)
                 .collect(Collectors.toSet());
     }
 
