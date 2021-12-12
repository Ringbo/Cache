diff --git a/logback-core/src/main/java/ch/qos/logback/core/net/SocketAppenderBase.java b/logback-core/src/main/java/ch/qos/logback/core/net/SocketAppenderBase.java
index f082265..842f3ae 100644
--- a/logback-core/src/main/java/ch/qos/logback/core/net/SocketAppenderBase.java
+++ b/logback-core/src/main/java/ch/qos/logback/core/net/SocketAppenderBase.java
@@ -133,7 +133,7 @@
         msg += " We will try again later.";
         fireConnector(); // fire the connector thread
       }
-      addError(msg, e);
+      addWarn(msg, e);
     }
   }
 
