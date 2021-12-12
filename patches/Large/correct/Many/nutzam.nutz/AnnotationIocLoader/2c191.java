diff --git a/src/org/nutz/ioc/loader/annotation/AnnotationIocLoader.java b/src/org/nutz/ioc/loader/annotation/AnnotationIocLoader.java
index 8aacd11..ceb0ff9 100644
--- a/src/org/nutz/ioc/loader/annotation/AnnotationIocLoader.java
+++ b/src/org/nutz/ioc/loader/annotation/AnnotationIocLoader.java
@@ -84,12 +84,13 @@
                 }
             }
 
+            // 重名了, 需要用户用@IocBean(name="xxxx") 区分一下
             if (map.containsKey(beanName))
                 throw Lang.makeThrow(IocException.class,
                                      "Duplicate beanName=%s, by %s !!  Have been define by %s !!",
                                      beanName,
                                      classZ,
-                                     map.get(beanName).getClass());
+                                     map.get(beanName).getType());
 
             IocObject iocObject = new IocObject();
             iocObject.setType(classZ);
