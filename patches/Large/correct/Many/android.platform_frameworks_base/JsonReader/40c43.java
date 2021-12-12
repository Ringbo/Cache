diff --git a/core/java/android/util/JsonReader.java b/core/java/android/util/JsonReader.java
index f139372..f2a86c9 100644
--- a/core/java/android/util/JsonReader.java
+++ b/core/java/android/util/JsonReader.java
@@ -852,7 +852,7 @@
 
     private boolean skipTo(String toFind) throws IOException {
         outer:
-        for (; pos + toFind.length() < limit || fillBuffer(toFind.length()); pos++) {
+        for (; pos + toFind.length() <= limit || fillBuffer(toFind.length()); pos++) {
             for (int c = 0; c < toFind.length(); c++) {
                 if (buffer[pos + c] != toFind.charAt(c)) {
                     continue outer;
