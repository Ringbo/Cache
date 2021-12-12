diff --git a/rt/core/src/main/java/org/apache/cxf/databinding/source/XMLStreamDataWriter.java b/rt/core/src/main/java/org/apache/cxf/databinding/source/XMLStreamDataWriter.java
index e01e93e..9d3235f 100644
--- a/rt/core/src/main/java/org/apache/cxf/databinding/source/XMLStreamDataWriter.java
+++ b/rt/core/src/main/java/org/apache/cxf/databinding/source/XMLStreamDataWriter.java
@@ -88,7 +88,8 @@
                 StaxUtils.copy(s, writer);
             }
         } catch (XMLStreamException e) {
-            throw new Fault("COULD_NOT_WRITE_XML_STREAM_CAUSED_BY", LOG, e, e.getMessage());
+            throw new Fault("COULD_NOT_WRITE_XML_STREAM_CAUSED_BY", LOG, e,
+                            e.getClass().getCanonicalName(), e.getMessage());
         } catch (IOException e) {
             throw new Fault(new Message("COULD_NOT_WRITE_XML_STREAM", LOG), e);
         }
