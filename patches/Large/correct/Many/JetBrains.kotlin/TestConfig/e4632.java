diff --git a/js/js.tests/test/org/jetbrains/k2js/test/config/TestConfig.java b/js/js.tests/test/org/jetbrains/k2js/test/config/TestConfig.java
index efc0425..e5e7c66 100644
--- a/js/js.tests/test/org/jetbrains/k2js/test/config/TestConfig.java
+++ b/js/js.tests/test/org/jetbrains/k2js/test/config/TestConfig.java
@@ -63,7 +63,7 @@
                 libFiles.add(file);
             } catch (FileNotFoundException e) {
                 //TODO: throw generic expception
-                throw new AssertionError("Lib files not found.");
+                throw new IllegalStateException(e);
             }
 
         }
