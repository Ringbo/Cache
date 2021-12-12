diff --git a/src/biz/bokhorst/xprivacy/ActivityMain.java b/src/biz/bokhorst/xprivacy/ActivityMain.java
index c87dca2..a0c02a0 100644
--- a/src/biz/bokhorst/xprivacy/ActivityMain.java
+++ b/src/biz/bokhorst/xprivacy/ActivityMain.java
@@ -706,7 +706,7 @@
 
 						// Get address
 						StringBuilder sb = new StringBuilder();
-						for (int i = 0; i < address.getMaxAddressLineIndex(); i++) {
+						for (int i = 0; i <= address.getMaxAddressLineIndex(); i++) {
 							if (i != 0)
 								sb.append(", ");
 							sb.append(address.getAddressLine(i));
