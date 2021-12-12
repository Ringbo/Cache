diff --git a/src/org/nutz/ioc/impl/NutIoc.java b/src/org/nutz/ioc/impl/NutIoc.java
index 77ecce6..f68a1f6 100644
--- a/src/org/nutz/ioc/impl/NutIoc.java
+++ b/src/org/nutz/ioc/impl/NutIoc.java
@@ -194,7 +194,7 @@
                         }
 
                         // 修正对象类型
-                        if (null == iobj.getType())
+                        if (null == iobj.getType() && Strings.isBlank(iobj.getFactory()))
                             if (null == type)
                                 throw new IocException(name, "NULL TYPE object '%s'", name);
                             else
