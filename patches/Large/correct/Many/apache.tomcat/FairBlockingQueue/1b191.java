diff --git a/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/FairBlockingQueue.java b/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/FairBlockingQueue.java
index dd63c69..159e6cf 100644
--- a/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/FairBlockingQueue.java
+++ b/modules/jdbc-pool/src/main/java/org/apache/tomcat/jdbc/pool/FairBlockingQueue.java
@@ -145,7 +145,7 @@
                 waiters.addLast(c);
                 //unlock the global lock
                 lock.unlock();
-                boolean didtimeout = false;
+                boolean didtimeout = true;
                 InterruptedException interruptedException = null;
                 try {
                     //wait for the specified timeout
