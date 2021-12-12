diff --git a/dubbo-common/src/main/java/org/apache/dubbo/common/URL.java b/dubbo-common/src/main/java/org/apache/dubbo/common/URL.java
index 31ac91e..7809140 100644
--- a/dubbo-common/src/main/java/org/apache/dubbo/common/URL.java
+++ b/dubbo-common/src/main/java/org/apache/dubbo/common/URL.java
@@ -349,7 +349,7 @@
 
     public String getAuthority() {
         if (StringUtils.isEmpty(username)
-                && StringUtils.isEmpty(parameter)) {
+                && StringUtils.isEmpty(password)) {
             return null;
         }
         return (username == null ? "" : username)
