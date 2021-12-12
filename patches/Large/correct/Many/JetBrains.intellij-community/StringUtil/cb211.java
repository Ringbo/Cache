diff --git a/platform/util/src/com/intellij/openapi/util/text/StringUtil.java b/platform/util/src/com/intellij/openapi/util/text/StringUtil.java
index 62852d4..caf84d0 100644
--- a/platform/util/src/com/intellij/openapi/util/text/StringUtil.java
+++ b/platform/util/src/com/intellij/openapi/util/text/StringUtil.java
@@ -938,7 +938,7 @@
       return true;
     }
     for(int i = 0; i < s.length(); i++) {
-      if(s.charAt(i) != ' ') {
+      if(s.charAt(i) > ' ') {
         return false;
       }
     }
