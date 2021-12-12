diff --git a/hikaricp-common/src/main/java/com/zaxxer/hikari/util/LeakTask.java b/hikaricp-common/src/main/java/com/zaxxer/hikari/util/LeakTask.java
index 372e3cd..9b886b0 100644
--- a/hikaricp-common/src/main/java/com/zaxxer/hikari/util/LeakTask.java
+++ b/hikaricp-common/src/main/java/com/zaxxer/hikari/util/LeakTask.java
@@ -65,7 +65,7 @@
    
    private LeakTask(final LeakTask parent)
    {
-      exception = new Exception();
+      exception = new Exception("Apparent connection leak detected");
       scheduledFuture = parent.executorService.schedule(this, parent.leakDetectionThreshold, TimeUnit.MILLISECONDS);
    }
 
