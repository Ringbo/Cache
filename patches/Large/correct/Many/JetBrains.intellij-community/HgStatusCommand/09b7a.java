diff --git a/plugins/hg4idea/src/org/zmlx/hg4idea/command/HgStatusCommand.java b/plugins/hg4idea/src/org/zmlx/hg4idea/command/HgStatusCommand.java
index 460f3ef..f551adb 100644
--- a/plugins/hg4idea/src/org/zmlx/hg4idea/command/HgStatusCommand.java
+++ b/plugins/hg4idea/src/org/zmlx/hg4idea/command/HgStatusCommand.java
@@ -219,7 +219,7 @@
       char statusChar = line.charAt(STATUS_INDEX);
       HgFileStatusEnum status = HgFileStatusEnum.parse(statusChar);
       if (status == null) {
-        LOG.error("Unknown status [" + statusChar + "] in line [" + line + "]" + "\n with arguments " + args);
+        LOG.warn("Unknown status [" + statusChar + "] in line [" + line + "]" + "\n with arguments " + args);
         continue;
       }
       File ioFile = new File(repo.getPath(), line.substring(2));
