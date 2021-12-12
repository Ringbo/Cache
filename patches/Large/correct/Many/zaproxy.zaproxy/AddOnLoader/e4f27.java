diff --git a/src/org/zaproxy/zap/control/AddOnLoader.java b/src/org/zaproxy/zap/control/AddOnLoader.java
index 2e316fe..fac5dcb 100644
--- a/src/org/zaproxy/zap/control/AddOnLoader.java
+++ b/src/org/zaproxy/zap/control/AddOnLoader.java
@@ -805,7 +805,7 @@
                 }
             } catch (Throwable e) {
             	// Often not an error
-            	logger.debug(e.getMessage());
+            	logger.debug(e.getMessage(), e);
             }
         }
         return listClass;
