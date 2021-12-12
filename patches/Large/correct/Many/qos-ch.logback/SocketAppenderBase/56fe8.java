diff --git a/logback-core/src/main/java/ch/qos/logback/core/net/SocketAppenderBase.java b/logback-core/src/main/java/ch/qos/logback/core/net/SocketAppenderBase.java
index 842b9d8..6b2fb5c 100644
--- a/logback-core/src/main/java/ch/qos/logback/core/net/SocketAppenderBase.java
+++ b/logback-core/src/main/java/ch/qos/logback/core/net/SocketAppenderBase.java
@@ -136,7 +136,7 @@
         msg += " We will try again later.";
         fireConnector(); // fire the connector thread
       }
-      addWarn(msg, e);
+      addInfo(msg, e);
     }
   }
 
