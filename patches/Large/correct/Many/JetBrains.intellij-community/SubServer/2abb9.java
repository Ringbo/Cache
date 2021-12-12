diff --git a/platform/built-in-server/src/org/jetbrains/io/SubServer.java b/platform/built-in-server/src/org/jetbrains/io/SubServer.java
index 432082c..4d20281 100644
--- a/platform/built-in-server/src/org/jetbrains/io/SubServer.java
+++ b/platform/built-in-server/src/org/jetbrains/io/SubServer.java
@@ -1,18 +1,4 @@
-/*
- * Copyright 2000-2015 JetBrains s.r.o.
- *
- * Licensed under the Apache License, Version 2.0 (the "License");
- * you may not use this file except in compliance with the License.
- * You may obtain a copy of the License at
- *
- * http://www.apache.org/licenses/LICENSE-2.0
- *
- * Unless required by applicable law or agreed to in writing, software
- * distributed under the License is distributed on an "AS IS" BASIS,
- * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
- * See the License for the specific language governing permissions and
- * limitations under the License.
- */
+// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 package org.jetbrains.io;
 
 import com.intellij.ide.XmlRpcServer;
@@ -68,7 +54,7 @@
       final XmlRpcDelegatingHttpRequestHandler handler = new XmlRpcDelegatingHttpRequestHandler(xmlRpcHandlers);
       bootstrap.childHandler(new ChannelInitializer() {
         @Override
-        protected void initChannel(Channel channel) throws Exception {
+        protected void initChannel(Channel channel) {
           channel.pipeline().addLast(channelRegistrar);
           NettyUtil.addHttpServerCodec(channel.pipeline());
           channel.pipeline().addLast(handler);
