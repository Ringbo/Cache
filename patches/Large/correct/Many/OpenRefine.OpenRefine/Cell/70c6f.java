diff --git a/src/main/java/com/metaweb/gridworks/model/Cell.java b/src/main/java/com/metaweb/gridworks/model/Cell.java
index f626ec4..451c98d 100644
--- a/src/main/java/com/metaweb/gridworks/model/Cell.java
+++ b/src/main/java/com/metaweb/gridworks/model/Cell.java
@@ -130,9 +130,9 @@
                 if (token == JsonToken.VALUE_STRING) {
                     value = jp.getText();
                 } else if (token == JsonToken.VALUE_NUMBER_INT) {
-                    value = jp.getIntValue();
+                    value = jp.getLongValue();
                 } else if (token == JsonToken.VALUE_NUMBER_FLOAT) {
-                    value = jp.getFloatValue();
+                    value = jp.getDoubleValue();
                 } else if (token == JsonToken.VALUE_TRUE) {
                     value = true;
                 } else if (token == JsonToken.VALUE_FALSE) {
