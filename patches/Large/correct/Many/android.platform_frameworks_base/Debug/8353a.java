diff --git a/core/java/android/os/Debug.java b/core/java/android/os/Debug.java
index 2acf36f..c3894c4 100644
--- a/core/java/android/os/Debug.java
+++ b/core/java/android/os/Debug.java
@@ -2352,22 +2352,28 @@
     }
 
     /**
-     * Attach a library as a jvmti agent to the current runtime.
+     * Attach a library as a jvmti agent to the current runtime, with the given classloader
+     * determining the library search path.
+     * <p>
+     * Note: agents may only be attached to debuggable apps. Otherwise, this function will
+     * throw a SecurityException.
      *
-     * @param library library containing the agent
-     * @param options options passed to the agent
+     * @param library the library containing the agent.
+     * @param options the options passed to the agent.
+     * @param classLoader the classloader determining the library search path.
      *
-     * @throws IOException If the agent could not be attached
+     * @throws IOException if the agent could not be attached.
+     * @throws SecurityException if the app is not debuggable.
      */
-    public static void attachJvmtiAgent(@NonNull String library, @Nullable String options)
-            throws IOException {
+    public static void attachJvmtiAgent(@NonNull String library, @Nullable String options,
+            @Nullable ClassLoader classLoader) throws IOException {
         Preconditions.checkNotNull(library);
         Preconditions.checkArgument(!library.contains("="));
 
         if (options == null) {
-            VMDebug.attachAgent(library);
+            VMDebug.attachAgent(library, classLoader);
         } else {
-            VMDebug.attachAgent(library + "=" + options);
+            VMDebug.attachAgent(library + "=" + options, classLoader);
         }
     }
 }
