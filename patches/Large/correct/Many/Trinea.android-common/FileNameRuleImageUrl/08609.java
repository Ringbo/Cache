diff --git a/src/cn/trinea/android/common/service/impl/FileNameRuleImageUrl.java b/src/cn/trinea/android/common/service/impl/FileNameRuleImageUrl.java
index b566ab2..c0e75b7 100644
--- a/src/cn/trinea/android/common/service/impl/FileNameRuleImageUrl.java
+++ b/src/cn/trinea/android/common/service/impl/FileNameRuleImageUrl.java
@@ -32,11 +32,11 @@
         }
 
         String ext = (fileExtension == null ? FileUtils.getFileExtension(imageUrl) : fileExtension);
-        String fileName = (imageUrl.length() >= MAX_FILE_NAME_LENGTH
+        String fileName = (imageUrl.length() > MAX_FILE_NAME_LENGTH
             ? imageUrl.substring(imageUrl.length() - MAX_FILE_NAME_LENGTH, imageUrl.length()) : imageUrl).replaceAll("[\\W]",
                                                                                                                      "_");
         return StringUtils.isEmpty(ext) ? fileName
-            : (new StringBuilder().append(fileName).append(".").append(ext).toString());
+            : (new StringBuilder().append(fileName).append(".").append(ext.replaceAll("[\\W]", "_")).toString());
     }
 
     public FileNameRuleImageUrl setFileExtension(String fileExtension) {
