diff --git a/core-common/src/main/java/org/glassfish/jersey/internal/Errors.java b/core-common/src/main/java/org/glassfish/jersey/internal/Errors.java
index 6e4be4b..92e0fb5 100644
--- a/core-common/src/main/java/org/glassfish/jersey/internal/Errors.java
+++ b/core-common/src/main/java/org/glassfish/jersey/internal/Errors.java
@@ -178,7 +178,7 @@
                         warnings.append(LocalizationMessages.WARNING_MSG(error.getMessage())).append('\n');
                         break;
                     case HINT:
-                        warnings.append(LocalizationMessages.HINT_MSG(error.getMessage())).append('\n');
+                        hints.append(LocalizationMessages.HINT_MSG(error.getMessage())).append('\n');
                         break;
                 }
             }
