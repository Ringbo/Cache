diff --git a/twitter4j-core/src/test/java/twitter4j/conf/ConfigurationTest.java b/twitter4j-core/src/test/java/twitter4j/conf/ConfigurationTest.java
index 59b2f61..0bbc29f 100644
--- a/twitter4j-core/src/test/java/twitter4j/conf/ConfigurationTest.java
+++ b/twitter4j-core/src/test/java/twitter4j/conf/ConfigurationTest.java
@@ -1,5 +1,6 @@
 /*
- * Copyright 2007 Yusuke Yamamoto
+ * Copyright (C) 2007 Yusuke Yamamoto
+ * Copyright (C) 2011 Twitter, Inc.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -322,7 +323,7 @@
 
         Configuration t = (Configuration) serializeDeserialize(conf);
 
-        assertSame(conf, (Configuration) serializeDeserialize(conf));
+        assertEquals(conf, (Configuration) serializeDeserialize(conf));
 
         assertTrue(0 == conf.getRestBaseURL().indexOf("http://"));
         assertTrue(0 == conf.getSearchBaseURL().indexOf("http://"));
