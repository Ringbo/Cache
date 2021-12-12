diff --git a/src/java_tools/buildjar/java/com/google/devtools/build/buildjar/javac/plugins/dependency/StrictJavaDepsPlugin.java b/src/java_tools/buildjar/java/com/google/devtools/build/buildjar/javac/plugins/dependency/StrictJavaDepsPlugin.java
index 7b7d9e9..7c6999b 100644
--- a/src/java_tools/buildjar/java/com/google/devtools/build/buildjar/javac/plugins/dependency/StrictJavaDepsPlugin.java
+++ b/src/java_tools/buildjar/java/com/google/devtools/build/buildjar/javac/plugins/dependency/StrictJavaDepsPlugin.java
@@ -402,8 +402,8 @@
       return null;
     }
 
-    // Filter out classes in rt.jar
-    if (platformJars.contains(classfile)) {
+    // Filter out classes on bootclasspath
+    if (platformJars.contains(name)) {
       return null;
     }
 
