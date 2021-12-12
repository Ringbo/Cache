diff --git a/handler/src/test/java/io/netty/handler/ssl/OpenSslErrorStackAssertSSLEngine.java b/handler/src/test/java/io/netty/handler/ssl/OpenSslErrorStackAssertSSLEngine.java
index 8d43612..af71f72 100644
--- a/handler/src/test/java/io/netty/handler/ssl/OpenSslErrorStackAssertSSLEngine.java
+++ b/handler/src/test/java/io/netty/handler/ssl/OpenSslErrorStackAssertSSLEngine.java
@@ -416,7 +416,7 @@
 
     @Override
     public boolean release(int decrement) {
-        return getWrappedEngine().release();
+        return getWrappedEngine().release(decrement);
     }
 
     @Override
