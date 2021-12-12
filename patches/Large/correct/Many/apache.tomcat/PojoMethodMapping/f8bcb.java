diff --git a/java/org/apache/tomcat/websocket/pojo/PojoMethodMapping.java b/java/org/apache/tomcat/websocket/pojo/PojoMethodMapping.java
index c530dd0..665e203 100644
--- a/java/org/apache/tomcat/websocket/pojo/PojoMethodMapping.java
+++ b/java/org/apache/tomcat/websocket/pojo/PojoMethodMapping.java
@@ -212,7 +212,7 @@
         if (isOnError && !foundThrowable) {
             throw new IllegalArgumentException(sm.getString(
                     "pojoMethodMapping.onErrorNoThrowable",
-                    m.getName(), m.getClass().getName()));
+                    m.getName(), m.getDeclaringClass().getName()));
         }
         return result;
     }
@@ -314,7 +314,7 @@
                     } else {
                         throw new IllegalArgumentException(sm.getString(
                                 "pojoMethodMapping.duplicateMessageParam",
-                                m.getName(), m.getClass().getName()));
+                                m.getName(), m.getDeclaringClass().getName()));
                     }
                 } else if (types[i] == Reader.class) {
                     if (indexReader == -1) {
@@ -322,7 +322,7 @@
                     } else {
                         throw new IllegalArgumentException(sm.getString(
                                 "pojoMethodMapping.duplicateMessageParam",
-                                m.getName(), m.getClass().getName()));
+                                m.getName(), m.getDeclaringClass().getName()));
                     }
                 } else if (types[i] == boolean.class) {
                     if (indexBoolean == -1) {
@@ -330,7 +330,7 @@
                     } else {
                         throw new IllegalArgumentException(sm.getString(
                                 "pojoMethodMapping.duplicateLastParam",
-                                m.getName(), m.getClass().getName()));
+                                m.getName(), m.getDeclaringClass().getName()));
                     }
                 } else if (types[i] == ByteBuffer.class) {
                     if (indexByteBuffer == -1) {
@@ -338,7 +338,7 @@
                     } else {
                         throw new IllegalArgumentException(sm.getString(
                                 "pojoMethodMapping.duplicateMessageParam",
-                                m.getName(), m.getClass().getName()));
+                                m.getName(), m.getDeclaringClass().getName()));
                     }
                 } else if (types[i] == byte[].class) {
                     if (indexByteArray == -1) {
@@ -346,7 +346,7 @@
                     } else {
                         throw new IllegalArgumentException(sm.getString(
                                 "pojoMethodMapping.duplicateMessageParam",
-                                m.getName(), m.getClass().getName()));
+                                m.getName(), m.getDeclaringClass().getName()));
                     }
                 } else if (types[i] == InputStream.class) {
                     if (indexInputStream == -1) {
@@ -354,7 +354,7 @@
                     } else {
                         throw new IllegalArgumentException(sm.getString(
                                 "pojoMethodMapping.duplicateMessageParam",
-                                m.getName(), m.getClass().getName()));
+                                m.getName(), m.getDeclaringClass().getName()));
                     }
                 } else if (types[i] == Session.class) {
                     if (indexSession == -1) {
@@ -362,7 +362,7 @@
                     } else {
                         throw new IllegalArgumentException(sm.getString(
                                 "pojoMethodMapping.duplicateSessionParam",
-                                m.getName(), m.getClass().getName()));
+                                m.getName(), m.getDeclaringClass().getName()));
                     }
                 } else if (types[i] == PongMessage.class) {
                     if (indexPong == -1) {
@@ -370,7 +370,7 @@
                     } else {
                         throw new IllegalArgumentException(sm.getString(
                                 "pojoMethodMapping.duplicatePongMessageParam",
-                                m.getName(), m.getClass().getName()));
+                                m.getName(), m.getDeclaringClass().getName()));
                     }
                 } else {
                     for (DecoderEntry decoderEntry : decoderEntries) {
@@ -385,7 +385,7 @@
                                 } else {
                                     throw new IllegalArgumentException(sm.getString(
                                             "pojoMethodMapping.duplicateMessageParam",
-                                            m.getName(), m.getClass().getName()));
+                                            m.getName(), m.getDeclaringClass().getName()));
                                 }
                                 break;
                             } else {
@@ -394,7 +394,7 @@
                                 } else {
                                     throw new IllegalArgumentException(sm.getString(
                                             "pojoMethodMapping.duplicateMessageParam",
-                                            m.getName(), m.getClass().getName()));
+                                            m.getName(), m.getDeclaringClass().getName()));
                                 }
                             }
                         }
@@ -409,7 +409,7 @@
                 if (indexPayload != -1) {
                     throw new IllegalArgumentException(sm.getString(
                             "pojoMethodMapping.duplicateMessageParam",
-                            m.getName(), m.getClass().getName()));
+                            m.getName(), m.getDeclaringClass().getName()));
                 } else {
                     indexPayload = indexReader;
                 }
@@ -418,7 +418,7 @@
                 if (indexPayload != -1) {
                     throw new IllegalArgumentException(sm.getString(
                             "pojoMethodMapping.duplicateMessageParam",
-                            m.getName(), m.getClass().getName()));
+                            m.getName(), m.getDeclaringClass().getName()));
                 } else {
                     indexPayload = indexByteArray;
                 }
@@ -427,7 +427,7 @@
                 if (indexPayload != -1) {
                     throw new IllegalArgumentException(sm.getString(
                             "pojoMethodMapping.duplicateMessageParam",
-                            m.getName(), m.getClass().getName()));
+                            m.getName(), m.getDeclaringClass().getName()));
                 } else {
                     indexPayload = indexByteBuffer;
                 }
@@ -436,7 +436,7 @@
                 if (indexPayload != -1) {
                     throw new IllegalArgumentException(sm.getString(
                             "pojoMethodMapping.duplicateMessageParam",
-                            m.getName(), m.getClass().getName()));
+                            m.getName(), m.getDeclaringClass().getName()));
                 } else {
                     indexPayload = indexInputStream;
                 }
@@ -445,7 +445,7 @@
                 if (indexPayload != -1) {
                     throw new IllegalArgumentException(sm.getString(
                             "pojoMethodMapping.pongWithPayload",
-                            m.getName(), m.getClass().getName()));
+                            m.getName(), m.getDeclaringClass().getName()));
                 } else {
                     indexPayload = indexPong;
                 }
@@ -453,22 +453,22 @@
             if (indexPayload == -1) {
                 throw new IllegalArgumentException(sm.getString(
                         "pojoMethodMapping.noPayload",
-                        m.getName(), m.getClass().getName()));
+                        m.getName(), m.getDeclaringClass().getName()));
             }
             if (indexPong != -1 && indexBoolean != -1) {
                 throw new IllegalArgumentException(sm.getString(
                         "pojoMethodMapping.partialPong",
-                        m.getName(), m.getClass().getName()));
+                        m.getName(), m.getDeclaringClass().getName()));
             }
             if(indexReader != -1 && indexBoolean != -1) {
                 throw new IllegalArgumentException(sm.getString(
                         "pojoMethodMapping.partialReader",
-                        m.getName(), m.getClass().getName()));
+                        m.getName(), m.getDeclaringClass().getName()));
             }
             if(indexInputStream != -1 && indexBoolean != -1) {
                 throw new IllegalArgumentException(sm.getString(
                         "pojoMethodMapping.partialInputStream",
-                        m.getName(), m.getClass().getName()));
+                        m.getName(), m.getDeclaringClass().getName()));
             }
         }
 
