diff --git a/smack-core/src/main/java/org/jivesoftware/smack/util/IpAddressUtil.java b/smack-core/src/main/java/org/jivesoftware/smack/util/IpAddressUtil.java
index 26c710a..55586e2 100644
--- a/smack-core/src/main/java/org/jivesoftware/smack/util/IpAddressUtil.java
+++ b/smack-core/src/main/java/org/jivesoftware/smack/util/IpAddressUtil.java
@@ -29,7 +29,7 @@
             return false;
         }
 
-        for (int i = 0; i < 3; i++) {
+        for (int i = 1; i <= 4; i++) {
             String ipSegment = matcher.group(i);
             int ipSegmentInt;
             try {
