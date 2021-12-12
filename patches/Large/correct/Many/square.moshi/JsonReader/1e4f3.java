diff --git a/moshi/src/main/java/com/squareup/moshi/JsonReader.java b/moshi/src/main/java/com/squareup/moshi/JsonReader.java
index d84026c..b42f36f 100644
--- a/moshi/src/main/java/com/squareup/moshi/JsonReader.java
+++ b/moshi/src/main/java/com/squareup/moshi/JsonReader.java
@@ -899,7 +899,7 @@
     peeked = PEEKED_BUFFERED;
     double result = Double.parseDouble(peekedString); // don't catch this NumberFormatException.
     if (!lenient && (Double.isNaN(result) || Double.isInfinite(result))) {
-      throw new IOException("JSON forbids NaN and infinities: " + result
+      throw new NumberFormatException("JSON forbids NaN and infinities: " + result
           + " at path " + getPath());
     }
     peekedString = null;
