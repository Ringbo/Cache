diff --git a/hystrix-core/src/main/java/com/netflix/hystrix/AbstractCommand.java b/hystrix-core/src/main/java/com/netflix/hystrix/AbstractCommand.java
index 1b40a9a..76b1b11 100644
--- a/hystrix-core/src/main/java/com/netflix/hystrix/AbstractCommand.java
+++ b/hystrix-core/src/main/java/com/netflix/hystrix/AbstractCommand.java
@@ -857,11 +857,11 @@
             Throwable cause = t.getCause();
             if (cause instanceof StackOverflowError) {
                 return true;
-            } else if (t instanceof VirtualMachineError) {
+            } else if (cause instanceof VirtualMachineError) {
                 return true;
-            } else if (t instanceof ThreadDeath) {
+            } else if (cause instanceof ThreadDeath) {
                 return true;
-            } else if (t instanceof LinkageError) {
+            } else if (cause instanceof LinkageError) {
                 return true;
             }
         }
