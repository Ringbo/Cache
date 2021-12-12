diff --git a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler.java b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler.java
index 62cc01c..779407a 100644
--- a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler.java
+++ b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractStaxBindingHandler.java
@@ -179,7 +179,7 @@
         private final String username;
         private final String password;
         
-        public UTCallbackHandler(String username, String password) {
+        UTCallbackHandler(String username, String password) {
             this.username = username;
             this.password = password;
         }
