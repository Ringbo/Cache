diff --git a/jOOQ-test/src/org/jooq/test/_/LifecycleWatcherListener.java b/jOOQ-test/src/org/jooq/test/_/LifecycleWatcherListener.java
index e033ea7..4571f6b 100644
--- a/jOOQ-test/src/org/jooq/test/_/LifecycleWatcherListener.java
+++ b/jOOQ-test/src/org/jooq/test/_/LifecycleWatcherListener.java
@@ -103,7 +103,7 @@
         for (StackTraceElement e : Thread.currentThread().getStackTrace()) {
             try {
                 for (Method m : Class.forName(e.getClassName()).getMethods()) {
-                    if (m.getAnnotation(Test.class) != null) {
+                    if (m.getName().equals(e.getMethodName()) && m.getAnnotation(Test.class) != null) {
                         return m;
                     }
                 }
