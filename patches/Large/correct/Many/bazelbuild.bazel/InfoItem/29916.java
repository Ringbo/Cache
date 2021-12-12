diff --git a/src/main/java/com/google/devtools/build/lib/runtime/commands/InfoItem.java b/src/main/java/com/google/devtools/build/lib/runtime/commands/InfoItem.java
index 336342b..52894e7 100644
--- a/src/main/java/com/google/devtools/build/lib/runtime/commands/InfoItem.java
+++ b/src/main/java/com/google/devtools/build/lib/runtime/commands/InfoItem.java
@@ -181,7 +181,8 @@
     public byte[] get(Supplier<BuildConfiguration> configurationSupplier, CommandEnvironment env)
         throws AbruptExitException {
       checkNotNull(env);
-      return print(env.getDirectories().getExecRoot());
+      return print(env.getDirectories().getExecRoot(
+          configurationSupplier.get().getMainRepositoryName()));
     }
   }
 
