diff --git a/rt/core/src/main/java/org/apache/cxf/databinding/source/NodeDataReader.java b/rt/core/src/main/java/org/apache/cxf/databinding/source/NodeDataReader.java
index 7c8c496..e137e3e 100644
--- a/rt/core/src/main/java/org/apache/cxf/databinding/source/NodeDataReader.java
+++ b/rt/core/src/main/java/org/apache/cxf/databinding/source/NodeDataReader.java
@@ -66,7 +66,8 @@
             } catch (IOException e) {
                 throw new Fault("COULD_NOT_READ_XML_STREAM", LOG, e);
             } catch (TransformerException e) {
-                throw new Fault("COULD_NOT_REDA_XML_STREAM_CAUSED_BY", LOG, e, e.getMessage());
+                throw new Fault("COULD_NOT_REDA_XML_STREAM_CAUSED_BY", LOG, e,
+                                e.getClass().getCanonicalName(), e.getMessage());
             } 
         }  
         return read(input);
