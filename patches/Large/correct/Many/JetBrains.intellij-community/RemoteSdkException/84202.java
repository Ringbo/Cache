diff --git a/platform/platform-impl/src/com/intellij/remote/RemoteSdkException.java b/platform/platform-impl/src/com/intellij/remote/RemoteSdkException.java
index 113b1b8..17b1e46 100644
--- a/platform/platform-impl/src/com/intellij/remote/RemoteSdkException.java
+++ b/platform/platform-impl/src/com/intellij/remote/RemoteSdkException.java
@@ -25,7 +25,7 @@
         return;
       }
 
-      t = throwable.getCause();
+      t = t.getCause();
     }
     myNoRouteToHost = false;
     myCause = throwable;
