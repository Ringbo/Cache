diff --git a/src/test/java/com/alibaba/json/bvt/util/Base64Test.java b/src/test/java/com/alibaba/json/bvt/util/Base64Test.java
index 075f670..073235d 100644
--- a/src/test/java/com/alibaba/json/bvt/util/Base64Test.java
+++ b/src/test/java/com/alibaba/json/bvt/util/Base64Test.java
@@ -12,17 +12,17 @@
 
         {
             byte[] bytes2 = Base64.decodeFast(base64Str);
-            assertEquals(str, new String(bytes2));
+            assertEquals(str, new String(bytes2, "UTF8"));
         }
 
         {
             byte[] bytes2 = Base64.decodeFast(base64Str, 0, base64Str.length());
-            assertEquals(str, new String(bytes2));
+            assertEquals(str, new String(bytes2, "UTF8"));
         }
 
         {
             byte[] bytes2 = Base64.decodeFast(base64Str.toCharArray(), 0, base64Str.length());
-            assertEquals(str, new String(bytes2));
+            assertEquals(str, new String(bytes2, "UTF8"));
         }
     }
 }
