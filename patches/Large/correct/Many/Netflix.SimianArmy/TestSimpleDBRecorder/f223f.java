diff --git a/src/test/java/com/netflix/simianarmy/aws/TestSimpleDBRecorder.java b/src/test/java/com/netflix/simianarmy/aws/TestSimpleDBRecorder.java
index 546cf1b..dbd6cdc 100644
--- a/src/test/java/com/netflix/simianarmy/aws/TestSimpleDBRecorder.java
+++ b/src/test/java/com/netflix/simianarmy/aws/TestSimpleDBRecorder.java
@@ -50,11 +50,11 @@
 
 // CHECKSTYLE IGNORE MagicNumberCheck
 public class TestSimpleDBRecorder extends SimpleDBRecorder {
-    TestSimpleDBRecorder() {
+    public TestSimpleDBRecorder() {
         super("accessKey", "secretKey", "region", "DOMAIN");
     }
 
-    TestSimpleDBRecorder(AWSCredentials cred) {
+    public TestSimpleDBRecorder(AWSCredentials cred) {
         super(cred, "region", "DOMAIN");
     }
 
