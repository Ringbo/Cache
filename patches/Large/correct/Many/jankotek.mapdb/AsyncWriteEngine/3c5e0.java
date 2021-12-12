diff --git a/src/main/java/org/mapdb/AsyncWriteEngine.java b/src/main/java/org/mapdb/AsyncWriteEngine.java
index 859cdc6..2bc0b53 100644
--- a/src/main/java/org/mapdb/AsyncWriteEngine.java
+++ b/src/main/java/org/mapdb/AsyncWriteEngine.java
@@ -59,8 +59,7 @@
                 }
 
                 synchronized (writerNotify){
-                    writerNotify.wait();
-                    //writerNotify.wait(1000); //check write conditions every N seconds to prevent possible deadlock
+                    writerNotify.wait(1000); //check write conditions every N seconds to prevent possible deadlock
                 }
             }
 
