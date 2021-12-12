diff --git a/jetty-server/src/main/java/org/eclipse/jetty/server/HttpConnection.java b/jetty-server/src/main/java/org/eclipse/jetty/server/HttpConnection.java
index 6011d7e..b7f5163 100644
--- a/jetty-server/src/main/java/org/eclipse/jetty/server/HttpConnection.java
+++ b/jetty-server/src/main/java/org/eclipse/jetty/server/HttpConnection.java
@@ -564,7 +564,15 @@
 
     public void blockingReadFillInterested()
     {
-        getEndPoint().fillInterested(_blockingReadCallback);
+        // We try fillInterested here because of SSL and 
+        // spurious wakeups.  With  blocking reads, we read in a loop
+        // that tries to read/parse content and blocks waiting if there is
+        // none available.  The loop can be woken up by incoming encrypted 
+        // bytes, which due to SSL might not produce any decrypted bytes.
+        // Thus the loop needs to register fill interest again.  However if 
+        // the loop is woken up spuriously, then the register interest again
+        // can result in a pending read exception, unless we use tryFillInterested.
+        getEndPoint().tryFillInterested(_blockingReadCallback);
     }
 
     public void blockingReadFailure(Throwable e)
