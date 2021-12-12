diff --git a/sonar-core/src/test/java/org/sonar/core/persistence/SemaphoreUpdaterTest.java b/sonar-core/src/test/java/org/sonar/core/persistence/SemaphoreUpdaterTest.java
index dac8bf7..88f7859 100644
--- a/sonar-core/src/test/java/org/sonar/core/persistence/SemaphoreUpdaterTest.java
+++ b/sonar-core/src/test/java/org/sonar/core/persistence/SemaphoreUpdaterTest.java
@@ -48,7 +48,7 @@
     Semaphores.Semaphore semaphore = new Semaphores.Semaphore().setName("foo");
     updater.scheduleForUpdate(semaphore, 1);
 
-    Thread.sleep(1000);
+    Thread.sleep(2000);
 
     verify(dao).update(semaphore);
   }
@@ -59,7 +59,7 @@
     updater.scheduleForUpdate(semaphore, 1);
     updater.stopUpdate("foo");
 
-    Thread.sleep(1000);
+    Thread.sleep(2000);
 
     verify(dao, never()).update(semaphore);
   }
