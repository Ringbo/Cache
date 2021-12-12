diff --git a/src/java/org/jivesoftware/admin/LdapUserProfile.java b/src/java/org/jivesoftware/admin/LdapUserProfile.java
index 69e7662..f2bf2e7 100644
--- a/src/java/org/jivesoftware/admin/LdapUserProfile.java
+++ b/src/java/org/jivesoftware/admin/LdapUserProfile.java
@@ -502,15 +502,15 @@
             }
             element = vCard.element("FN");
             if (element != null) {
-                fullName = vCard.getTextTrim();
+                fullName = element.getTextTrim();
             }
             element = vCard.element("NICKNAME");
             if (element != null) {
-                nickname = vCard.getTextTrim();
+                nickname = element.getTextTrim();
             }
             element = vCard.element("BDAY");
             if (element != null) {
-                birthday = vCard.getTextTrim();
+                birthday = element.getTextTrim();
             }
             // TODO add rest of fields
         }
