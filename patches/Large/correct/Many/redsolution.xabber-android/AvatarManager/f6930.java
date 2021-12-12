diff --git a/xabber/src/main/java/com/xabber/android/data/extension/avatar/AvatarManager.java b/xabber/src/main/java/com/xabber/android/data/extension/avatar/AvatarManager.java
index 0bcf63f..1cd740b 100644
--- a/xabber/src/main/java/com/xabber/android/data/extension/avatar/AvatarManager.java
+++ b/xabber/src/main/java/com/xabber/android/data/extension/avatar/AvatarManager.java
@@ -380,10 +380,10 @@
         String[] words = name.split("\\s+");
         String chars = "";
 
-        if (words.length >= 1)
+        if (words.length >= 1 && words[0].length() > 0)
             chars = chars + words[0].substring(0, 1);
 
-        if (words.length >= 2)
+        if (words.length >= 2 && words[1].length() > 0)
             chars = chars + words[1].substring(0, 1);
 
         return TextDrawable.builder()
