diff --git a/src/net/java/sip/communicator/impl/protocol/icq/ServerStoredContactListIcqImpl.java b/src/net/java/sip/communicator/impl/protocol/icq/ServerStoredContactListIcqImpl.java
index 50dd127..07c181f 100644
--- a/src/net/java/sip/communicator/impl/protocol/icq/ServerStoredContactListIcqImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/icq/ServerStoredContactListIcqImpl.java
@@ -665,10 +665,14 @@
         return null;
     }
 
-    // when there is no alias for contact we must retreive its nickname from server
-    // but when the contact list is loaded the provider is not yet registered to server
-    // we wait to register process to finish and then retreive the nicknames
-    // this happens only the first time contact list is loaded
+    /**
+     * when there is no alias for contact we must retreive its nickname from server
+     * but when the contact list is loaded the provider is not yet registered to server
+     * we wait to register process to finish and then retreive the nicknames
+     * this happens only the first time contact list is loaded
+     *
+     * @param c ContactIcqImpl
+     */
     protected void addContactForUpdate(ContactIcqImpl c)
     {
         if(getParentProvider().getRegistrationState().
@@ -1173,8 +1177,10 @@
 
     }
 
-    // Waits for registration process to finish
-    // then updates all contacts that need their nickname to be updated
+    /**
+     * Waits for registration process to finish
+     * then updates all contacts that need their nickname to be updated
+     */
     private class ProviderListener
         implements RegistrationStateChangeListener
     {
@@ -1201,7 +1207,9 @@
         }
     }
 
-    // Thread retreiving nickname and firing event for the change
+    /**
+     * Thread retreiving nickname and firing event for the change
+     */
     private class NickRetriever
         implements Runnable
     {
@@ -1217,7 +1225,7 @@
             String nickName = getParentProvider().
                 getInfoRetreiver().getNickName(c.getUIN());
 
-            c.setDisplayName(nickName);
+            c.setNickname(nickName);
 
             parentOperationSet.fireContactPropertyChangeEvent(
                 ContactPropertyChangeEvent.PROPERTY_DISPLAY_NAME, c, oldNickname, nickName);
