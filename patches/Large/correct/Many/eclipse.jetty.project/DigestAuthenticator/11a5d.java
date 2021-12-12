diff --git a/jetty-security/src/main/java/org/eclipse/jetty/security/authentication/DigestAuthenticator.java b/jetty-security/src/main/java/org/eclipse/jetty/security/authentication/DigestAuthenticator.java
index cef675d..9768b41 100644
--- a/jetty-security/src/main/java/org/eclipse/jetty/security/authentication/DigestAuthenticator.java
+++ b/jetty-security/src/main/java/org/eclipse/jetty/security/authentication/DigestAuthenticator.java
@@ -62,7 +62,7 @@
 
     public Authentication validateRequest(ServletRequest req, ServletResponse res, boolean mandatory) throws ServerAuthException
     {
-        if (mandatory)
+        if (!mandatory)
             return _deferred;
         
         HttpServletRequest request = (HttpServletRequest)req;
@@ -114,8 +114,9 @@
                                     digest.qop = tok;
                                 else if ("uri".equalsIgnoreCase(name))
                                     digest.uri = tok;
-                                else if ("response".equalsIgnoreCase(name)) digest.response = tok;
-                                break;
+                                else if ("response".equalsIgnoreCase(name)) 
+                                    digest.response = tok;
+                                name=null;
                             }
                     }
                 }
