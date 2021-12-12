diff --git a/src/main/java/com/google/devtools/build/lib/server/RPCServer.java b/src/main/java/com/google/devtools/build/lib/server/RPCServer.java
index cf576ec..377730f 100644
--- a/src/main/java/com/google/devtools/build/lib/server/RPCServer.java
+++ b/src/main/java/com/google/devtools/build/lib/server/RPCServer.java
@@ -360,7 +360,7 @@
     // make it a symlink to /tmp/something.  This typically only happens in
     // tests where the --output_base is beneath a very deep temp dir.
     // (All this extra complexity is just used in tests... *sigh*).
-    if (socketFile.toString().length() >= 108) { // = UNIX_PATH_MAX
+    if (socketFile.toString().length() >= 104) { // = UNIX_PATH_MAX
       Path socketLink = socketFile;
       String tmpDir = System.getProperty("blaze.rpcserver.tmpdir", "/tmp");
       socketFile = createTempSocketDirectory(socketFile.getRelative(tmpDir)).
