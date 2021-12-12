diff --git a/java/org/apache/catalina/tribes/ByteMessage.java b/java/org/apache/catalina/tribes/ByteMessage.java
index b082854..02ca876 100644
--- a/java/org/apache/catalina/tribes/ByteMessage.java
+++ b/java/org/apache/catalina/tribes/ByteMessage.java
@@ -86,7 +86,7 @@
     public void readExternal(ObjectInput in ) throws IOException {
         int length = in.readInt();
         message = new byte[length];
-        in.read(message,0,length);
+        in.readFully(message);
     }
 
     /**
