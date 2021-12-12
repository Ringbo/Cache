diff --git a/core/java/android/text/util/Rfc822Token.java b/core/java/android/text/util/Rfc822Token.java
index e6472df..7fe11bc 100644
--- a/core/java/android/text/util/Rfc822Token.java
+++ b/core/java/android/text/util/Rfc822Token.java
@@ -114,7 +114,7 @@
         for (int i = 0; i < len; i++) {
             char c = name.charAt(i);
 
-            if (! ((c >= 'A' && i <= 'Z') ||
+            if (! ((c >= 'A' && c <= 'Z') ||
                    (c >= 'a' && c <= 'z') ||
                    (c == ' ') ||
                    (c >= '0' && c <= '9'))) {
