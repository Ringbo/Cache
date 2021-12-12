diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPHC3Impl.java b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPHC3Impl.java
index 35e6873..4ef3668 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPHC3Impl.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPHC3Impl.java
@@ -100,7 +100,7 @@
 
     private static final String HTTP_AUTHENTICATION_PREEMPTIVE = "http.authentication.preemptive"; // $NON-NLS-1$
 
-    private static final boolean canSetPreEmptive; // OK to set pre-emptive auth?
+    private static final boolean CAN_SET_PREEMPTIVE; // OK to set pre-emptive auth?
 
     private static final ThreadLocal<Map<HostConfiguration, HttpClient>> httpClients = 
         new ThreadLocal<Map<HostConfiguration, HttpClient>>(){
@@ -144,7 +144,7 @@
 
         // If the pre-emptive parameter is undefined, then we can set it as needed
         // otherwise we should do what the user requested.
-        canSetPreEmptive =  params.getParameter(HTTP_AUTHENTICATION_PREEMPTIVE) == null;
+        CAN_SET_PREEMPTIVE =  params.getParameter(HTTP_AUTHENTICATION_PREEMPTIVE) == null;
 
         // Handle old-style JMeter properties
         try {
@@ -493,7 +493,7 @@
             if (user.length() > 0){
                 httpClient.getState().setProxyCredentials(
                         new AuthScope(proxyHost,proxyPort,null,AuthScope.ANY_SCHEME),
-                        new NTCredentials(user,getProxyPass(),localHost,PROXY_DOMAIN)
+                        new NTCredentials(user,getProxyPass(),LOCALHOST,PROXY_DOMAIN)
                     );
             } else {
                 httpClient.getState().clearProxyCredentials();
@@ -503,7 +503,7 @@
                 if (PROXY_USER.length() > 0){
                     httpClient.getState().setProxyCredentials(
                         new AuthScope(PROXY_HOST,PROXY_PORT,null,AuthScope.ANY_SCHEME),
-                        new NTCredentials(PROXY_USER,PROXY_PASS,localHost,PROXY_DOMAIN)
+                        new NTCredentials(PROXY_USER,PROXY_PASS,LOCALHOST,PROXY_DOMAIN)
                     );
                 }
             } else {
@@ -699,17 +699,17 @@
                             new NTCredentials(
                                     username,
                                     auth.getPass(),
-                                    localHost,
+                                    LOCALHOST,
                                     domain
                             ));
                     // We have credentials - should we set pre-emptive authentication?
-                    if (canSetPreEmptive){
+                    if (CAN_SET_PREEMPTIVE){
                         log.debug("Setting Pre-emptive authentication");
                         params.setAuthenticationPreemptive(true);
                     }
             } else {
                 state.clearCredentials();
-                if (canSetPreEmptive){
+                if (CAN_SET_PREEMPTIVE){
                     params.setAuthenticationPreemptive(false);
                 }
             }
