diff --git a/src/main/java/org/elasticsearch/discovery/ec2/AwsEc2UnicastHostsProvider.java b/src/main/java/org/elasticsearch/discovery/ec2/AwsEc2UnicastHostsProvider.java
index ac6035b..fb38392 100644
--- a/src/main/java/org/elasticsearch/discovery/ec2/AwsEc2UnicastHostsProvider.java
+++ b/src/main/java/org/elasticsearch/discovery/ec2/AwsEc2UnicastHostsProvider.java
@@ -153,7 +153,7 @@
                         address = instance.getPublicDnsName();
                         break;
                     case PUBLIC_IP:
-                        address = instance.getPublicDnsName();
+                        address = instance.getPublicIpAddress();
                         break;
                 }
                 if (address != null) {
