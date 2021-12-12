diff --git a/server/sonar-server/src/main/java/org/sonar/server/util/AbstractStoppableExecutorService.java b/server/sonar-server/src/main/java/org/sonar/server/util/AbstractStoppableExecutorService.java
index f353b8a..5a926a5 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/util/AbstractStoppableExecutorService.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/util/AbstractStoppableExecutorService.java
@@ -54,11 +54,11 @@
         delegate.shutdownNow();
         // Wait a while for tasks to respond to being canceled
         if (!delegate.awaitTermination(5, TimeUnit.SECONDS)) {
-          Loggers.get(getClass()).error(format("Pool %s did not terminate", getClass().getSimpleName()));
+          Loggers.get(getClass()).warn(format("Pool %s did not terminate", getClass().getSimpleName()));
         }
       }
     } catch (InterruptedException ie) {
-      Loggers.get(getClass()).error(format("Termination of pool %s failed", getClass().getSimpleName()), ie);
+      Loggers.get(getClass()).warn(format("Termination of pool %s failed", getClass().getSimpleName()), ie);
       // (Re-)Cancel if current thread also interrupted
       delegate.shutdownNow();
     }
