diff --git a/build-common/src/org/jetbrains/kotlin/compilerRunner/ArgumentUtils.java b/build-common/src/org/jetbrains/kotlin/compilerRunner/ArgumentUtils.java
index 835c4c0..727bcf9 100644
--- a/build-common/src/org/jetbrains/kotlin/compilerRunner/ArgumentUtils.java
+++ b/build-common/src/org/jetbrains/kotlin/compilerRunner/ArgumentUtils.java
@@ -61,7 +61,7 @@
                 continue;
             }
 
-            if (Objects.equals(value, defaultValue)) continue;
+            if (value == null || Objects.equals(value, defaultValue)) continue;
 
             Class<?> fieldType = field.getType();
 
