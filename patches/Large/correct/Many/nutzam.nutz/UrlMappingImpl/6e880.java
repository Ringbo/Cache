diff --git a/src/org/nutz/mvc/impl/UrlMappingImpl.java b/src/org/nutz/mvc/impl/UrlMappingImpl.java
index c67a875..3a600a5 100644
--- a/src/org/nutz/mvc/impl/UrlMappingImpl.java
+++ b/src/org/nutz/mvc/impl/UrlMappingImpl.java
@@ -57,7 +57,7 @@
                 // 记录一下方法与 url 的映射
                 config.getAtMap().addMethod(path, ai.getMethod());
             } else if (!ai.isForSpecialHttpMethod()) {
-            	log.debugf("Duplicate @At mapping ? path=" + path);
+            	log.warnf("Duplicate @At mapping ? path=" + path);
             }
 
             // 将动作链，根据特殊的 HTTP 方法，保存到调用者内部
