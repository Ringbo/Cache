diff --git a/src/com/maddyhome/idea/vim/group/MotionGroup.java b/src/com/maddyhome/idea/vim/group/MotionGroup.java
index 06c6c3e..0978f01 100644
--- a/src/com/maddyhome/idea/vim/group/MotionGroup.java
+++ b/src/com/maddyhome/idea/vim/group/MotionGroup.java
@@ -898,7 +898,7 @@
     {
         int line = EditorHelper.normalizeVisualLine(editor, EditorHelper.getCurrentVisualLine(editor) + cntForward);
 
-        if (line <= 0)
+        if (line < 0)
         {
             return 0;
         }
