diff --git a/src/com/google/javascript/jscomp/AbstractCommandLineRunner.java b/src/com/google/javascript/jscomp/AbstractCommandLineRunner.java
index 4022df2..5ca1f57 100644
--- a/src/com/google/javascript/jscomp/AbstractCommandLineRunner.java
+++ b/src/com/google/javascript/jscomp/AbstractCommandLineRunner.java
@@ -1178,7 +1178,7 @@
           compiler.stage2Passes();
       }
       compiler.completeCompilation();
-    } catch (Exception e) {
+    } catch (IOException e) {
       compiler.report(JSError.make(COULD_NOT_DESERIALIZE_AST, filename));
     } finally {
       // Make sure we generate a report of errors and warnings even if the compiler throws an
