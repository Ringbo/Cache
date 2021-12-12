diff --git a/src/tools/benchmark/java/com/google/devtools/build/benchmark/codegenerator/JavaCodeGeneratorHelper.java b/src/tools/benchmark/java/com/google/devtools/build/benchmark/codegenerator/JavaCodeGeneratorHelper.java
index 82a0c48..b90b480 100644
--- a/src/tools/benchmark/java/com/google/devtools/build/benchmark/codegenerator/JavaCodeGeneratorHelper.java
+++ b/src/tools/benchmark/java/com/google/devtools/build/benchmark/codegenerator/JavaCodeGeneratorHelper.java
@@ -141,7 +141,8 @@
                     "    srcs = glob([ 'com/example/deps%d/*.java' ]),",
                     "%s",
                     "    visibility = [ '//visibility:public' ],",
-                    ")"),
+                    ")",
+                    ""),
             index,
             index,
             deps);
@@ -162,7 +163,8 @@
                     "    srcs = glob([ 'com/example/generated/*.java' ]),",
                     "    main_class = 'com.example.generated.Main',",
                     "%s",
-                    ")"),
+                    ")",
+                    ""),
             targetName,
             deps);
 
