diff --git a/plugins/hg4idea/src/org/zmlx/hg4idea/command/HgLogCommand.java b/plugins/hg4idea/src/org/zmlx/hg4idea/command/HgLogCommand.java
index ed93bee..7a7b2d2 100644
--- a/plugins/hg4idea/src/org/zmlx/hg4idea/command/HgLogCommand.java
+++ b/plugins/hg4idea/src/org/zmlx/hg4idea/command/HgLogCommand.java
@@ -125,11 +125,12 @@
     String[] changeSets = output.split(HgChangesetUtil.CHANGESET_SEPARATOR);
     for (String line : changeSets) {
       try {
-        String[] attributes = line.split(HgChangesetUtil.ITEM_SEPARATOR);
+        // we need to get all attributes, include empty trailing strings, so use non-positive limit as second argument
+        String[] attributes = line.split(HgChangesetUtil.ITEM_SEPARATOR, -1);
         // At least in the case of the long template, it's OK that we don't have everything...for example, if there were no
         //  deleted or copied files, then we won't get any attributes for them...
         int numAttributes = attributes.length;
-        if (!includeFiles && (numAttributes != expectedItemCount)) {
+        if (!includeFiles && (numAttributes < expectedItemCount)) { //there are may be empty string as last split attributes
           LOG.debug("Wrong format. Skipping line " + line);
           continue;
         }
