diff --git a/support/cas-server-support-interrupt-webflow/src/test/java/org/apereo/cas/interrupt/webflow/InterruptSingleSignOnParticipationStrategyTests.java b/support/cas-server-support-interrupt-webflow/src/test/java/org/apereo/cas/interrupt/webflow/InterruptSingleSignOnParticipationStrategyTests.java
index 0b898c7..90473fe 100644
--- a/support/cas-server-support-interrupt-webflow/src/test/java/org/apereo/cas/interrupt/webflow/InterruptSingleSignOnParticipationStrategyTests.java
+++ b/support/cas-server-support-interrupt-webflow/src/test/java/org/apereo/cas/interrupt/webflow/InterruptSingleSignOnParticipationStrategyTests.java
@@ -22,14 +22,14 @@
     @Test
     public void verifyStrategyWithoutInterrupt() {
         final InterruptSingleSignOnParticipationStrategy s =
-            new InterruptSingleSignOnParticipationStrategy(mock(ServicesManager.class), true);
+            new InterruptSingleSignOnParticipationStrategy(mock(ServicesManager.class), true, true);
         assertTrue(s.isParticipating(new MockRequestContext()));
     }
 
     @Test
     public void verifyStrategyWithInterruptDisabled() {
         final InterruptSingleSignOnParticipationStrategy s =
-            new InterruptSingleSignOnParticipationStrategy(mock(ServicesManager.class), true);
+            new InterruptSingleSignOnParticipationStrategy(mock(ServicesManager.class), true, true);
         final MockRequestContext ctx = new MockRequestContext();
         final InterruptResponse response = new InterruptResponse();
         response.setSsoEnabled(false);
