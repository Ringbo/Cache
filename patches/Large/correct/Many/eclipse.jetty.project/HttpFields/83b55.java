diff --git a/jetty-http/src/main/java/org/eclipse/jetty/http/HttpFields.java b/jetty-http/src/main/java/org/eclipse/jetty/http/HttpFields.java
index c2332fa..6e326ba 100644
--- a/jetty-http/src/main/java/org/eclipse/jetty/http/HttpFields.java
+++ b/jetty-http/src/main/java/org/eclipse/jetty/http/HttpFields.java
@@ -826,7 +826,7 @@
         if (value != null && value.length() > 0)
             QuotedStringTokenizer.quoteIfNeeded(buf, value, delim);
 
-        if (version!=0)
+        if (version>0)
             buf.append(";Version=").append(version);
 
         if (path != null && path.length() > 0)
