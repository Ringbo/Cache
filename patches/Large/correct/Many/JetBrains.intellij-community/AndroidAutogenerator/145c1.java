diff --git a/plugins/android/src/org/jetbrains/android/compiler/AndroidAutogenerator.java b/plugins/android/src/org/jetbrains/android/compiler/AndroidAutogenerator.java
index 248fd15..fd9268d 100644
--- a/plugins/android/src/org/jetbrains/android/compiler/AndroidAutogenerator.java
+++ b/plugins/android/src/org/jetbrains/android/compiler/AndroidAutogenerator.java
@@ -396,7 +396,7 @@
                   f.delete(module.getProject());
                 }
                 catch (IOException e) {
-                  LOG.error(e);
+                  LOG.debug(e);
                 }
               }
             }
