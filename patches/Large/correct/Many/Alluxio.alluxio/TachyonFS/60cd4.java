diff --git a/core/src/main/java/tachyon/client/TachyonFS.java b/core/src/main/java/tachyon/client/TachyonFS.java
index 15b0498..683786a 100644
--- a/core/src/main/java/tachyon/client/TachyonFS.java
+++ b/core/src/main/java/tachyon/client/TachyonFS.java
@@ -597,7 +597,12 @@
     return new TachyonURI(scheme, authority, TachyonURI.SEPARATOR);
   }
   
-  synchronized long getUserId() throws IOException {
+  /**
+   * Returns the userId of the master client. This is only used for testing.
+   * @return the userId of the master client
+   * @throws IOException
+   */
+  long getUserId() throws IOException {
     return mMasterClient.getUserId();
   }
 
