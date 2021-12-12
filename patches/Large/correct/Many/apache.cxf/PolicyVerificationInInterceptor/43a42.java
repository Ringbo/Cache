diff --git a/rt/ws/policy/src/main/java/org/apache/cxf/ws/policy/PolicyVerificationInInterceptor.java b/rt/ws/policy/src/main/java/org/apache/cxf/ws/policy/PolicyVerificationInInterceptor.java
index a8f9ca9..f2fedd8 100644
--- a/rt/ws/policy/src/main/java/org/apache/cxf/ws/policy/PolicyVerificationInInterceptor.java
+++ b/rt/ws/policy/src/main/java/org/apache/cxf/ws/policy/PolicyVerificationInInterceptor.java
@@ -104,7 +104,7 @@
                 message.getExchange().put("ws-policy.validated.alternatives", usedAlternatives);
             }
         } catch (PolicyException ex) {
-            LOG.log(Level.SEVERE, "Inbound policy verification failed: " + ex.getMessage(), e);
+            LOG.log(Level.SEVERE, "Inbound policy verification failed: " + ex.getMessage());
             //To check if there is ws addressing policy violation and throw WSA specific 
             //exception to pass jaxws2.2 tests
             if (ex.getMessage().indexOf("Addressing") > -1) {
