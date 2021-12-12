diff --git a/aws-java-sdk-core/src/main/java/com/amazonaws/util/StringUtils.java b/aws-java-sdk-core/src/main/java/com/amazonaws/util/StringUtils.java
index e0146f3..de98efb 100644
--- a/aws-java-sdk-core/src/main/java/com/amazonaws/util/StringUtils.java
+++ b/aws-java-sdk-core/src/main/java/com/amazonaws/util/StringUtils.java
@@ -141,7 +141,7 @@
         int indexOf = buffer.indexOf( partToMatch );
         while ( indexOf != -1 ) {
             buffer = buffer.replace( indexOf, indexOf + partToMatch.length(), replacement );
-            indexOf = buffer.indexOf( partToMatch );
+            indexOf = buffer.indexOf( partToMatch, indexOf + replacement.length() );
         }
 
         return buffer.toString();
