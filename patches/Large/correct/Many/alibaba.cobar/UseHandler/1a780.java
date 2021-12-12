diff --git a/server/src/main/server/com/alibaba/cobar/server/handler/UseHandler.java b/server/src/main/server/com/alibaba/cobar/server/handler/UseHandler.java
index caef471..9898f23 100644
--- a/server/src/main/server/com/alibaba/cobar/server/handler/UseHandler.java
+++ b/server/src/main/server/com/alibaba/cobar/server/handler/UseHandler.java
@@ -33,7 +33,7 @@
         int length = schema.length();
         if (length > 0) {
             if (schema.charAt(0) == '`' && schema.charAt(length - 1) == '`') {
-                schema = schema.substring(1, length - 2);
+                schema = schema.substring(1, length - 1);
             }
         }
 
