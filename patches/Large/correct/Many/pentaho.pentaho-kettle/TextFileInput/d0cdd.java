diff --git a/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInput.java b/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInput.java
index 99b3f02..29adb6f 100644
--- a/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInput.java
+++ b/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInput.java
@@ -1067,7 +1067,7 @@
 				data.zi.getNextEntry();
 
 				if (meta.getEncoding() != null
-						&& meta.getEnclosure().length() > 0) {
+						&& meta.getEncoding().length() > 0) {
 					data.isr = new InputStreamReader(new BufferedInputStream(
 							data.zi), meta.getEncoding());
 				} else {
@@ -1076,7 +1076,7 @@
 				}
 			} else {
 				if (meta.getEncoding() != null
-						&& meta.getEnclosure().length() > 0) {
+						&& meta.getEncoding().length() > 0) {
 					data.isr = new InputStreamReader(new BufferedInputStream(
 							data.fr), meta.getEncoding());
 				} else {
