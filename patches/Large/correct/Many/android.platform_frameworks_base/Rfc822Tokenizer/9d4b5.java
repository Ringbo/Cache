diff --git a/core/java/android/text/util/Rfc822Tokenizer.java b/core/java/android/text/util/Rfc822Tokenizer.java
index 9d8bfd9..69d745d 100644
--- a/core/java/android/text/util/Rfc822Tokenizer.java
+++ b/core/java/android/text/util/Rfc822Tokenizer.java
@@ -84,7 +84,7 @@
                     if (c == '"') {
                         i++;
                         break;
-                    } else if (c == '\\') {
+                    } else if (c == '\\' && i + 1 < cursor) {
                         name.append(text.charAt(i + 1));
                         i += 2;
                     } else {
@@ -110,7 +110,7 @@
                         comment.append(c);
                         level++;
                         i++;
-                    } else if (c == '\\') {
+                    } else if (c == '\\' && i + 1 < cursor) {
                         comment.append(text.charAt(i + 1));
                         i += 2;
                     } else {
