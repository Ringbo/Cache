diff --git a/maven-plugins/maven-compiler-plugin/src/main/java/org/apache/maven/plugin/TestCompilerMojo.java b/maven-plugins/maven-compiler-plugin/src/main/java/org/apache/maven/plugin/TestCompilerMojo.java
index 43d9d4b..b3eb090 100644
--- a/maven-plugins/maven-compiler-plugin/src/main/java/org/apache/maven/plugin/TestCompilerMojo.java
+++ b/maven-plugins/maven-compiler-plugin/src/main/java/org/apache/maven/plugin/TestCompilerMojo.java
@@ -149,7 +149,7 @@
             {
                 testIncludes.add( "**/*." + inputFileEnding );
             }
-            scanner = new SimpleSourceInclusionScanner( testExcludes, testExcludes );
+            scanner = new SimpleSourceInclusionScanner( testIncludes, testExcludes );
         }
 
         return scanner;
