diff --git a/src/com/maddyhome/idea/vim/helper/SearchHelper.java b/src/com/maddyhome/idea/vim/helper/SearchHelper.java
index 9ed5acf..f9f675f 100644
--- a/src/com/maddyhome/idea/vim/helper/SearchHelper.java
+++ b/src/com/maddyhome/idea/vim/helper/SearchHelper.java
@@ -831,7 +831,7 @@
       if (CharacterHelper.charType(chars.charAt(pos + 1), skipPunc) == CharacterHelper.TYPE_SPACE && !spaceWords) {
         pos = skipSpace(chars, pos + 1, step, size) - 1;
       }
-      if (CharacterHelper.charType(chars.charAt(pos), skipPunc) != CharacterHelper.charType(chars.charAt(pos + 1), skipPunc)) {
+      if (pos < size - 1 && CharacterHelper.charType(chars.charAt(pos), skipPunc) != CharacterHelper.charType(chars.charAt(pos + 1), skipPunc)) {
         pos += step;
       }
     }
