diff --git a/api/src/main/java/org/apache/cxf/message/MessageImpl.java b/api/src/main/java/org/apache/cxf/message/MessageImpl.java
index 87c517d..7611db0 100644
--- a/api/src/main/java/org/apache/cxf/message/MessageImpl.java
+++ b/api/src/main/java/org/apache/cxf/message/MessageImpl.java
@@ -181,7 +181,7 @@
             private static final long serialVersionUID = 7067290677790419348L;
 
             public void putAll(Map<? extends String, ? extends Object> m) {
-                if (m != null) {
+                if (m != null && m.size() > 0) {
                     super.putAll(m);
                 }
             }
