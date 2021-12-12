diff --git a/src/main/java/com/google/devtools/build/lib/rules/objc/ObjcProtoLibrary.java b/src/main/java/com/google/devtools/build/lib/rules/objc/ObjcProtoLibrary.java
index 7e15047..2117bf5 100644
--- a/src/main/java/com/google/devtools/build/lib/rules/objc/ObjcProtoLibrary.java
+++ b/src/main/java/com/google/devtools/build/lib/rules/objc/ObjcProtoLibrary.java
@@ -230,7 +230,7 @@
       }
       PathFragment rawFragment = new PathFragment(
           rootRelativeOutputDir,
-          proto.getExecPath().getParentDirectory(),
+          proto.getRootRelativePath().getParentDirectory(),
           new PathFragment(protoOutputName));
       @Nullable PathFragment outputFile = FileSystemUtils.replaceExtension(
           rawFragment,
