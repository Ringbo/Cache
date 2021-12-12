diff --git a/presto-jdbc/src/main/java/com/facebook/presto/jdbc/PrestoDriverUri.java b/presto-jdbc/src/main/java/com/facebook/presto/jdbc/PrestoDriverUri.java
index 3590804..f56ec18 100644
--- a/presto-jdbc/src/main/java/com/facebook/presto/jdbc/PrestoDriverUri.java
+++ b/presto-jdbc/src/main/java/com/facebook/presto/jdbc/PrestoDriverUri.java
@@ -126,7 +126,7 @@
 
         return uriBuilder()
                 .scheme(scheme)
-                .host(address.getHostText()).port(address.getPort())
+                .host(address.getHost()).port(address.getPort())
                 .build();
     }
 
