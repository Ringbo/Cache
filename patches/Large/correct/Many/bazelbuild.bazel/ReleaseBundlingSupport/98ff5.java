diff --git a/src/main/java/com/google/devtools/build/lib/rules/objc/ReleaseBundlingSupport.java b/src/main/java/com/google/devtools/build/lib/rules/objc/ReleaseBundlingSupport.java
index dd9a4a1..787604d 100644
--- a/src/main/java/com/google/devtools/build/lib/rules/objc/ReleaseBundlingSupport.java
+++ b/src/main/java/com/google/devtools/build/lib/rules/objc/ReleaseBundlingSupport.java
@@ -758,7 +758,7 @@
         .add("Frameworks")
         .addPath(ObjcRuleClasses.SWIFT_STDLIB_TOOL)
         .add("--platform").add(IosSdkCommands.swiftPlatform(objcConfiguration))
-        .addExecPath("--scan-executable", intermediateArtifacts.strippedSingleArchitectureBinary());
+        .addExecPath("--scan-executable", intermediateArtifacts.combinedArchitectureBinary());
 
     ruleContext.registerAction(
         ObjcRuleClasses.spawnJavaOnDarwinActionBuilder(
@@ -766,7 +766,7 @@
             .setMnemonic("SwiftStdlibCopy")
             .setCommandLine(commandLine.build())
             .addOutput(intermediateArtifacts.swiftFrameworksFileZip())
-            .addInput(intermediateArtifacts.strippedSingleArchitectureBinary())
+            .addInput(intermediateArtifacts.combinedArchitectureBinary())
             .build(ruleContext));
   }
 
