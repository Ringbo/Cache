diff --git a/app/src/main/java/org/schabi/newpipe/VideoInfoItemViewCreator.java b/app/src/main/java/org/schabi/newpipe/VideoInfoItemViewCreator.java
index 369f5ee..4b7c3c3 100644
--- a/app/src/main/java/org/schabi/newpipe/VideoInfoItemViewCreator.java
+++ b/app/src/main/java/org/schabi/newpipe/VideoInfoItemViewCreator.java
@@ -134,9 +134,9 @@
         if(hours > 0 || !output.isEmpty()) {
             if(hours > 0) {
                 if(hours >= 10 || output.isEmpty()) {
-                    output += Integer.toString(minutes);
+                    output += Integer.toString(hours);
                 } else {
-                    output += "0" + Integer.toString(minutes);
+                    output += "0" + Integer.toString(hours);
                 }
             } else {
                 output += "00";
