diff --git a/core/src/main/java/org/apache/cxf/common/util/ProxyHelper.java b/core/src/main/java/org/apache/cxf/common/util/ProxyHelper.java
index 6e9e0f7..413098c 100644
--- a/core/src/main/java/org/apache/cxf/common/util/ProxyHelper.java
+++ b/core/src/main/java/org/apache/cxf/common/util/ProxyHelper.java
@@ -83,7 +83,7 @@
                         Class.forName(returnType.getName(), true, loader);
                     }
                     for (Class<?> p : m.getParameterTypes()) {
-                        if (!returnType.isPrimitive()) {
+                        if (!p.isPrimitive()) {
                             Class.forName(p.getName(), true, loader);
                         }
                     }
