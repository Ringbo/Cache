diff --git a/support/guice/src/main/java/org/apache/shiro/guice/web/ShiroWebModule.java b/support/guice/src/main/java/org/apache/shiro/guice/web/ShiroWebModule.java
index ea389e2..aac1394 100644
--- a/support/guice/src/main/java/org/apache/shiro/guice/web/ShiroWebModule.java
+++ b/support/guice/src/main/java/org/apache/shiro/guice/web/ShiroWebModule.java
@@ -158,7 +158,8 @@
 
                 // initialize key in filterToPathToConfig, if it doesn't exist
                 if (filterToPathToConfig.get(key) == null) {
-                    filterToPathToConfig.put((key), new HashMap<String, String>());
+                	// Fix for SHIRO-621: REST filter bypassing matched path
+                    filterToPathToConfig.put((key), new LinkedHashMap<String, String>());
                 }
                 // now set the value
                 filterToPathToConfig.get(key).put(path, config);
