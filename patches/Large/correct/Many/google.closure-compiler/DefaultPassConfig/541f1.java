diff --git a/src/com/google/javascript/jscomp/DefaultPassConfig.java b/src/com/google/javascript/jscomp/DefaultPassConfig.java
index dcbb6cb..940934b 100644
--- a/src/com/google/javascript/jscomp/DefaultPassConfig.java
+++ b/src/com/google/javascript/jscomp/DefaultPassConfig.java
@@ -383,12 +383,13 @@
       checks.add(dartSuperAccessorsPass);
     }
 
-    if (options.needsTranspilationFrom(ES7)) {
+    if (options.needsTranspilationFrom(ES8)) {
       TranspilationPasses.addEs2017Passes(checks);
       checks.add(setFeatureSet(ES7));
     }
 
-    if (options.needsTranspilationFrom(ES6) && !options.skipTranspilationAndCrash) {
+    if ((options.needsTranspilationFrom(ES6) || options.needsTranspilationFrom(ES7))
+        && !options.skipTranspilationAndCrash) {
       checks.add(es6ExternsCheck);
       TranspilationPasses.addEs6EarlyPasses(checks);
     }
