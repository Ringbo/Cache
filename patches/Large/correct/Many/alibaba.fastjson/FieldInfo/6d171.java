diff --git a/src/main/java/com/alibaba/fastjson/util/FieldInfo.java b/src/main/java/com/alibaba/fastjson/util/FieldInfo.java
index 7e510be..66ee78b 100755
--- a/src/main/java/com/alibaba/fastjson/util/FieldInfo.java
+++ b/src/main/java/com/alibaba/fastjson/util/FieldInfo.java
@@ -369,7 +369,7 @@
             }
         }
 
-        if (arguments == null) {
+        if (arguments == null || class_gd == null) {
             return null;
         }
 
