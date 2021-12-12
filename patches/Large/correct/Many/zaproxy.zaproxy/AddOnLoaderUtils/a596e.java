diff --git a/src/org/zaproxy/zap/control/AddOnLoaderUtils.java b/src/org/zaproxy/zap/control/AddOnLoaderUtils.java
index f6b6fa1..7fc616e 100644
--- a/src/org/zaproxy/zap/control/AddOnLoaderUtils.java
+++ b/src/org/zaproxy/zap/control/AddOnLoaderUtils.java
@@ -110,7 +110,7 @@
             @SuppressWarnings("unchecked")
             Constructor<T> c = (Constructor<T>) cls.getConstructor();
             return c.newInstance();
-        } catch (ExceptionInInitializerError | Exception e) {
+        } catch (LinkageError | Exception e) {
             LOGGER.error("Failed to initialise: " + classname, e);
         }
         return null;
