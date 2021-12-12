diff --git a/src/web/security/ldap/src/test/java/org/geoserver/web/security/ldap/LDAPAuthProviderPanelTest.java b/src/web/security/ldap/src/test/java/org/geoserver/web/security/ldap/LDAPAuthProviderPanelTest.java
index 449cbb2..2e04e44 100644
--- a/src/web/security/ldap/src/test/java/org/geoserver/web/security/ldap/LDAPAuthProviderPanelTest.java
+++ b/src/web/security/ldap/src/test/java/org/geoserver/web/security/ldap/LDAPAuthProviderPanelTest.java
@@ -98,7 +98,7 @@
             protected void onBeforeRender() {
                 feedbackPanel = new FeedbackPanel("feedback");
                 feedbackPanel.setOutputMarkupId(true);
-                add(feedbackPanel);
+                addOrReplace(feedbackPanel);
                 super.onBeforeRender();
             }
             
