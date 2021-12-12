diff --git a/java/org/apache/catalina/tribes/transport/PooledSender.java b/java/org/apache/catalina/tribes/transport/PooledSender.java
index afac822..049a401 100644
--- a/java/org/apache/catalina/tribes/transport/PooledSender.java
+++ b/java/org/apache/catalina/tribes/transport/PooledSender.java
@@ -199,7 +199,7 @@
                                 "PooledSender.senderDisconnectFail"), e);
                     }
                 }
-            notify();
+            notifyAll();
         }
 
         public synchronized void close() {
@@ -216,14 +216,14 @@
             }//for
             notinuse.clear();
             inuse.clear();
-            notify();
+            notifyAll();
 
 
         }
 
         public synchronized void open() {
             isOpen = true;
-            notify();
+            notifyAll();
         }
     }
 }
\ No newline at end of file
