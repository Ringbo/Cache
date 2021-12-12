diff --git a/src/org/zaproxy/zap/control/AddOnLoaderUtils.java b/src/org/zaproxy/zap/control/AddOnLoaderUtils.java
index f387466..688f24f 100644
--- a/src/org/zaproxy/zap/control/AddOnLoaderUtils.java
+++ b/src/org/zaproxy/zap/control/AddOnLoaderUtils.java
@@ -112,7 +112,7 @@
             T instance = c.newInstance();
             return instance;
         } catch (Exception e) {
-            LOGGER.debug(e.getMessage());
+            LOGGER.debug(e.getMessage(), e);
         }
         return null;
     }
