diff --git a/jps/jps-builders/src/org/jetbrains/jps/incremental/fs/FSState.java b/jps/jps-builders/src/org/jetbrains/jps/incremental/fs/FSState.java
index f185563..219fc22 100644
--- a/jps/jps-builders/src/org/jetbrains/jps/incremental/fs/FSState.java
+++ b/jps/jps-builders/src/org/jetbrains/jps/incremental/fs/FSState.java
@@ -73,7 +73,7 @@
       int targetCount = in.readInt();
       while (targetCount-- > 0) {
         final String id = IOUtil.readString(in);
-        BuildTargetType type = types.get(id);
+        BuildTargetType type = types.get(typeId);
         if (type != null) {
           BuildTarget target = type.createTarget(id);
           getDelta(target).load(in);
