diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/util/RtlUtils.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/util/RtlUtils.java
index d76eabf..d01df15 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/util/RtlUtils.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/util/RtlUtils.java
@@ -527,7 +527,7 @@
 
             do {
                 if ((line.length() + phrase.length() + word.length() < line_max_size) ||
-                        (line.length() == 0 && word.length() > line_max_size)) {
+                        (line.length() == 0 && word.length() >= line_max_size)) {
                     if (isSpaceSign(c)) {
                         word.append(c);
                         addCharToWord = true;
