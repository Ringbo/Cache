diff --git a/java/org/apache/catalina/startup/ContextConfig.java b/java/org/apache/catalina/startup/ContextConfig.java
index 8f02b64..71dfd16 100644
--- a/java/org/apache/catalina/startup/ContextConfig.java
+++ b/java/org/apache/catalina/startup/ContextConfig.java
@@ -1493,7 +1493,7 @@
                         uc.getInputStream().close();
                     } catch (IOException e) {
                         ExceptionUtils.handleThrowable(e);
-                        globalTimeStamp = -1;
+                        hostTimeStamp = -1;
                     }
                 }
             }
