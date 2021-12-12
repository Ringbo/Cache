diff --git a/sonar-ws-client/src/main/java/org/sonar/wsclient/JdkUtils.java b/sonar-ws-client/src/main/java/org/sonar/wsclient/JdkUtils.java
index 3643750..b0e55b1 100644
--- a/sonar-ws-client/src/main/java/org/sonar/wsclient/JdkUtils.java
+++ b/sonar-ws-client/src/main/java/org/sonar/wsclient/JdkUtils.java
@@ -45,7 +45,7 @@
       return URLEncoder.encode(url, "UTF-8");
 
     } catch (UnsupportedEncodingException e) {
-      throw new RuntimeException(e);
+      throw new IllegalStateException(e);
     }
   }
 
