diff --git a/src/main/java/com/metaweb/gridworks/model/Recon.java b/src/main/java/com/metaweb/gridworks/model/Recon.java
index 6876d8f..27b30c5 100644
--- a/src/main/java/com/metaweb/gridworks/model/Recon.java
+++ b/src/main/java/com/metaweb/gridworks/model/Recon.java
@@ -279,9 +279,9 @@
                         if (token == JsonToken.VALUE_STRING) {
                             recon.features[feature++] = jp.getText();
                         } else if (token == JsonToken.VALUE_NUMBER_INT) {
-                            recon.features[feature++] = jp.getIntValue();
+                            recon.features[feature++] = jp.getLongValue();
                         } else if (token == JsonToken.VALUE_NUMBER_FLOAT) {
-                            recon.features[feature++] = jp.getFloatValue();
+                            recon.features[feature++] = jp.getDoubleValue();
                         } else if (token == JsonToken.VALUE_FALSE) {
                             recon.features[feature++] = false;
                         } else if (token == JsonToken.VALUE_TRUE) {
