diff --git a/contrib/ec2-testing/src/java/voldemort/utils/impl/TypicaEc2Connection.java b/contrib/ec2-testing/src/java/voldemort/utils/impl/TypicaEc2Connection.java
index 0e1cfb1..ffb9cf7 100644
--- a/contrib/ec2-testing/src/java/voldemort/utils/impl/TypicaEc2Connection.java
+++ b/contrib/ec2-testing/src/java/voldemort/utils/impl/TypicaEc2Connection.java
@@ -60,7 +60,7 @@
         ec2 = new Jec2(accessId, secretKey);
         this.listener = listener;
 
-        if(ec2 != null)
+        if(regionUrl != null && ec2 != null)
             ec2.setRegionUrl(regionUrl);
     }
 
