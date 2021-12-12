diff --git a/rt/core/src/main/java/org/apache/cxf/databinding/source/XMLStreamDataReader.java b/rt/core/src/main/java/org/apache/cxf/databinding/source/XMLStreamDataReader.java
index 6e992c0..21d97cb 100644
--- a/rt/core/src/main/java/org/apache/cxf/databinding/source/XMLStreamDataReader.java
+++ b/rt/core/src/main/java/org/apache/cxf/databinding/source/XMLStreamDataReader.java
@@ -139,9 +139,11 @@
         } catch (IOException e) {
             throw new Fault("COULD_NOT_READ_XML_STREAM", LOG, e);
         } catch (XMLStreamException e) {
-            throw new Fault("COULD_NOT_REDA_XML_STREAM_CAUSED_BY", LOG, e, e.getMessage());
+            throw new Fault("COULD_NOT_REDA_XML_STREAM_CAUSED_BY", LOG, e,
+                            e.getClass().getCanonicalName(), e.getMessage());
         } catch (SAXException e) {
-            throw new Fault("COULD_NOT_REDA_XML_STREAM_CAUSED_BY", LOG, e, e.getMessage());
+            throw new Fault("COULD_NOT_REDA_XML_STREAM_CAUSED_BY", LOG, e,
+                            e.getClass().getCanonicalName(), e.getMessage());
         }
     }
     
@@ -225,7 +227,8 @@
                 return new DOMSource(document);
             }
         } catch (XMLStreamException e) {
-            throw new Fault("COULD_NOT_REDA_XML_STREAM_CAUSED_BY", LOG, e, e.getMessage());
+            throw new Fault("COULD_NOT_REDA_XML_STREAM_CAUSED_BY", LOG, e,
+                            e.getClass().getCanonicalName(), e.getMessage());
         }
     }
     
