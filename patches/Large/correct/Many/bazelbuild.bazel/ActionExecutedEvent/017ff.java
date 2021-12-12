diff --git a/src/main/java/com/google/devtools/build/lib/actions/ActionExecutedEvent.java b/src/main/java/com/google/devtools/build/lib/actions/ActionExecutedEvent.java
index 44b19a5..f5a11a8 100644
--- a/src/main/java/com/google/devtools/build/lib/actions/ActionExecutedEvent.java
+++ b/src/main/java/com/google/devtools/build/lib/actions/ActionExecutedEvent.java
@@ -113,7 +113,7 @@
           .build());
     }
     if (stderr != null) {
-      actionBuilder.setStdout(
+      actionBuilder.setStderr(
           BuildEventStreamProtos.File.newBuilder()
           .setName("stderr")
           .setUri(pathConverter.apply(stderr))
