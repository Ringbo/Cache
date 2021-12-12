diff --git a/codec-http/src/main/java/io/netty/handler/codec/http/multipart/HttpPostRequestDecoder.java b/codec-http/src/main/java/io/netty/handler/codec/http/multipart/HttpPostRequestDecoder.java
index eadb9ce..28fc992 100644
--- a/codec-http/src/main/java/io/netty/handler/codec/http/multipart/HttpPostRequestDecoder.java
+++ b/codec-http/src/main/java/io/netty/handler/codec/http/multipart/HttpPostRequestDecoder.java
@@ -788,7 +788,7 @@
             if (currentAttribute == null) {
                 try {
                     currentAttribute = factory.createAttribute(request,
-                            decodeAttribute(nameAttribute.getValue(), charset));
+                            cleanString(nameAttribute.getValue()));
                 } catch (NullPointerException e) {
                     throw new ErrorDataDecoderException(e);
                 } catch (IllegalArgumentException e) {
@@ -963,8 +963,7 @@
                         Attribute attribute;
                         try {
                             attribute = factory.createAttribute(request,
-                                    decodeAttribute(values[0].trim(), charset),
-                                    decodeAttribute(cleanString(values[1]), charset));
+                                    cleanString(values[0]), values[1]);
                         } catch (NullPointerException e) {
                             throw new ErrorDataDecoderException(e);
                         } catch (IllegalArgumentException e) {
@@ -1024,8 +1023,7 @@
                             Attribute attribute;
                             try {
                                 attribute = factory.createAttribute(request,
-                                        decodeAttribute(contents[0].trim(), charset),
-                                        decodeAttribute(cleanString(contents[i]), charset));
+                                        cleanString(contents[0]), contents[i]);
                             } catch (NullPointerException e) {
                                 throw new ErrorDataDecoderException(e);
                             } catch (IllegalArgumentException e) {
@@ -1126,8 +1124,7 @@
             }
             try {
                 currentFileUpload = factory.createFileUpload(request,
-                        decodeAttribute(nameAttribute.getValue(), charset),
-                        decodeAttribute(filenameAttribute.getValue(), charset),
+                        cleanString(nameAttribute.getValue()), cleanString(filenameAttribute.getValue()),
                         contentTypeAttribute.getValue(), mechanism.value(), localCharset,
                         size);
             } catch (NullPointerException e) {
