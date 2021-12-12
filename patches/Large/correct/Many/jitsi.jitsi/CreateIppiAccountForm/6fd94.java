diff --git a/src/net/java/sip/communicator/plugin/ippiaccregwizz/CreateIppiAccountForm.java b/src/net/java/sip/communicator/plugin/ippiaccregwizz/CreateIppiAccountForm.java
index 9c69ca7..4664b23 100644
--- a/src/net/java/sip/communicator/plugin/ippiaccregwizz/CreateIppiAccountForm.java
+++ b/src/net/java/sip/communicator/plugin/ippiaccregwizz/CreateIppiAccountForm.java
@@ -88,13 +88,13 @@
             IppiAccRegWizzActivator.getResources()
                 .getI18NString("plugin.sipaccregwizz.CREATE_ACCOUNT_TITLE")));
 
-        JPanel labelsPanel = new TransparentPanel(new GridLayout(0, 1));
+        JPanel labelsPanel = new TransparentPanel(new GridLayout(0, 1, 0, 4));
 
-        JPanel valuesPanel = new TransparentPanel(new GridLayout(0, 1));
+        JPanel valuesPanel = new TransparentPanel(new GridLayout(0, 1, 0, 4));
 
         JLabel usernameLabel
             = new JLabel(IppiAccRegWizzActivator.getResources()
-                    .getI18NString("plugin.ippiaccregwizz.USERNAME"));
+                    .getI18NString("plugin.sip2sipaccregwizz.USERNAME"));
 
         JLabel passLabel
             = new JLabel(IppiAccRegWizzActivator.getResources()
@@ -102,11 +102,11 @@
 
         JLabel retypePasswordLabel
             = new JLabel(IppiAccRegWizzActivator.getResources()
-            .getI18NString("plugin.ippiaccregwizz.RETYPE_PASSWORD"));
+            .getI18NString("plugin.sip2sipaccregwizz.RETYPE_PASSWORD"));
 
         JLabel emailLabel
             = new JLabel(IppiAccRegWizzActivator.getResources()
-                .getI18NString("plugin.ippiaccregwizz.EMAIL"));
+                .getI18NString("plugin.sip2sipaccregwizz.EMAIL"));
 
         labelsPanel.add(usernameLabel);
         labelsPanel.add(passLabel);
@@ -120,7 +120,7 @@
 
         JLabel emailDescriptionLabel
             = new JLabel(IppiAccRegWizzActivator.getResources()
-                .getI18NString("plugin.ippiaccregwizz.EMAIL_NOTE"),
+                .getI18NString("plugin.sip2sipaccregwizz.EMAIL_NOTE"),
                 SwingConstants.CENTER);
         emailDescriptionLabel.setForeground(Color.GRAY);
         emailDescriptionLabel.setFont(emailDescriptionLabel.getFont().deriveFont(8));
