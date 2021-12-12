diff --git a/dubbo-common/src/main/java/org/apache/dubbo/common/URL.java b/dubbo-common/src/main/java/org/apache/dubbo/common/URL.java
index 106bebc..2935387 100644
--- a/dubbo-common/src/main/java/org/apache/dubbo/common/URL.java
+++ b/dubbo-common/src/main/java/org/apache/dubbo/common/URL.java
@@ -1168,7 +1168,7 @@
             map.put(USERNAME_KEY, username);
         }
         if (password != null) {
-            map.put(USERNAME_KEY, password);
+            map.put(PASSWORD_KEY, password);
         }
         if (host != null) {
             map.put(HOST_KEY, host);
