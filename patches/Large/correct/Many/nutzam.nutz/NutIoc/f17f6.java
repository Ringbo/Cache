diff --git a/src/org/nutz/ioc/impl/NutIoc.java b/src/org/nutz/ioc/impl/NutIoc.java
index d90662e..0748315 100644
--- a/src/org/nutz/ioc/impl/NutIoc.java
+++ b/src/org/nutz/ioc/impl/NutIoc.java
@@ -154,7 +154,7 @@
                 ((LifeCycle)this.mirrors).init();
         }
         catch (Exception e) {
-            throw new IocException("_mirror_factory_init", "Mirror Factory init fail", e);
+            throw new IocException("_mirror_factory_init", e, "Mirror Factory init fail");
         }
 
         // 创建对象创建时
