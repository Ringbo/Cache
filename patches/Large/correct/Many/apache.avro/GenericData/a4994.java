diff --git a/lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java b/lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java
index 588be39..0f86141 100644
--- a/lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java
+++ b/lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java
@@ -445,9 +445,9 @@
           if((ch>='\u0000' && ch<='\u001F') || (ch>='\u007F' && ch<='\u009F') || (ch>='\u2000' && ch<='\u20FF')){
             String hex = Integer.toHexString(ch);
             builder.append("\\u");
-            for(int j = 0; j < 4-builder.length(); j++)
+            for(int j = 0; j < 4 - hex.length(); j++)
               builder.append('0');
-            builder.append(string.toUpperCase());
+            builder.append(hex.toUpperCase());
           } else {
             builder.append(ch);
           }
