diff --git a/src/com/maddyhome/idea/vim/group/ChangeGroup.java b/src/com/maddyhome/idea/vim/group/ChangeGroup.java
index d72d4cf..8f45e8b 100644
--- a/src/com/maddyhome/idea/vim/group/ChangeGroup.java
+++ b/src/com/maddyhome/idea/vim/group/ChangeGroup.java
@@ -758,10 +758,12 @@
         }
 
         // This is a kludge for dw, dW, and d[w. They are changed to d$ if we are
-        // deleting the last word on a line. Without this kludge we end up deleting the newline too.
+        // deleting the last word on a line and there is no count.
+        // Without this kludge we end up deleting the newline too.
+        // TODO - this is all wrong - It seems Vim does this different - research
         String text = new String(editor.getDocument().getChars(), range.getStartOffset(),
             range.getEndOffset() - range.getStartOffset());
-        if (text.indexOf('\n') >= 0)
+        if (text.indexOf('\n') >= 0 && count * argument.getMotion().getCount() == 1)
         {
             String id = ActionManager.getInstance().getId(argument.getMotion().getAction());
             logger.debug("action id=" + id);
