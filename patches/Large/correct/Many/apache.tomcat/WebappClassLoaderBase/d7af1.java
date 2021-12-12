diff --git a/java/org/apache/catalina/loader/WebappClassLoaderBase.java b/java/org/apache/catalina/loader/WebappClassLoaderBase.java
index 971eef3..9131e6c 100644
--- a/java/org/apache/catalina/loader/WebappClassLoaderBase.java
+++ b/java/org/apache/catalina/loader/WebappClassLoaderBase.java
@@ -1792,7 +1792,9 @@
                 synchronized(queue) {
                     newTasksMayBeScheduledField.setBoolean(thread, false);
                     clearMethod.invoke(queue);
-                    queue.notify();  // In case queue was already empty.
+                    // In case queue was already empty. Should only be one
+                    // thread waiting but use notifyAll() to be safe.
+                    queue.notifyAll();
                 }
 
             }catch (NoSuchFieldException nfe){
