diff --git a/driver-core/src/main/com/mongodb/client/model/changestream/ChangeStreamDocumentCodec.java b/driver-core/src/main/com/mongodb/client/model/changestream/ChangeStreamDocumentCodec.java
index cd17a12..bc5619d 100644
--- a/driver-core/src/main/com/mongodb/client/model/changestream/ChangeStreamDocumentCodec.java
+++ b/driver-core/src/main/com/mongodb/client/model/changestream/ChangeStreamDocumentCodec.java
@@ -56,7 +56,7 @@
                 .register(changeStreamDocumentClassModel)
                 .build();
 
-        CodecRegistry registry = fromRegistries(codecRegistry, fromProviders(provider));
+        CodecRegistry registry = fromRegistries(fromProviders(provider), codecRegistry);
         this.codec = (Codec<ChangeStreamDocument<TResult>>) (Codec<? extends ChangeStreamDocument>)
                 registry.get(ChangeStreamDocument.class);
     }
