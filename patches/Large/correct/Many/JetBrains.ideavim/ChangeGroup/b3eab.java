diff --git a/src/com/maddyhome/idea/vim/group/ChangeGroup.java b/src/com/maddyhome/idea/vim/group/ChangeGroup.java
index 16d2ead..5215bb0 100644
--- a/src/com/maddyhome/idea/vim/group/ChangeGroup.java
+++ b/src/com/maddyhome/idea/vim/group/ChangeGroup.java
@@ -465,7 +465,7 @@
       KeyHandler.executeAction("VimInsertReplaceToggle", context);
     }
     // If this command doesn't allow repeats, set count to 1
-    if ((lastInsert.getFlags() & Command.FLAG_NO_REPEAT) != 0) {
+    if (lastInsert != null && (lastInsert.getFlags() & Command.FLAG_NO_REPEAT) != 0) {
       cnt = 1;
     }
 
