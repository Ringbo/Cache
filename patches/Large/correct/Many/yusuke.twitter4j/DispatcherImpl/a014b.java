diff --git a/twitter4j-core/src/main/java/twitter4j/internal/async/DispatcherImpl.java b/twitter4j-core/src/main/java/twitter4j/internal/async/DispatcherImpl.java
index c6fa950..c1736eb 100644
--- a/twitter4j-core/src/main/java/twitter4j/internal/async/DispatcherImpl.java
+++ b/twitter4j-core/src/main/java/twitter4j/internal/async/DispatcherImpl.java
@@ -87,7 +87,7 @@
                 thread.shutdown();
             }
             synchronized (ticket) {
-                ticket.notify();
+                ticket.notifyAll();
             }
         }
     }
