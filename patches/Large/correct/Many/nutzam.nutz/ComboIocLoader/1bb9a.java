diff --git a/src/org/nutz/ioc/loader/combo/ComboIocLoader.java b/src/org/nutz/ioc/loader/combo/ComboIocLoader.java
index ff10797..e9c469a 100644
--- a/src/org/nutz/ioc/loader/combo/ComboIocLoader.java
+++ b/src/org/nutz/ioc/loader/combo/ComboIocLoader.java
@@ -107,7 +107,7 @@
                 for (String _className : _names) {
                     klass = (Class<? extends IocLoader>) Lang.loadClassQuite(_className);
                     if (klass != null) {
-                        log.debug("found " + _className + " -- " + _className);
+                        log.debug("found " + className + " -- " + _className);
                         break;
                     }
                 }
