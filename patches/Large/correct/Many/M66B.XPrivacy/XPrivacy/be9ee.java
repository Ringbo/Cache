diff --git a/src/biz/bokhorst/xprivacy/XPrivacy.java b/src/biz/bokhorst/xprivacy/XPrivacy.java
index 2a47df5..82f2928 100644
--- a/src/biz/bokhorst/xprivacy/XPrivacy.java
+++ b/src/biz/bokhorst/xprivacy/XPrivacy.java
@@ -189,8 +189,9 @@
 					hookAll(XBluetoothAdapter.getInstances(instance));
 					mBluetoothAdapterHooked = true;
 				}
-		} else if (name.equals(Context.CLIPBOARD_SERVICE)) {
+		} else if (name.equals(Context.CLIPBOARD_SERVICE) || name.equals("clipboardEx")) {
 			// Clipboard manager
+			// clipboardEx: Samsung stock ROM
 			if (!mClipboardManagerHooked) {
 				XPrivacy.hookAll(XClipboardManager.getInstances(instance));
 				mClipboardManagerHooked = true;
