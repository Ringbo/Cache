diff --git a/src/main/java/com/google/devtools/build/lib/bazel/BazelWorkspaceStatusModule.java b/src/main/java/com/google/devtools/build/lib/bazel/BazelWorkspaceStatusModule.java
index 5a59cab..17996f4 100644
--- a/src/main/java/com/google/devtools/build/lib/bazel/BazelWorkspaceStatusModule.java
+++ b/src/main/java/com/google/devtools/build/lib/bazel/BazelWorkspaceStatusModule.java
@@ -239,16 +239,18 @@
           BuildInfo.BUILD_HOST,
           Key.of(KeyType.STRING, "hostname", "redacted"),
           BuildInfo.BUILD_USER,
-          Key.of(KeyType.STRING, "username", "redacted"),
-          BuildInfo.BUILD_SCM_REVISION,
-          Key.of(KeyType.STRING, "0", "0"),
-          BuildInfo.BUILD_SCM_STATUS,
-          Key.of(KeyType.STRING, "", "redacted"));
+          Key.of(KeyType.STRING, "username", "redacted"));
     }
 
     @Override
     public ImmutableMap<String, Key> getVolatileKeys() {
-      return ImmutableMap.of(BuildInfo.BUILD_TIMESTAMP, Key.of(KeyType.INTEGER, "0", "0"));
+      return ImmutableMap.of(
+          BuildInfo.BUILD_TIMESTAMP,
+          Key.of(KeyType.INTEGER, "0", "0"),
+          BuildInfo.BUILD_SCM_REVISION,
+          Key.of(KeyType.STRING, "0", "0"),
+          BuildInfo.BUILD_SCM_STATUS,
+          Key.of(KeyType.STRING, "", "redacted"));
     }
   }
 
