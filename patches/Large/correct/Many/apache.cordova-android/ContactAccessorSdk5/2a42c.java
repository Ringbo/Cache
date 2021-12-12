diff --git a/framework/src/org/apache/cordova/ContactAccessorSdk5.java b/framework/src/org/apache/cordova/ContactAccessorSdk5.java
index fa0e4ff..3d81648 100644
--- a/framework/src/org/apache/cordova/ContactAccessorSdk5.java
+++ b/framework/src/org/apache/cordova/ContactAccessorSdk5.java
@@ -1501,7 +1501,7 @@
                 .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID, 0)
                 .withValue(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.Email.CONTENT_ITEM_TYPE)
                 .withValue(ContactsContract.CommonDataKinds.Email.DATA, getJsonString(email, "value"))
-                .withValue(ContactsContract.CommonDataKinds.Email.TYPE, getPhoneType(getJsonString(email, "type")))
+                .withValue(ContactsContract.CommonDataKinds.Email.TYPE, getContactType(getJsonString(email, "type")))
                 .build());
     }
 
