diff --git a/java/org/apache/tomcat/util/threads/TaskQueue.java b/java/org/apache/tomcat/util/threads/TaskQueue.java
index 2ba8763..d61cf26 100644
--- a/java/org/apache/tomcat/util/threads/TaskQueue.java
+++ b/java/org/apache/tomcat/util/threads/TaskQueue.java
@@ -71,7 +71,7 @@
         //we are maxed out on threads, simply queue the object
         if (parent.getPoolSize() == parent.getMaximumPoolSize()) return super.offer(o);
         //we have idle threads, just add it to the queue
-        if (parent.getSubmittedCount()<(parent.getPoolSize())) return super.offer(o);
+        if (parent.getSubmittedCount()<=(parent.getPoolSize())) return super.offer(o);
         //if we have less threads than maximum force creation of a new thread
         if (parent.getPoolSize()<parent.getMaximumPoolSize()) return false;
         //if we reached here, we need to add it to the queue
