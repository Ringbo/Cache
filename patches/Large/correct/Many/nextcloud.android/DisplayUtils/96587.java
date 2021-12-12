diff --git a/src/com/owncloud/android/DisplayUtils.java b/src/com/owncloud/android/DisplayUtils.java
index 0e1b2b6..70a9672 100644
--- a/src/com/owncloud/android/DisplayUtils.java
+++ b/src/com/owncloud/android/DisplayUtils.java
@@ -145,7 +145,7 @@
         } else {
             String [] parts = mimetype.split("/");
             String type = parts[0];
-            String subtype = (parts.length > 0) ? parts[1] : "";
+            String subtype = (parts.length > 1) ? parts[1] : "";
             
             if(TYPE_TXT.equals(type)) {
                 return R.drawable.file_doc;
