diff --git a/plugins/hg4idea/src/org/zmlx/hg4idea/command/HgStatusCommand.java b/plugins/hg4idea/src/org/zmlx/hg4idea/command/HgStatusCommand.java
index c37ab45..d0f62c7 100644
--- a/plugins/hg4idea/src/org/zmlx/hg4idea/command/HgStatusCommand.java
+++ b/plugins/hg4idea/src/org/zmlx/hg4idea/command/HgStatusCommand.java
@@ -125,9 +125,9 @@
     if (includeCopySource) {
       options.add("--copies");
     }
-    if (baseRevision != null) {
+    if (baseRevision != null && !baseRevision.getRevision().isEmpty()) {
       options.add("--rev");
-      options.add(baseRevision.getChangeset().equals("") ? baseRevision.getRevision() : baseRevision.getChangeset());
+      options.add(baseRevision.getChangeset().isEmpty() ? baseRevision.getRevision() : baseRevision.getChangeset());
       if (targetRevision != null) {
         options.add("--rev");
         options.add(targetRevision.getChangeset());
@@ -143,16 +143,16 @@
         args.addAll(options);
         args.addAll(chunk);
         HgCommandResult result = executor.executeInCurrentThread(repo, "status", args);
-        changes.addAll(parseChangesFromResult(repo, result));
+        changes.addAll(parseChangesFromResult(repo, result, args));
       }
     } else {
       HgCommandResult result = executor.executeInCurrentThread(repo, "status", options);
-      changes.addAll(parseChangesFromResult(repo, result));
+      changes.addAll(parseChangesFromResult(repo, result, options));
     }
     return changes;
   }
 
-  private static Collection<HgChange> parseChangesFromResult(VirtualFile repo, HgCommandResult result) {
+  private static Collection<HgChange> parseChangesFromResult(VirtualFile repo, HgCommandResult result, List<String> args) {
     final Set<HgChange> changes = new HashSet<HgChange>();
     HgChange previous = null;
     if (result == null) {
@@ -166,7 +166,7 @@
       char statusChar = line.charAt(STATUS_INDEX);
       HgFileStatusEnum status = HgFileStatusEnum.parse(statusChar);
       if (status == null) {
-        LOG.error("Unknown status [" + statusChar + "] in line [" + line + "]");
+        LOG.error("Unknown status [" + statusChar + "] in line [" + line + "]" + "\n with arguments " + args);
         continue;
       }
       File ioFile = new File(repo.getPath(), line.substring(2));
