diff --git a/src/java/org/jivesoftware/util/XMLProperties.java b/src/java/org/jivesoftware/util/XMLProperties.java
index a25c4c3..3203cd4 100644
--- a/src/java/org/jivesoftware/util/XMLProperties.java
+++ b/src/java/org/jivesoftware/util/XMLProperties.java
@@ -481,7 +481,7 @@
             	String propValue = StringEscapeUtils.escapeXml(value);
             	// check to see if the property is marked as encrypted
             	if (JiveGlobals.isPropertyEncrypted(name)) {
-            		propValue = JiveGlobals.getPropertyEncryptor().encrypt(propValue);
+            		propValue = JiveGlobals.getPropertyEncryptor().encrypt(value);
             		childElement.addAttribute(ENCRYPTED_ATTRIBUTE, "true");
             	}
                 childElement.setText(propValue);
@@ -642,7 +642,7 @@
         	String propValue = StringEscapeUtils.escapeXml(value);
         	// check to see if the property is marked as encrypted
         	if (JiveGlobals.isPropertyEncrypted(name)) {
-        		propValue = JiveGlobals.getPropertyEncryptor().encrypt(propValue);
+        		propValue = JiveGlobals.getPropertyEncryptor().encrypt(value);
         		element.addAttribute(ENCRYPTED_ATTRIBUTE, "true");
         	}
         	element.setText(propValue);
