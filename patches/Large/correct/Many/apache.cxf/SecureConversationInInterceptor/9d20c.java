diff --git a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/policy/interceptors/SecureConversationInInterceptor.java b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/policy/interceptors/SecureConversationInInterceptor.java
index 878e991..e01fee9 100644
--- a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/policy/interceptors/SecureConversationInInterceptor.java
+++ b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/policy/interceptors/SecureConversationInInterceptor.java
@@ -462,7 +462,7 @@
                         SecurityContextToken tok
                             = (SecurityContextToken)wser
                                 .get(WSSecurityEngineResult.TAG_SECURITY_CONTEXT_TOKEN);
-                        message.getExchange().put(SecurityConstants.TOKEN_ID, tok.getID());
+                        message.getExchange().put(SecurityConstants.TOKEN_ID, tok.getIdentifier());
                         found = true;
                     }
                 }
