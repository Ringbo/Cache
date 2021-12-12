diff --git a/sdk/src/main/java/com/google/cloud/dataflow/sdk/util/WindowedValue.java b/sdk/src/main/java/com/google/cloud/dataflow/sdk/util/WindowedValue.java
index d47e810..67daaf0 100644
--- a/sdk/src/main/java/com/google/cloud/dataflow/sdk/util/WindowedValue.java
+++ b/sdk/src/main/java/com/google/cloud/dataflow/sdk/util/WindowedValue.java
@@ -141,7 +141,9 @@
   public boolean equals(Object o) {
     if (o instanceof WindowedValue) {
       WindowedValue<?> that = (WindowedValue) o;
-      if (that.timestamp.isEqual(timestamp) && that.windows.size() == windows.size()) {
+      if (Objects.equals(that.value, this.value)
+          && that.timestamp.isEqual(timestamp)
+          && that.windows.size() == windows.size()) {
         for (Iterator<?> thatIterator = that.windows.iterator(), thisIterator = windows.iterator();
             thatIterator.hasNext() && thisIterator.hasNext();
             /* do nothing */) {
