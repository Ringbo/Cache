diff --git a/src/net/java/sip/communicator/plugin/gibberishaccregwizz/GibberishAccRegWizzActivator.java b/src/net/java/sip/communicator/plugin/gibberishaccregwizz/GibberishAccRegWizzActivator.java
index 1e8f924..19a659a 100644
--- a/src/net/java/sip/communicator/plugin/gibberishaccregwizz/GibberishAccRegWizzActivator.java
+++ b/src/net/java/sip/communicator/plugin/gibberishaccregwizz/GibberishAccRegWizzActivator.java
@@ -67,9 +67,9 @@
      * Called when this bundle is stopped so the Framework can perform the
      * bundle-specific activities necessary to stop the bundle.
      *
-     * @param context The execution context of the bundle being stopped.
+     * @param bundleContext The execution context of the bundle being stopped.
      */
-    public void stop(BundleContext bundleContext) throws Exception
+    public void stop(BundleContext bundleContext)
     {
         wizardContainer.removeAccountRegistrationWizard(gibberishWizard);
     }
