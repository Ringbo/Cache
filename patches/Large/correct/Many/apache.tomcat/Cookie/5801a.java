diff --git a/java/org/apache/tomcat/util/http/parser/Cookie.java b/java/org/apache/tomcat/util/http/parser/Cookie.java
index 9fef3f7..46bf4a0 100644
--- a/java/org/apache/tomcat/util/http/parser/Cookie.java
+++ b/java/org/apache/tomcat/util/http/parser/Cookie.java
@@ -205,7 +205,7 @@
 
     private static void skipUntilSemiColon(ByteBuffer bb) {
         while(bb.hasRemaining()) {
-            if (bb.get() == EQUALS_BYTE) {
+            if (bb.get() == SEMICOLON_BYTE) {
                 break;
             }
         }
@@ -333,7 +333,7 @@
     private static void logInvalidHeader(ByteBuffer bb) {
         UserDataHelper.Mode logMode = invalidCookieLog.getNextMode();
         if (logMode != null) {
-            String headerValue = new String(bb.array(), bb.position(), bb.limit(),
+            String headerValue = new String(bb.array(), bb.position(), bb.limit() - bb.position(),
                         StandardCharsets.UTF_8);
             String message = sm.getString("cookie.invalidCookieValue", headerValue);
             switch (logMode) {
