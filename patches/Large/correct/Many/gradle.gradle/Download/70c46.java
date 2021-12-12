diff --git a/subprojects/wrapper/src/main/java/org/gradle/wrapper/Download.java b/subprojects/wrapper/src/main/java/org/gradle/wrapper/Download.java
index eb2bcbb..f5760ca 100644
--- a/subprojects/wrapper/src/main/java/org/gradle/wrapper/Download.java
+++ b/subprojects/wrapper/src/main/java/org/gradle/wrapper/Download.java
@@ -122,7 +122,7 @@
             Method base64Encode = datatypeConverter.getMethod("printBase64Binary", byte[].class);
             return (String) base64Encode.invoke(null, new Object[]{userInfo.getBytes("UTF-8")});
         } catch (Exception ex) {
-            throw new IOException("Downloading Gradle distributions with HTTP Basic Authentication is not supported on your JVM.", ex);
+            throw new RuntimeException("Downloading Gradle distributions with HTTP Basic Authentication is not supported on your JVM.", ex);
         }
     }
 
