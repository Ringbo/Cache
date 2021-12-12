diff --git a/src/java/org/jivesoftware/util/EmailService.java b/src/java/org/jivesoftware/util/EmailService.java
index 87949cb..5f66bdd 100644
--- a/src/java/org/jivesoftware/util/EmailService.java
+++ b/src/java/org/jivesoftware/util/EmailService.java
@@ -87,7 +87,7 @@
      * Constructs a new EmailService instance.
      */
     private EmailService() {
-        executor = new ThreadPoolExecutor(0, 5, 60,
+        executor = new ThreadPoolExecutor(1, 5, 60,
             TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
 
         host = JiveGlobals.getProperty("mail.smtp.host", "localhost");
@@ -138,7 +138,7 @@
         if (messages.size() == 0) {
             return;
         }
-        executor.submit(new EmailTask(messages));
+        executor.execute(new EmailTask(messages));
     }
 
     /**
