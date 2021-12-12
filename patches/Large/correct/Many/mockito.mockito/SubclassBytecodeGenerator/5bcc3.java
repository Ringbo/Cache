diff --git a/src/main/java/org/mockito/internal/creation/bytebuddy/SubclassBytecodeGenerator.java b/src/main/java/org/mockito/internal/creation/bytebuddy/SubclassBytecodeGenerator.java
index 6a1a2ee..8531e23 100644
--- a/src/main/java/org/mockito/internal/creation/bytebuddy/SubclassBytecodeGenerator.java
+++ b/src/main/java/org/mockito/internal/creation/bytebuddy/SubclassBytecodeGenerator.java
@@ -142,7 +142,7 @@
         } else {
             loadModuleProble(features.mockedType, Mockito.class, true, !loader.isDisrespectingOpenness(), false);
             for (Class<?> iFace : features.interfaces) {
-                loadModuleProble(iFace, features.mockedType, true, false, false);
+                loadModuleProble(iFace, features.mockedType, false, false, true);
             }
         }
         DynamicType.Builder<T> builder =
