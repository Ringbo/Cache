diff --git a/src/main/java/eu/siacs/conversations/crypto/PgpEngine.java b/src/main/java/eu/siacs/conversations/crypto/PgpEngine.java
index 257d0f7..06127a1 100644
--- a/src/main/java/eu/siacs/conversations/crypto/PgpEngine.java
+++ b/src/main/java/eu/siacs/conversations/crypto/PgpEngine.java
@@ -50,7 +50,7 @@
 
 				@Override
 				public void onReturn(Intent result) {
-					notifyPgpDecryptionService(message.getContact().getAccount(), OpenPgpApi.ACTION_DECRYPT_VERIFY, result);
+					notifyPgpDecryptionService(message.getConversation().getAccount(), OpenPgpApi.ACTION_DECRYPT_VERIFY, result);
 					switch (result.getIntExtra(OpenPgpApi.RESULT_CODE,
 							OpenPgpApi.RESULT_CODE_ERROR)) {
 					case OpenPgpApi.RESULT_CODE_SUCCESS:
@@ -160,7 +160,7 @@
 
 				@Override
 				public void onReturn(Intent result) {
-					notifyPgpDecryptionService(message.getContact().getAccount(), OpenPgpApi.ACTION_ENCRYPT, result);
+					notifyPgpDecryptionService(message.getConversation().getAccount(), OpenPgpApi.ACTION_ENCRYPT, result);
 					switch (result.getIntExtra(OpenPgpApi.RESULT_CODE,
 							OpenPgpApi.RESULT_CODE_ERROR)) {
 					case OpenPgpApi.RESULT_CODE_SUCCESS:
@@ -206,7 +206,7 @@
 
 					@Override
 					public void onReturn(Intent result) {
-						notifyPgpDecryptionService(message.getContact().getAccount(), OpenPgpApi.ACTION_ENCRYPT, result);
+						notifyPgpDecryptionService(message.getConversation().getAccount(), OpenPgpApi.ACTION_ENCRYPT, result);
 						switch (result.getIntExtra(OpenPgpApi.RESULT_CODE,
 								OpenPgpApi.RESULT_CODE_ERROR)) {
 						case OpenPgpApi.RESULT_CODE_SUCCESS:
