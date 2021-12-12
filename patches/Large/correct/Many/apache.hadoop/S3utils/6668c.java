diff --git a/hadoop-ozone/s3gateway/src/main/java/org/apache/hadoop/ozone/s3/util/S3utils.java b/hadoop-ozone/s3gateway/src/main/java/org/apache/hadoop/ozone/s3/util/S3utils.java
index 8af0927..652ba7f 100644
--- a/hadoop-ozone/s3gateway/src/main/java/org/apache/hadoop/ozone/s3/util/S3utils.java
+++ b/hadoop-ozone/s3gateway/src/main/java/org/apache/hadoop/ozone/s3/util/S3utils.java
@@ -1,3 +1,21 @@
+/*
+ * Licensed to the Apache Software Foundation (ASF) under one
+ * or more contributor license agreements.  See the NOTICE file
+ * distributed with this work for additional information
+ * regarding copyright ownership.  The ASF licenses this file
+ * to you under the Apache License, Version 2.0 (the
+ * "License"); you may not use this file except in compliance
+ *  with the License.  You may obtain a copy of the License at
+ *
+ *      http://www.apache.org/licenses/LICENSE-2.0
+ *
+ * Unless required by applicable law or agreed to in writing, software
+ * distributed under the License is distributed on an "AS IS" BASIS,
+ * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
+ * See the License for the specific language governing permissions and
+ * limitations under the License.
+ *
+ */
 package org.apache.hadoop.ozone.s3.util;
 
 import org.apache.commons.codec.DecoderException;
@@ -52,7 +70,7 @@
         byte[] actualKeyBytes = Hex.decodeHex(hex);
         String digestActualKey = DigestUtils.sha256Hex(actualKeyBytes);
         if (digest.equals(digestActualKey)) {
-          return new String(actualKeyBytes);
+          return new String(actualKeyBytes, StandardCharsets.UTF_8);
         } else {
           OS3Exception ex = S3ErrorTable.newError(S3ErrorTable
               .INVALID_ARGUMENT, key);
