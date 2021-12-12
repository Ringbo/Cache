diff --git a/rt/core/src/main/java/org/apache/cxf/databinding/source/NodeDataWriter.java b/rt/core/src/main/java/org/apache/cxf/databinding/source/NodeDataWriter.java
index 30633db..662aa68 100644
--- a/rt/core/src/main/java/org/apache/cxf/databinding/source/NodeDataWriter.java
+++ b/rt/core/src/main/java/org/apache/cxf/databinding/source/NodeDataWriter.java
@@ -56,7 +56,8 @@
             XMLStreamWriter writer = new W3CDOMStreamWriter((Element)n);
             StaxUtils.copy(s, writer);
         } catch (XMLStreamException e) {
-            throw new Fault("COULD_NOT_WRITE_XML_STREAM_CAUSED_BY", LOG, e, e.getMessage());
+            throw new Fault("COULD_NOT_WRITE_XML_STREAM_CAUSED_BY", LOG, e,
+                            e.getClass().getCanonicalName(), e.getMessage());
         }
     }
 
