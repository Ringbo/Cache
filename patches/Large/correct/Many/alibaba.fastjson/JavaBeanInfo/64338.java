diff --git a/src/main/java/com/alibaba/fastjson/util/JavaBeanInfo.java b/src/main/java/com/alibaba/fastjson/util/JavaBeanInfo.java
index fe43086..9424f94 100644
--- a/src/main/java/com/alibaba/fastjson/util/JavaBeanInfo.java
+++ b/src/main/java/com/alibaba/fastjson/util/JavaBeanInfo.java
@@ -355,7 +355,7 @@
                 String[] paramNames = null;
                 if (kotlin && constructors.length > 0) {
                     paramNames = TypeUtils.getKoltinConstructorParameters(clazz);
-                    creatorConstructor = TypeUtils.getKoltinConstructor(constructors);
+                    creatorConstructor = TypeUtils.getKoltinConstructor(constructors, paramNames);
                     TypeUtils.setAccessible(creatorConstructor);
                 } else {
 
