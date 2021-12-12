diff --git a/core/common/src/main/java/alluxio/util/CommonUtils.java b/core/common/src/main/java/alluxio/util/CommonUtils.java
index 81ef0b5..1d4c87f 100644
--- a/core/common/src/main/java/alluxio/util/CommonUtils.java
+++ b/core/common/src/main/java/alluxio/util/CommonUtils.java
@@ -81,17 +81,17 @@
   }
 
   /**
-   * Generates a random alphanumeric string of the given length.
+   * Generates a random string of the given length.
    *
    * @param length the length
-   * @return a random alphanumeric string
+   * @return a random string
    */
   public static String randomString(int length) {
-    String result = "";
+    StringBuilder sb = new StringBuilder();
     for (int i = 0; i < length; i++) {
-      result += sRandom.nextInt(96) + 32; // generates a random alphanumeric symbol
+      sb.append((char) (sRandom.nextInt(96) + 32)); // generates a random printable character
     }
-    return result;
+    return sb.toString();
   }
 
   /**
