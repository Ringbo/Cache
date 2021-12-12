diff --git a/web/src/main/java/com/navercorp/pinpoint/web/vo/LinkKey.java b/web/src/main/java/com/navercorp/pinpoint/web/vo/LinkKey.java
index 58bffa6..eb92600 100644
--- a/web/src/main/java/com/navercorp/pinpoint/web/vo/LinkKey.java
+++ b/web/src/main/java/com/navercorp/pinpoint/web/vo/LinkKey.java
@@ -103,7 +103,7 @@
     @Override
     public int hashCode() {
         final int hash = this.hash;
-        if (hash == 0) {
+        if (hash != 0) {
             return hash;
         }
         int result = fromApplication.hashCode();
