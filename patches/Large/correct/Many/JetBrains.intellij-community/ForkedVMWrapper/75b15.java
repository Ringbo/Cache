diff --git a/plugins/junit_rt/src/com/intellij/rt/execution/junit/ForkedVMWrapper.java b/plugins/junit_rt/src/com/intellij/rt/execution/junit/ForkedVMWrapper.java
index 9110c06..66ea013 100644
--- a/plugins/junit_rt/src/com/intellij/rt/execution/junit/ForkedVMWrapper.java
+++ b/plugins/junit_rt/src/com/intellij/rt/execution/junit/ForkedVMWrapper.java
@@ -76,7 +76,7 @@
       boolean afterDelimiter = false;
       while (stream.available() > 0) {
         char read = (char)stream.read();
-        if (read == '/') {
+        if (!afterSymbol && read == '/') {
           afterSymbol = true;
           continue;
         }
