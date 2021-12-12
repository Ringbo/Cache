diff --git a/src/protocol/ftp/org/apache/jmeter/protocol/ftp/sampler/FTPSampler.java b/src/protocol/ftp/org/apache/jmeter/protocol/ftp/sampler/FTPSampler.java
index ea9daa0..d33b03f 100644
--- a/src/protocol/ftp/org/apache/jmeter/protocol/ftp/sampler/FTPSampler.java
+++ b/src/protocol/ftp/org/apache/jmeter/protocol/ftp/sampler/FTPSampler.java
@@ -1,6 +1,6 @@
 // $Header$
 /*
- * Copyright 2001-2004 The Apache Software Foundation.
+ * Copyright 2001-2005 The Apache Software Foundation.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -81,7 +81,7 @@
         SampleResult res = new SampleResult();
         boolean isSuccessful = false;
         //FtpConfig ftpConfig = (FtpConfig)e.getConfigElement(FtpConfig.class);
-        res.setSampleLabel(getLabel());
+        res.setSampleLabel(getName());
         //LoginConfig loginConfig =
         //  (LoginConfig)e.getConfigElement(LoginConfig.class);
         res.sampleStart();
@@ -93,7 +93,7 @@
             // this should probably come from the setup dialog
             String s = ftp.get(getFilename());
             res.setResponseData(s.getBytes());
-            // set the response code here somewhere
+            // TODO set the response code here somewhere
             ftp.disconnect();
             isSuccessful = true;
         }
