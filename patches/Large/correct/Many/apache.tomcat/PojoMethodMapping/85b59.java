diff --git a/java/org/apache/tomcat/websocket/PojoMethodMapping.java b/java/org/apache/tomcat/websocket/PojoMethodMapping.java
index 492e363..f86f4bc 100644
--- a/java/org/apache/tomcat/websocket/PojoMethodMapping.java
+++ b/java/org/apache/tomcat/websocket/PojoMethodMapping.java
@@ -383,16 +383,16 @@
                 // ASync
                 if (indexString != -1) {
                     mh = new PojoMessageHandlerAsyncString(pojo, m, session,
-                            params, indexString, false, indexSession,
-                            indexBoolean);
+                            params, indexString, false, indexBoolean,
+                            indexSession);
                 } else if (indexByteArray != -1) {
                     mh = new PojoMessageHandlerAsyncBinary(pojo, m, session,
-                            params, indexByteArray, true, indexSession,
-                            indexBoolean);
+                            params, indexByteArray, true, indexBoolean,
+                            indexSession);
                 } else {
                     mh = new PojoMessageHandlerAsyncBinary(pojo, m, session,
-                            params, indexByteBuffer, false, indexSession,
-                            indexBoolean);
+                            params, indexByteBuffer, false, indexBoolean,
+                            indexSession);
                 }
             }
             return mh;
