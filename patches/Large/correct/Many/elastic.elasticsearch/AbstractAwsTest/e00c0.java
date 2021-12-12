diff --git a/src/test/java/org/elasticsearch/cloud/aws/AbstractAwsTest.java b/src/test/java/org/elasticsearch/cloud/aws/AbstractAwsTest.java
index 6cbcd44..33314dd 100644
--- a/src/test/java/org/elasticsearch/cloud/aws/AbstractAwsTest.java
+++ b/src/test/java/org/elasticsearch/cloud/aws/AbstractAwsTest.java
@@ -97,7 +97,7 @@
                 .put("cloud.aws.test.write_failures", 0.1)
                 .put("cloud.aws.test.read_failures", 0.1);
 
-        Environment environment = new Environment();
+        Environment environment = new Environment(settings.build());
 
         // if explicit, just load it and don't load from env
         try {
