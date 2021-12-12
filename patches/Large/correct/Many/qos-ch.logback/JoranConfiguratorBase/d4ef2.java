diff --git a/logback-core/src/main/java/ch/qos/logback/core/joran/JoranConfiguratorBase.java b/logback-core/src/main/java/ch/qos/logback/core/joran/JoranConfiguratorBase.java
index 2671975..cf3326f 100644
--- a/logback-core/src/main/java/ch/qos/logback/core/joran/JoranConfiguratorBase.java
+++ b/logback-core/src/main/java/ch/qos/logback/core/joran/JoranConfiguratorBase.java
@@ -1,7 +1,7 @@
 /**
- * Logback: the generic, reliable, fast and flexible logging framework for Java.
+ * Logback: the generic, reliable, fast and flexible logging framework.
  * 
- * Copyright (C) 2000-2007, QOS.ch
+ * Copyright (C) 2000-2009, QOS.ch
  * 
  * This library is free software, you can redistribute it and/or modify it under
  * the terms of the GNU Lesser General Public License as published by the Free
@@ -85,7 +85,7 @@
     interpreter.addImplicitAction(nestedIA);
 
     NestedBasicPropertyIA nestedSimpleIA = new NestedBasicPropertyIA();
-    nestedIA.setContext(context);
+    nestedSimpleIA.setContext(context);
     interpreter.addImplicitAction(nestedSimpleIA);
   }
 
