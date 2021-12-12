diff --git a/rt/rs/client/src/main/java/org/apache/cxf/jaxrs/client/spec/ClientRequestContextImpl.java b/rt/rs/client/src/main/java/org/apache/cxf/jaxrs/client/spec/ClientRequestContextImpl.java
index 4ea2ac7..42450c9 100644
--- a/rt/rs/client/src/main/java/org/apache/cxf/jaxrs/client/spec/ClientRequestContextImpl.java
+++ b/rt/rs/client/src/main/java/org/apache/cxf/jaxrs/client/spec/ClientRequestContextImpl.java
@@ -93,7 +93,7 @@
     
     @Override
     public OutputStream getEntityStream() {
-        return m.get(OutputStream.class);
+        return m.getContent(OutputStream.class);
     }
 
     @Override
@@ -144,7 +144,7 @@
 
     @Override
     public void setEntityStream(OutputStream os) {
-        m.put(OutputStream.class, os);
+        m.setContent(OutputStream.class, os);
 
     }
 
