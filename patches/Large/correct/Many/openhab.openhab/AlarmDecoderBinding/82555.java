diff --git a/bundles/binding/org.openhab.binding.alarmdecoder/src/main/java/org/openhab/binding/alarmdecoder/internal/AlarmDecoderBinding.java b/bundles/binding/org.openhab.binding.alarmdecoder/src/main/java/org/openhab/binding/alarmdecoder/internal/AlarmDecoderBinding.java
index 14dea73..33f0318 100644
--- a/bundles/binding/org.openhab.binding.alarmdecoder/src/main/java/org/openhab/binding/alarmdecoder/internal/AlarmDecoderBinding.java
+++ b/bundles/binding/org.openhab.binding.alarmdecoder/src/main/java/org/openhab/binding/alarmdecoder/internal/AlarmDecoderBinding.java
@@ -434,7 +434,7 @@
 			throw new MessageParseException("need 2 comma separated fields in msg");
 		}
 		try {
-			int numeric = Integer.parseInt(parts[1]);
+			int numeric = Integer.parseInt(parts[1], 16);
 			ArrayList<AlarmDecoderBindingConfig> bcl = getItems(ADMsgType.RFX, parts[0], null);
 			for (AlarmDecoderBindingConfig c : bcl) {
 				if (c.hasFeature("data")) {
