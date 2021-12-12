diff --git a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/core/AndroidPhoneBook.java b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/core/AndroidPhoneBook.java
index 570debe..d5bce44 100644
--- a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/core/AndroidPhoneBook.java
+++ b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/core/AndroidPhoneBook.java
@@ -156,7 +156,7 @@
             long phoneId = cur.getLong(idPhoneIndex);
             String rawPhone = cur.getString(idNumberIndex);
             PhoneBookContact record = recordsMap.get(contactId);
-            if (record == null) {
+            if (record == null || rawPhone == null) {
                 continue;
             }
 
