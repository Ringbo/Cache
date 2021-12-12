diff --git a/java/org/apache/tomcat/websocket/pojo/PojoMethodMapping.java b/java/org/apache/tomcat/websocket/pojo/PojoMethodMapping.java
index 823ef85..71279f2 100644
--- a/java/org/apache/tomcat/websocket/pojo/PojoMethodMapping.java
+++ b/java/org/apache/tomcat/websocket/pojo/PojoMethodMapping.java
@@ -202,8 +202,9 @@
             }
         }
         if (!foundThrowable) {
-            // TODO i18n
-            throw new IllegalArgumentException();
+            throw new IllegalArgumentException(sm.getString(
+                    "pojoMethodMapping.onErrorNoThrowable",
+                    m.getName(), m.getClass().getName()));
         }
         return result;
     }
@@ -254,8 +255,8 @@
         } else if (type.equals(short.class) || type.equals(Short.class)) {
             return Short.valueOf(value);
         } else {
-            // TODO
-            throw new IllegalArgumentException();
+            throw new IllegalArgumentException(sm.getString(
+                    "pojoMethodMapping.invalidType", value, type.getName()));
         }
     }
 
@@ -298,43 +299,49 @@
                     if (indexString == -1) {
                         indexString = i;
                     } else {
-                        // TODO i18n
-                        throw new IllegalArgumentException();
+                        throw new IllegalArgumentException(sm.getString(
+                                "pojoMethodMapping.duplicateMessageParam",
+                                m.getName(), m.getClass().getName()));
                     }
                 } else if (types[i] == boolean.class) {
                     if (indexBoolean == -1) {
                         indexBoolean = i;
                     } else {
-                        // TODO i18n
-                        throw new IllegalArgumentException();
+                        throw new IllegalArgumentException(sm.getString(
+                                "pojoMethodMapping.duplicateLastParam",
+                                m.getName(), m.getClass().getName()));
                     }
                 } else if (types[i] == ByteBuffer.class) {
                     if (indexByteBuffer == -1) {
                         indexByteBuffer = i;
                     } else {
-                        // TODO i18n
-                        throw new IllegalArgumentException();
+                        throw new IllegalArgumentException(sm.getString(
+                                "pojoMethodMapping.duplicateMessageParam",
+                                m.getName(), m.getClass().getName()));
                     }
                 } else if (types[i] == byte[].class) {
                     if (indexByteArray == -1) {
                         indexByteArray = i;
                     } else {
-                        // TODO i18n
-                        throw new IllegalArgumentException();
+                        throw new IllegalArgumentException(sm.getString(
+                                "pojoMethodMapping.duplicateMessageParam",
+                                m.getName(), m.getClass().getName()));
                     }
                 } else if (types[i] == Session.class) {
                     if (indexSession == -1) {
                         indexSession = i;
                     } else {
-                        // TODO i18n
-                        throw new IllegalArgumentException();
+                        throw new IllegalArgumentException(sm.getString(
+                                "pojoMethodMapping.duplicateSessionParam",
+                                m.getName(), m.getClass().getName()));
                     }
                 } else if (types[i] == PongMessage.class) {
                     if (indexPong == -1) {
                         indexPong = i;
                     } else {
-                        // TODO i18n
-                        throw new IllegalArgumentException();
+                        throw new IllegalArgumentException(sm.getString(
+                                "pojoMethodMapping.duplicatePongMessageParam",
+                                m.getName(), m.getClass().getName()));
                     }
                 } else {
                     for (DecoderEntry decoderEntry : decoderEntries) {
@@ -347,16 +354,18 @@
                                 if (indexByteBuffer == -1) {
                                     indexByteBuffer = i;
                                 } else {
-                                    // TODO i18n
-                                    throw new IllegalArgumentException();
+                                    throw new IllegalArgumentException(sm.getString(
+                                            "pojoMethodMapping.duplicateMessageParam",
+                                            m.getName(), m.getClass().getName()));
                                 }
                                 break;
                             } else {
                                 if (indexString == -1) {
                                     indexString = i;
                                 } else {
-                                    // TODO i18n
-                                    throw new IllegalArgumentException();
+                                    throw new IllegalArgumentException(sm.getString(
+                                            "pojoMethodMapping.duplicateMessageParam",
+                                            m.getName(), m.getClass().getName()));
                                 }
                             }
                         }
@@ -369,35 +378,40 @@
             }
             if (indexByteArray != -1) {
                 if (indexPayload != -1) {
-                    // TODO i18n
-                    throw new IllegalArgumentException();
+                    throw new IllegalArgumentException(sm.getString(
+                            "pojoMethodMapping.duplicateMessageParam",
+                            m.getName(), m.getClass().getName()));
                 } else {
                     indexPayload = indexByteArray;
                 }
             }
             if (indexByteBuffer != -1) {
                 if (indexPayload != -1) {
-                    // TODO i18n
-                    throw new IllegalArgumentException();
+                    throw new IllegalArgumentException(sm.getString(
+                            "pojoMethodMapping.duplicateMessageParam",
+                            m.getName(), m.getClass().getName()));
                 } else {
                     indexPayload = indexByteBuffer;
                 }
             }
             if (indexPong != -1) {
                 if (indexPayload != -1) {
-                    // TODO i18n
-                    throw new IllegalArgumentException();
+                    throw new IllegalArgumentException(sm.getString(
+                            "pojoMethodMapping.pongWithPayload",
+                            m.getName(), m.getClass().getName()));
                 } else {
                     indexPayload = indexPong;
                 }
             }
             if (indexPayload == -1) {
-                // TODO i18n
-                throw new IllegalArgumentException();
+                throw new IllegalArgumentException(sm.getString(
+                        "pojoMethodMapping.noPayload",
+                        m.getName(), m.getClass().getName()));
             }
             if (indexPong != -1 && indexBoolean != -1) {
-                // TODO i18n
-                throw new IllegalArgumentException();
+                throw new IllegalArgumentException(sm.getString(
+                        "pojoMethodMapping.partialPong",
+                        m.getName(), m.getClass().getName()));
             }
         }
 
