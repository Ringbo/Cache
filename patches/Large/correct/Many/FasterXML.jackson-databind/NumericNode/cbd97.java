diff --git a/src/main/java/com/fasterxml/jackson/databind/node/NumericNode.java b/src/main/java/com/fasterxml/jackson/databind/node/NumericNode.java
index e99cd9a..771ef2c 100644
--- a/src/main/java/com/fasterxml/jackson/databind/node/NumericNode.java
+++ b/src/main/java/com/fasterxml/jackson/databind/node/NumericNode.java
@@ -41,29 +41,29 @@
     public abstract String asText();
 
     @Override
-    public int asInt() {
+    public final int asInt() {
         return intValue();
     }
     @Override
-    public int asInt(int defaultValue) {
+    public final int asInt(int defaultValue) {
         return intValue();
     }
 
     @Override
-    public long asLong() {
+    public final long asLong() {
         return longValue();
     }
     @Override
-    public long asLong(long defaultValue) {
+    public final long asLong(long defaultValue) {
         return longValue();
     }
     
     @Override
-    public double asDouble() {
+    public final double asDouble() {
         return doubleValue();
     }
     @Override
-    public double asDouble(double defaultValue) {
+    public final double asDouble(double defaultValue) {
         return doubleValue();
     }
 }
