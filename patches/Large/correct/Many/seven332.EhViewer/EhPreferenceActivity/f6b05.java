diff --git a/app/src/main/java/com/hippo/ehviewer/ui/EhPreferenceActivity.java b/app/src/main/java/com/hippo/ehviewer/ui/EhPreferenceActivity.java
index 9fd6f61..09a17d6 100644
--- a/app/src/main/java/com/hippo/ehviewer/ui/EhPreferenceActivity.java
+++ b/app/src/main/java/com/hippo/ehviewer/ui/EhPreferenceActivity.java
@@ -86,9 +86,9 @@
             if (split.length == 1) {
                 locale = new Locale(split[0]);
             } else if (split.length == 2) {
-                locale = new Locale(split[0], split[0]);
+                locale = new Locale(split[0], split[1]);
             } else if (split.length == 3) {
-                locale = new Locale(split[0], split[0], split[0]);
+                locale = new Locale(split[0], split[1], split[2]);
             }
         }
 
