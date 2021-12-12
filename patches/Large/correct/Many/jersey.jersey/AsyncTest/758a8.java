diff --git a/connectors/apache-connector/src/test/java/org/glassfish/jersey/apache/connector/AsyncTest.java b/connectors/apache-connector/src/test/java/org/glassfish/jersey/apache/connector/AsyncTest.java
index 32a570a..7da1255 100644
--- a/connectors/apache-connector/src/test/java/org/glassfish/jersey/apache/connector/AsyncTest.java
+++ b/connectors/apache-connector/src/test/java/org/glassfish/jersey/apache/connector/AsyncTest.java
@@ -1,7 +1,7 @@
 /*
  * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
  *
- * Copyright (c) 2013-2014 Oracle and/or its affiliates. All rights reserved.
+ * Copyright (c) 2013-2015 Oracle and/or its affiliates. All rights reserved.
  *
  * The contents of this file are subject to the terms of either the GNU
  * General Public License Version 2 only ("GPL") or the Common Development
@@ -242,7 +242,7 @@
 
         final int asyncTimeoutMultiplier = getAsyncTimeoutMultiplier();
         LOGGER.info("Using async timeout multiplier: " + asyncTimeoutMultiplier);
-        assertThat("Async processing took too long.", toc - tic, Matchers.lessThan(3 * AsyncResource.OPERATION_DURATION
+        assertThat("Async processing took too long.", toc - tic, Matchers.lessThan(4 * AsyncResource.OPERATION_DURATION
                 * asyncTimeoutMultiplier));
 
     }
