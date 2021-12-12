diff --git a/plugins/svn4idea/src/org/jetbrains/idea/svn/commandLine/SvnInfoStructure.java b/plugins/svn4idea/src/org/jetbrains/idea/svn/commandLine/SvnInfoStructure.java
index 1c44d34..696e366 100644
--- a/plugins/svn4idea/src/org/jetbrains/idea/svn/commandLine/SvnInfoStructure.java
+++ b/plugins/svn4idea/src/org/jetbrains/idea/svn/commandLine/SvnInfoStructure.java
@@ -119,7 +119,7 @@
 
   private SVNConflictAction parseConflictAction(@NotNull String actionName) {
     SVNConflictAction action = SVNConflictAction.fromString(actionName);
-    action = action == null ? ourConflictActions.get(actionName) : null;
+    action = action != null ? action : ourConflictActions.get(actionName);
 
     if (action == null) {
       throw new IllegalArgumentException("Unknown conflict action " + actionName);
@@ -130,10 +130,10 @@
 
   private SVNConflictReason parseConflictReason(@NotNull String reasonName) throws SAXException {
     SVNConflictReason reason = SVNConflictReason.fromString(reasonName);
-    reason = reason == null ? ourConflictReasons.get(reasonName) : null;
+    reason = reason != null ? reason : ourConflictReasons.get(reasonName);
 
     if (reason == null) {
-      throw new SAXException("Can not parse conflict reason: " + reason);
+      throw new SAXException("Can not parse conflict reason: " + reasonName);
     }
 
     return reason;
