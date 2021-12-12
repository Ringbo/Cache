diff --git a/core/src/main/java/org/apache/shiro/realm/text/PropertiesRealm.java b/core/src/main/java/org/apache/shiro/realm/text/PropertiesRealm.java
index 7a44a5a..763de9b 100644
--- a/core/src/main/java/org/apache/shiro/realm/text/PropertiesRealm.java
+++ b/core/src/main/java/org/apache/shiro/realm/text/PropertiesRealm.java
@@ -163,7 +163,7 @@
         loadProperties();
         //we can only determine if files have been modified at runtime (not classpath entries or urls), so only
         //start the thread in this case:
-        if (this.resourcePath.startsWith(ResourceUtils.FILE_PREFIX) && scheduler != null) {
+        if (this.resourcePath.startsWith(ResourceUtils.FILE_PREFIX) && scheduler == null) {
             startReloadThread();
         }
     }
