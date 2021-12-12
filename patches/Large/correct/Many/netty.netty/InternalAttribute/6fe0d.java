diff --git a/codec-http/src/main/java/io/netty/handler/codec/http/multipart/InternalAttribute.java b/codec-http/src/main/java/io/netty/handler/codec/http/multipart/InternalAttribute.java
index b0b034f..991100e 100644
--- a/codec-http/src/main/java/io/netty/handler/codec/http/multipart/InternalAttribute.java
+++ b/codec-http/src/main/java/io/netty/handler/codec/http/multipart/InternalAttribute.java
@@ -79,10 +79,10 @@
 
     @Override
     public boolean equals(Object o) {
-        if (!(o instanceof Attribute)) {
+        if (!(o instanceof InternalAttribute)) {
             return false;
         }
-        Attribute attribute = (Attribute) o;
+        InternalAttribute attribute = (InternalAttribute) o;
         return getName().equalsIgnoreCase(attribute.getName());
     }
 
