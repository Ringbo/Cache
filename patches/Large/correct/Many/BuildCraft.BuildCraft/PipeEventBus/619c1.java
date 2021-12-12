diff --git a/common/buildcraft/transport/pipe/PipeEventBus.java b/common/buildcraft/transport/pipe/PipeEventBus.java
index 22d89d9..d43c770 100644
--- a/common/buildcraft/transport/pipe/PipeEventBus.java
+++ b/common/buildcraft/transport/pipe/PipeEventBus.java
@@ -52,7 +52,7 @@
             if (superCls != null) {
                 list.addAll(getHandlers(superCls));
             }
-            for (Method m : cls.getMethods()) {
+            for (Method m : cls.getDeclaredMethods()) {
                 PipeEventHandler annot = m.getAnnotation(PipeEventHandler.class);
                 if (annot == null) {
                     continue;
