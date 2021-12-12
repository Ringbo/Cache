diff --git a/src/java/org/jivesoftware/messenger/handler/IQvCardHandler.java b/src/java/org/jivesoftware/messenger/handler/IQvCardHandler.java
index 07f262d..5fe0890 100644
--- a/src/java/org/jivesoftware/messenger/handler/IQvCardHandler.java
+++ b/src/java/org/jivesoftware/messenger/handler/IQvCardHandler.java
@@ -91,7 +91,7 @@
                 Element vcard = DocumentHelper.createElement(QName.get("vCard", "vcard-temp"));
                 result.setChildElement(vcard);
                 // Only try to get the vCard values of non-anonymous users 
-                if (recipient.getNode() != null) {
+                if (recipient != null && recipient.getNode() != null) {
                     User user = userManager.getUser(recipient.getNode());
                     VCardManager vManager = VCardManager.getInstance();
                     Collection<String> names = vManager.getVCardPropertyNames(user.getUsername());
