diff --git a/src/main/java/com/google/devtools/build/lib/buildtool/buildevent/BuildStartingEvent.java b/src/main/java/com/google/devtools/build/lib/buildtool/buildevent/BuildStartingEvent.java
index 3a87b5d..3eff203 100644
--- a/src/main/java/com/google/devtools/build/lib/buildtool/buildevent/BuildStartingEvent.java
+++ b/src/main/java/com/google/devtools/build/lib/buildtool/buildevent/BuildStartingEvent.java
@@ -90,7 +90,7 @@
     BuildEventStreamProtos.BuildStarted.Builder started =
         BuildEventStreamProtos.BuildStarted.newBuilder()
             .setUuid(request.getId().toString())
-            .setStartTimeMilis(request.getStartTime())
+            .setStartTimeMillis(request.getStartTime())
             .setBuildToolVersion(BlazeVersionInfo.instance().getVersion())
             .setOptionsDescription(request.getOptionsDescription())
             .setCommand(request.getCommandName());
