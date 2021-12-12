diff --git a/logback-core/src/main/java/ch/qos/logback/core/util/ContextUtil.java b/logback-core/src/main/java/ch/qos/logback/core/util/ContextUtil.java
index 8fd2065..c42e562 100644
--- a/logback-core/src/main/java/ch/qos/logback/core/util/ContextUtil.java
+++ b/logback-core/src/main/java/ch/qos/logback/core/util/ContextUtil.java
@@ -28,7 +28,7 @@
     setContext(context);
   }
 
-  static String getLocalHostName() throws UnknownHostException {
+  public static String getLocalHostName() throws UnknownHostException {
     InetAddress localhost = InetAddress.getLocalHost();
     return localhost.getHostName();
   }
