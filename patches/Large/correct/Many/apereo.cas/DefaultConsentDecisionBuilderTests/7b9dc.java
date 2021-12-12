diff --git a/support/cas-server-support-consent-core/src/test/java/org/apereo/cas/consent/DefaultConsentDecisionBuilderTests.java b/support/cas-server-support-consent-core/src/test/java/org/apereo/cas/consent/DefaultConsentDecisionBuilderTests.java
index cd6d3b0..fab5d3b 100644
--- a/support/cas-server-support-consent-core/src/test/java/org/apereo/cas/consent/DefaultConsentDecisionBuilderTests.java
+++ b/support/cas-server-support-consent-core/src/test/java/org/apereo/cas/consent/DefaultConsentDecisionBuilderTests.java
@@ -41,7 +41,7 @@
     public void verifyNewConsentDecision() {
         final ConsentDecision consentDecision = getConsentDecision();
         assertNotNull(consentDecision);
-        assertEquals(consentDecision.getPrincipal(), "casuser");
+        assertEquals("casuser", consentDecision.getPrincipal());
         assertEquals(consentDecision.getService(), RegisteredServiceTestUtils.getService().getId());    
     }
 
