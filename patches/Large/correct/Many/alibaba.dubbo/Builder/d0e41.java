diff --git a/dubbo-common/src/main/java/com/alibaba/dubbo/common/serialize/support/dubbo/Builder.java b/dubbo-common/src/main/java/com/alibaba/dubbo/common/serialize/support/dubbo/Builder.java
index 0104af6..f606058 100644
--- a/dubbo-common/src/main/java/com/alibaba/dubbo/common/serialize/support/dubbo/Builder.java
+++ b/dubbo-common/src/main/java/com/alibaba/dubbo/common/serialize/support/dubbo/Builder.java
@@ -983,7 +983,7 @@
                 t = t.getSuperclass();
                 if (t == null)
                     throw new RuntimeException("Can not found Constructor?");
-                cs = c.getDeclaredConstructors();
+                cs = t.getDeclaredConstructors();
             }
             while (cs.length == 0);
         }
