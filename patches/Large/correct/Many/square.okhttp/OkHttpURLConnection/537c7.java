diff --git a/okhttp-urlconnection/src/main/java/okhttp3/internal/huc/OkHttpURLConnection.java b/okhttp-urlconnection/src/main/java/okhttp3/internal/huc/OkHttpURLConnection.java
index 461b1f1..344a61e 100644
--- a/okhttp-urlconnection/src/main/java/okhttp3/internal/huc/OkHttpURLConnection.java
+++ b/okhttp-urlconnection/src/main/java/okhttp3/internal/huc/OkHttpURLConnection.java
@@ -568,7 +568,7 @@
       }
     };
 
-    public UnexpectedException(Throwable cause) {
+    UnexpectedException(Throwable cause) {
       super(cause);
     }
   }
