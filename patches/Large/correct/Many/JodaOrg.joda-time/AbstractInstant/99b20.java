diff --git a/JodaTime/src/java/org/joda/time/AbstractInstant.java b/JodaTime/src/java/org/joda/time/AbstractInstant.java
index 81055d3..caa3422 100644
--- a/JodaTime/src/java/org/joda/time/AbstractInstant.java
+++ b/JodaTime/src/java/org/joda/time/AbstractInstant.java
@@ -312,7 +312,8 @@
      * @return true if millisecond and chronology are equal, false if
      *  not or the instant is null or of an incorrect type
      */
-    public boolean equals(Object readableInstant) {
+    public final boolean equals(Object readableInstant) {
+        // must be final to fulfil ReadableInstant contract
         if (this == readableInstant) {
             return true;
         }
@@ -336,7 +337,8 @@
      *
      * @return a suitable hash code
      */
-    public int hashCode() {
+    public final int hashCode() {
+        // must be final to fulfil ReadableInstant contract
         return
             ((int) (getMillis() ^ (getMillis() >>> 32))) +
             (getChronology() == null ? 0 : getChronology().hashCode());
