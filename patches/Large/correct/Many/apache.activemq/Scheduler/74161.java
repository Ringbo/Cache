diff --git a/activemq-core/src/main/java/org/apache/activemq/thread/Scheduler.java b/activemq-core/src/main/java/org/apache/activemq/thread/Scheduler.java
index cec9a5d..21f81ab 100755
--- a/activemq-core/src/main/java/org/apache/activemq/thread/Scheduler.java
+++ b/activemq-core/src/main/java/org/apache/activemq/thread/Scheduler.java
@@ -51,7 +51,7 @@
     synchronized static public void cancel(Runnable task) {
         ScheduledFuture ticket = (ScheduledFuture) clockTickets.remove(task);
         if( ticket!=null ) {
-            ticket.cancel(true);
+            ticket.cancel(false);
         	clockDaemon.remove(task);
         }
     }
