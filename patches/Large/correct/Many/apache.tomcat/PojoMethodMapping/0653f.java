diff --git a/java/org/apache/tomcat/websocket/pojo/PojoMethodMapping.java b/java/org/apache/tomcat/websocket/pojo/PojoMethodMapping.java
index 1c75d49..6729ff2 100644
--- a/java/org/apache/tomcat/websocket/pojo/PojoMethodMapping.java
+++ b/java/org/apache/tomcat/websocket/pojo/PojoMethodMapping.java
@@ -375,7 +375,7 @@
                                 m.getName(), m.getDeclaringClass().getName()));
                     }
                 } else {
-                    if (decoderMatch != null || decoderMatch.hasMatches()) {
+                    if (decoderMatch != null && decoderMatch.hasMatches()) {
                         throw new IllegalArgumentException(sm.getString(
                                 "pojoMethodMapping.duplicateMessageParam",
                                 m.getName(), m.getDeclaringClass().getName()));
