diff --git a/EventBusTest/src/de/greenrobot/event/test/EventBusMainThreadTest.java b/EventBusTest/src/de/greenrobot/event/test/EventBusMainThreadTest.java
index 2d62ab4..944dba2 100644
--- a/EventBusTest/src/de/greenrobot/event/test/EventBusMainThreadTest.java
+++ b/EventBusTest/src/de/greenrobot/event/test/EventBusMainThreadTest.java
@@ -1,5 +1,5 @@
 /*
- * Copyright (C) 2012 Markus Junginger, greenrobot (http://greenrobot.de)
+ * Copyright (C) 2012-2015 Markus Junginger, greenrobot (http://greenrobot.de)
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -116,7 +116,7 @@
                 eventQ.notifyAll();
             }
             synchronized (eventsDone) {
-                while (eventsDone.remove(event)) {
+                while (!eventsDone.remove(event)) {
                     try {
                         eventsDone.wait();
                     } catch (InterruptedException e) {
