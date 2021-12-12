diff --git a/jetty-io/src/main/java/org/eclipse/jetty/io/nio/SelectChannelEndPoint.java b/jetty-io/src/main/java/org/eclipse/jetty/io/nio/SelectChannelEndPoint.java
index b7b2108..b24ebd8 100644
--- a/jetty-io/src/main/java/org/eclipse/jetty/io/nio/SelectChannelEndPoint.java
+++ b/jetty-io/src/main/java/org/eclipse/jetty/io/nio/SelectChannelEndPoint.java
@@ -385,7 +385,7 @@
                     try
                     {
                         updateKey();
-                        this.wait(timeoutMs>=0?(end-now):10000);
+                        this.wait(timeoutMs>0?(end-now):10000);
                     }
                     catch (InterruptedException e)
                     {
@@ -433,7 +433,7 @@
                     try
                     {
                         updateKey();
-                        this.wait(timeoutMs>=0?(end-now):10000);
+                        this.wait(timeoutMs>0?(end-now):10000);
                     }
                     catch (InterruptedException e)
                     {
@@ -462,7 +462,7 @@
      */
     public void scheduleWrite()
     {
-        if (_writable==true)
+        if (_writable)
             LOG.debug("Required scheduleWrite {}",this);
 
         _writable=false;
