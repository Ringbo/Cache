diff --git a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/PolicyBasedWSS4JInInterceptor.java b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/PolicyBasedWSS4JInInterceptor.java
index 7d36b1b..aaa3431 100644
--- a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/PolicyBasedWSS4JInInterceptor.java
+++ b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/wss4j/PolicyBasedWSS4JInInterceptor.java
@@ -477,7 +477,7 @@
                         || prots == Protections.SIGN_ENCRYPT) {
                         ai.setNotAsserted("Not encrypted before signed and then protected");
                     }
-                } else if (prots != Protections.SIGN_ENCRYPT) {
+                } else if (prots == Protections.SIGN_ENCRYPT) {
                     ai.setNotAsserted("Not encrypted before signed");                    
                 }
             } else if (prots == Protections.ENCRYPT_SIGN) {
