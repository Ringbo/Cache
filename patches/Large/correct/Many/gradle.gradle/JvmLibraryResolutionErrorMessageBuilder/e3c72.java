diff --git a/subprojects/platform-jvm/src/main/java/org/gradle/api/internal/resolve/JvmLibraryResolutionErrorMessageBuilder.java b/subprojects/platform-jvm/src/main/java/org/gradle/api/internal/resolve/JvmLibraryResolutionErrorMessageBuilder.java
index d335e8c..6d2d464 100644
--- a/subprojects/platform-jvm/src/main/java/org/gradle/api/internal/resolve/JvmLibraryResolutionErrorMessageBuilder.java
+++ b/subprojects/platform-jvm/src/main/java/org/gradle/api/internal/resolve/JvmLibraryResolutionErrorMessageBuilder.java
@@ -94,7 +94,7 @@
                             if (moreThanOneBinary) {
                                 return String.format("'%s' on %s", targetPlatform.getName(), input.getDisplayName());
                             }
-                            return String.format("'%s'", targetPlatform.getName(), input.getDisplayName());
+                            return String.format("'%s'", targetPlatform.getName());
                         }
                         return null;
                     }
