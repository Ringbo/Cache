diff --git a/rt/core/src/main/java/org/apache/cxf/workqueue/AutomaticWorkQueueImpl.java b/rt/core/src/main/java/org/apache/cxf/workqueue/AutomaticWorkQueueImpl.java
index 0e5d757..8afc029 100644
--- a/rt/core/src/main/java/org/apache/cxf/workqueue/AutomaticWorkQueueImpl.java
+++ b/rt/core/src/main/java/org/apache/cxf/workqueue/AutomaticWorkQueueImpl.java
@@ -376,7 +376,7 @@
                 if ((sz + sz2) > ps) {
                     Method m = ThreadPoolExecutor.class.getDeclaredMethod("addIfUnderMaximumPoolSize",
                                                                           Runnable.class);
-                    ReflectionUtil.setAccessible(m).invoke(this, new Object[1]);
+                    ReflectionUtil.setAccessible(m).invoke(executor, new Object[1]);
                 }
             } catch (Exception exc) {
                 //ignore
