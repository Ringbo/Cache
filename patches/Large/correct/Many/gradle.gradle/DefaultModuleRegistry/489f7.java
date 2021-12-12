diff --git a/subprojects/core/src/main/java/org/gradle/api/internal/classpath/DefaultModuleRegistry.java b/subprojects/core/src/main/java/org/gradle/api/internal/classpath/DefaultModuleRegistry.java
index c3c6e30..bcd55e3 100644
--- a/subprojects/core/src/main/java/org/gradle/api/internal/classpath/DefaultModuleRegistry.java
+++ b/subprojects/core/src/main/java/org/gradle/api/internal/classpath/DefaultModuleRegistry.java
@@ -222,7 +222,7 @@
                 zipFile.close();
             }
         } catch (IOException e) {
-            throw new UncheckedIOException(e);
+            throw new UncheckedIOException(String.format("Could not load properties for module '%s' from %s", name, jarFile), e);
         }
     }
 
