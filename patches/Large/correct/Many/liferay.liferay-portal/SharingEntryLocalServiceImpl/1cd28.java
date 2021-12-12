diff --git a/modules/apps/sharing/sharing-service/src/main/java/com/liferay/sharing/service/impl/SharingEntryLocalServiceImpl.java b/modules/apps/sharing/sharing-service/src/main/java/com/liferay/sharing/service/impl/SharingEntryLocalServiceImpl.java
index 1838e26..8027cc7 100644
--- a/modules/apps/sharing/sharing-service/src/main/java/com/liferay/sharing/service/impl/SharingEntryLocalServiceImpl.java
+++ b/modules/apps/sharing/sharing-service/src/main/java/com/liferay/sharing/service/impl/SharingEntryLocalServiceImpl.java
@@ -76,7 +76,7 @@
 			sharingEntryActionKeys.stream();
 
 		sharingEntryActionKeyStream.map(
-			SharingEntryActionKey::getBitwiseVaue
+			SharingEntryActionKey::getBitwiseValue
 		).reduce(
 			(bitwiseValue1, bitwiseValue2) -> bitwiseValue1 | bitwiseValue2
 		).ifPresent(
@@ -226,7 +226,7 @@
 
 			long actionIds = sharingEntry.getActionIds();
 
-			if ((actionIds & sharingEntryActionKey.getBitwiseVaue()) != 0) {
+			if ((actionIds & sharingEntryActionKey.getBitwiseValue()) != 0) {
 				return true;
 			}
 		}
@@ -246,7 +246,7 @@
 		for (SharingEntry sharingEntry : sharingEntries) {
 			long actionIds = sharingEntry.getActionIds();
 
-			if ((actionIds & sharingEntryActionKey.getBitwiseVaue()) != 0) {
+			if ((actionIds & sharingEntryActionKey.getBitwiseValue()) != 0) {
 				return true;
 			}
 		}
@@ -269,7 +269,7 @@
 			sharingEntryActionKeys.stream();
 
 		sharingEntryActionKeyStream.map(
-			SharingEntryActionKey::getBitwiseVaue
+			SharingEntryActionKey::getBitwiseValue
 		).reduce(
 			(bitwiseValue1, bitwiseValue2) -> bitwiseValue1 | bitwiseValue2
 		).ifPresent(
