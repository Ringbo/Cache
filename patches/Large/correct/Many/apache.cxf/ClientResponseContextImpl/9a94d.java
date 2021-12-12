diff --git a/rt/rs/client/src/main/java/org/apache/cxf/jaxrs/client/spec/ClientResponseContextImpl.java b/rt/rs/client/src/main/java/org/apache/cxf/jaxrs/client/spec/ClientResponseContextImpl.java
index 9990c85..c4aa804 100644
--- a/rt/rs/client/src/main/java/org/apache/cxf/jaxrs/client/spec/ClientResponseContextImpl.java
+++ b/rt/rs/client/src/main/java/org/apache/cxf/jaxrs/client/spec/ClientResponseContextImpl.java
@@ -39,7 +39,7 @@
     }
     
     public InputStream getEntityStream() {
-        return m.get(InputStream.class);
+        return m.getContent(InputStream.class);
     }
 
     @SuppressWarnings("unchecked")
@@ -55,7 +55,7 @@
     
     @Override
     public void setEntityStream(InputStream is) {
-        m.put(InputStream.class, is);
+        m.setContent(InputStream.class, is);
 
     }
 }
