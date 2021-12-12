diff --git a/core/descriptors/src/org/jetbrains/kotlin/builtins/KotlinBuiltIns.java b/core/descriptors/src/org/jetbrains/kotlin/builtins/KotlinBuiltIns.java
index 61a4020..d5026b1 100644
--- a/core/descriptors/src/org/jetbrains/kotlin/builtins/KotlinBuiltIns.java
+++ b/core/descriptors/src/org/jetbrains/kotlin/builtins/KotlinBuiltIns.java
@@ -58,11 +58,12 @@
     private static synchronized void initialize() {
         if (instance == null) {
             if (initializationFailed != null) {
-                throw new RuntimeException(
-                        "builtin library initialization failed previously: " + initializationFailed, initializationFailed);
+                throw new IllegalStateException(
+                        "Built-in library initialization failed previously: " + initializationFailed, initializationFailed
+                );
             }
             if (initializing) {
-                throw new IllegalStateException("builtin library initialization loop");
+                throw new IllegalStateException("Built-in library initialization loop");
             }
             initializing = true;
             try {
@@ -71,7 +72,8 @@
             }
             catch (Throwable e) {
                 initializationFailed = e;
-                throw new RuntimeException("builtin library initialization failed: " + e, e);
+                throw new IllegalStateException("Built-in library initialization failed. " +
+                                                "Please ensure you have kotlin-runtime.jar in the classpath: " + e, e);
             }
             finally {
                 initializing = false;
