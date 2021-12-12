diff --git a/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/encryption/EncryptedMsgActor.java b/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/encryption/EncryptedMsgActor.java
index f5dbec6..14ac2d4 100644
--- a/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/encryption/EncryptedMsgActor.java
+++ b/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/encryption/EncryptedMsgActor.java
@@ -66,7 +66,7 @@
                         key.getAlgType(), key.getEncryptedKey()));
             }
         }
-        EncryptedBox encryptedBox = new EncryptedBox(encryptedBoxKeys.toArray(new EncryptedBoxKey[0]), message.getBox().getEncPackage());
+        final EncryptedBox encryptedBox = new EncryptedBox(encryptedBoxKeys.toArray(new EncryptedBoxKey[0]), message.getBox().getEncPackage());
         ask(context().getEncryption().getEncryptedChatManager(uid), new EncryptedPeerActor.DecryptBox(encryptedBox), new AskCallback() {
             @Override
             public void onResult(Object obj) {
