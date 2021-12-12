diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/bridge/VMToCompilerImpl.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/bridge/VMToCompilerImpl.java
index 2681fbc..5711cc6 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/bridge/VMToCompilerImpl.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/bridge/VMToCompilerImpl.java
@@ -135,7 +135,7 @@
                 @Override
                 public void run() {
                     Assumptions assumptions = new Assumptions(GraalOptions.OptAssumptions);
-                    SnippetInstaller installer = new SnippetInstaller(runtime, runtime.getGraalRuntime().getTarget(), HotSpotGraalRuntime.wordStamp(), assumptions);
+                    SnippetInstaller installer = new SnippetInstaller(runtime, assumptions, runtime.getGraalRuntime().getTarget());
                     GraalIntrinsics.installIntrinsics(installer);
                     runtime.installSnippets(installer, assumptions);
                 }
