diff --git a/redisson/src/main/java/org/redisson/executor/TasksRunnerService.java b/redisson/src/main/java/org/redisson/executor/TasksRunnerService.java
index 71bc94c..d865ae5 100644
--- a/redisson/src/main/java/org/redisson/executor/TasksRunnerService.java
+++ b/redisson/src/main/java/org/redisson/executor/TasksRunnerService.java
@@ -67,7 +67,7 @@
         try {
             this.codec = codec.getClass().getConstructor(ClassLoader.class).newInstance(classLoader);
         } catch (Exception e) {
-            throw new IllegalStateException(e);
+            throw new IllegalStateException("Unable to initialize codec with ClassLoader parameter", e);
         }
     }
     
