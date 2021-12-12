diff --git a/src/org/zaproxy/zap/control/AddOnLoader.java b/src/org/zaproxy/zap/control/AddOnLoader.java
index 97f948f..005922f 100644
--- a/src/org/zaproxy/zap/control/AddOnLoader.java
+++ b/src/org/zaproxy/zap/control/AddOnLoader.java
@@ -339,7 +339,7 @@
                 }
             } catch (Throwable e) {
             	// Often not an error
-            	logger.debug(e.getMessage(), e);
+            	logger.debug(e.getMessage());
             }
         }
         
