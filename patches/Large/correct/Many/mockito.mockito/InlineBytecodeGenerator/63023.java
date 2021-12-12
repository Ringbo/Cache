diff --git a/src/main/java/org/mockito/internal/creation/bytebuddy/InlineBytecodeGenerator.java b/src/main/java/org/mockito/internal/creation/bytebuddy/InlineBytecodeGenerator.java
index 44afd0d..1301d3e 100644
--- a/src/main/java/org/mockito/internal/creation/bytebuddy/InlineBytecodeGenerator.java
+++ b/src/main/java/org/mockito/internal/creation/bytebuddy/InlineBytecodeGenerator.java
@@ -208,7 +208,7 @@
                 }
             }
             for (Object module : modules) {
-                REDEFINE_MODULE.invoke(module, Collections.singleton(target),
+                REDEFINE_MODULE.invoke(instrumentation, module, Collections.singleton(target),
                     Collections.emptyMap(), Collections.emptyMap(), Collections.emptySet(), Collections.emptyMap());
             }
         } catch (Exception e) {
