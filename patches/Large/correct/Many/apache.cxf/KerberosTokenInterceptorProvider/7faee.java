diff --git a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/policy/interceptors/KerberosTokenInterceptorProvider.java b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/policy/interceptors/KerberosTokenInterceptorProvider.java
index 823c4be..e64f510 100644
--- a/rt/ws/security/src/main/java/org/apache/cxf/ws/security/policy/interceptors/KerberosTokenInterceptorProvider.java
+++ b/rt/ws/security/src/main/java/org/apache/cxf/ws/security/policy/interceptors/KerberosTokenInterceptorProvider.java
@@ -98,7 +98,7 @@
     }
     
     static class KerberosTokenOutInterceptor extends AbstractPhaseInterceptor<Message> {
-        public KerberosTokenOutInterceptor() {
+        KerberosTokenOutInterceptor() {
             super(Phase.PREPARE_SEND);
         }
         public void handleMessage(Message message) throws Fault {
@@ -152,7 +152,7 @@
     }
     
     static class KerberosTokenDOMInInterceptor extends AbstractPhaseInterceptor<Message> {
-        public KerberosTokenDOMInInterceptor() {
+        KerberosTokenDOMInInterceptor() {
             super(Phase.PRE_PROTOCOL);
             addAfter(WSS4JInInterceptor.class.getName());
             addAfter(PolicyBasedWSS4JInInterceptor.class.getName());
@@ -215,7 +215,7 @@
         private static final Logger LOG = 
             LogUtils.getL7dLogger(KerberosTokenStaxInInterceptor.class);
         
-        public KerberosTokenStaxInInterceptor() {
+        KerberosTokenStaxInInterceptor() {
             super(Phase.PRE_PROTOCOL);
             getBefore().add(StaxSecurityContextInInterceptor.class.getName());
         }
