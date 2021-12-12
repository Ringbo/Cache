diff --git a/src/main/java/com/google/devtools/build/lib/windows/WindowsSubprocessFactory.java b/src/main/java/com/google/devtools/build/lib/windows/WindowsSubprocessFactory.java
index af591cc..c9a3994 100644
--- a/src/main/java/com/google/devtools/build/lib/windows/WindowsSubprocessFactory.java
+++ b/src/main/java/com/google/devtools/build/lib/windows/WindowsSubprocessFactory.java
@@ -118,7 +118,7 @@
    * Converts an environment map to the format expected in lpEnvironment by CreateProcess().
    */
   private byte[] convertEnvToNative(Map<String, String> env) throws IOException {
-    Map<String, String> realEnv = new TreeMap<>();
+    Map<String, String> realEnv = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
     realEnv.putAll(env == null ? System.getenv() : env);
     if (getSystemRoot(realEnv) == null) {
       // Some versions of MSVCRT.DLL require SystemRoot to be set. It's quite a common library to
