diff --git a/src/java/org/jivesoftware/openfire/pep/PEPService.java b/src/java/org/jivesoftware/openfire/pep/PEPService.java
index dbfdf58..8b20e01 100644
--- a/src/java/org/jivesoftware/openfire/pep/PEPService.java
+++ b/src/java/org/jivesoftware/openfire/pep/PEPService.java
@@ -155,7 +155,7 @@
             leafDefaultConfiguration.setNotifyDelete(true);
             leafDefaultConfiguration.setNotifyRetract(true);
             leafDefaultConfiguration.setPersistPublishedItems(false);
-            leafDefaultConfiguration.setMaxPublishedItems(-1);
+            leafDefaultConfiguration.setMaxPublishedItems(1);
             leafDefaultConfiguration.setPresenceBasedDelivery(false);
             leafDefaultConfiguration.setSendItemSubscribe(true);
             leafDefaultConfiguration.setSubscriptionEnabled(true);
