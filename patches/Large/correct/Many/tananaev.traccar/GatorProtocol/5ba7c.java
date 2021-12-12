diff --git a/src/org/traccar/protocol/GatorProtocol.java b/src/org/traccar/protocol/GatorProtocol.java
index 3776bcf..3d899fa 100644
--- a/src/org/traccar/protocol/GatorProtocol.java
+++ b/src/org/traccar/protocol/GatorProtocol.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2015 Anton Tananaev (anton.tananaev@gmail.com)
+ * Copyright 2015 - 2016 Anton Tananaev (anton.tananaev@gmail.com)
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -35,7 +35,7 @@
         serverList.add(new TrackerServer(new ServerBootstrap(), this.getName()) {
             @Override
             protected void addSpecificHandlers(ChannelPipeline pipeline) {
-                pipeline.addLast("frameDecoder", new LengthFieldBasedFrameDecoder(1024, 3, 2, 1, 0));
+                pipeline.addLast("frameDecoder", new LengthFieldBasedFrameDecoder(1024, 3, 2));
                 pipeline.addLast("objectDecoder", new GatorProtocolDecoder(GatorProtocol.this));
             }
         });
