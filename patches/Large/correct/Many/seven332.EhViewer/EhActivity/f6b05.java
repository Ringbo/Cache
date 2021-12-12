diff --git a/app/src/main/java/com/hippo/ehviewer/ui/EhActivity.java b/app/src/main/java/com/hippo/ehviewer/ui/EhActivity.java
index ade0dee..4e6bb09 100644
--- a/app/src/main/java/com/hippo/ehviewer/ui/EhActivity.java
+++ b/app/src/main/java/com/hippo/ehviewer/ui/EhActivity.java
@@ -85,9 +85,9 @@
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
 
